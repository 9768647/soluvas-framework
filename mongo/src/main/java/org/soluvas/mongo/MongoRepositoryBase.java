package org.soluvas.mongo;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Nullable;
import javax.annotation.PreDestroy;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soluvas.commons.Email;
import org.soluvas.commons.Identifiable;
import org.soluvas.commons.SchemaVersionable;
import org.soluvas.commons.Timestamped;
import org.soluvas.commons.impl.EmailImpl;
import org.soluvas.commons.impl.PersonImpl;
import org.soluvas.commons.util.Profiled;
import org.soluvas.data.DataException;
import org.soluvas.data.domain.Page;
import org.soluvas.data.domain.PageImpl;
import org.soluvas.data.domain.Pageable;
import org.soluvas.data.domain.Projection;
import org.soluvas.data.domain.Sort;
import org.soluvas.data.domain.Sort.Direction;
import org.soluvas.data.repository.CrudRepository;
import org.soluvas.data.repository.PagingAndSortingRepository;
import org.soluvas.data.repository.PagingAndSortingRepositoryBase;

import com.google.code.morphia.Morphia;
import com.google.code.morphia.mapping.DefaultCreator;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.collect.Collections2;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.mongodb.BasicDBObject;
import com.mongodb.BulkWriteOperation;
import com.mongodb.BulkWriteResult;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.ReadPreference;
import com.mongodb.WriteResult;

/**
 * {@link PagingAndSortingRepository} implemented using MongoDB, with {@link SchemaVersionable} support.
 * <p>{@link SchemaVersionable#getSchemaVersion()} is <b>not</b> used for filtering documents,
 * because this will complicate structure of indexes and ad-hoc queries. The recommended approach
 * for schema migration with UUID as IDs, and no formalId/slug, is:
 * <ol>
 * 	<li>Rename the current collection to "old" collection.</li>
 * 	<li>Create the 'new' collection, so it's usable immediately, albeit empty.</li> 
 * 	<li>Move all current documents from 'old' collection to 'new' collection.</li> 
 * 	<li>Migrate old documents from 'old' collection to 'new' collection.</li> 
 * 	<li>Delete 'old' collection</li>
 * </ol>
 * <p>For entities with formalId/slug/non-UUID IDs, use in-place migration. However
 * the application should handle occasional errors due to schema mismatch. 
 * @author ceefour
 */
public class MongoRepositoryBase<T extends Identifiable> extends PagingAndSortingRepositoryBase<T, String>
	implements MongoRepository<T> {
	
	public class DBObjectToEntity implements Function<DBObject, T> {
		@Override
		public T apply(DBObject input) {
			if (input == null)
				return null;
			try {
				return morphia.fromDBObject(implClass, input);
			} catch (Exception e) {
				throw new MongoRepositoryException(e,
						"%s: Cannot deserialize MongoDB object to %s: %s",
								db.getName(), entityClass.getName(), input);
			}
		}
	}

	public class EntityToDBObject implements Function<T, DBObject> {
		@Override @Nullable
		public DBObject apply(@Nullable T entity) {
			return morphia.toDBObject(entity);
		}
	}
	
	/**
	 * Closure used by {@link MongoRepositoryBase#findPrimary(DBObject, DBObject, DBObject, long, long, CursorFunction, String, Object...)}
	 * and {@link MongoRepositoryBase#findPrimary(DBObject, DBObject, DBObject, long, long, CursorFunction, String, Object...)}
	 * to process {@link DBCursor}.
	 * @author rudi
	 *
	 * @param <R>
	 */
	protected interface CursorFunction<R> {
		/**
		 * @param cursor This cursor will be {@link Closeable#close()}d by {@link MongoRepositoryBase}.
		 * @return
		 * @throws Exception
		 */
		R apply(DBCursor cursor) throws Exception;
	}
	
	/**
	 * Determines which {@link MongoClient}s will be used by this repository.
	 * @author ceefour
	 */
	protected enum ReadPattern {
		/**
		 * Only use a {@link MongoClient} with {@link ReadPreference#primary()}.
		 * This is seldom used, and has better data consistency.
		 * But if you use this, you probably want to use an ACID database (such as RDBMS or Neo4j) instead of MongoDB.
		 * Both {@link MongoRepositoryBase#primary} and {@link MongoRepositoryBase#secondary} use this {@link MongoClient}.
		 */
		PRIMARY,
		/**
		 * Only use a {@link MongoClient} with {@link ReadPreference#secondaryPreferred()}.
		 * Used for some repositories that does not need consistency even for {@link CrudRepository#findOne(java.io.Serializable)}.
		 * Both {@link MongoRepositoryBase#primary} and {@link MongoRepositoryBase#secondary} use this {@link MongoClient}.
		 */
		SECONDARY_PREFERRED,
		/**
		 * <ul>
		 * 	<li>{@link MongoRepositoryBase#primary} uses a {@link MongoClient} with {@link ReadPreference#primary()},
		 * 		which is especially used by {@link CrudRepository#findOne(java.io.Serializable)}.</li>
		 * 	<li>{@link MongoRepositoryBase#secondary} uses a {@link MongoClient} with {@link ReadPreference#secondaryPreferred()}</li>
		 * </ol>
		 * Typically used for most repositories.
		 */
		DUAL
	}

	public static final String SCHEMA_VERSION_FIELD = "schemaVersion";
	protected final Logger log;
	/**
	 * Please use the {@code protected} {@link MongoRepositoryBase} methods.
	 */
	@Deprecated
	protected final DBCollection primary;
	/**
	 * Please use the {@code protected} {@link MongoRepositoryBase} methods.
	 */
	@Deprecated
	protected final DBCollection secondary;
	protected Morphia morphia;
	/**
	 * Slow query threshold in milliseconds.
	 */
	protected static final long SLOW_QUERY_THRESHOLD = 500;
	/**
	 * Usually used by {@link #beforeSave(Identifiable, org.soluvas.data.repository.CrudRepository.ModificationTimePolicy)} to set creationTime and modificationTime
	 * based on default time zone.
	 * TODO: Should use user's time zone (i.e. audit system).  
	 */
	protected static final DateTimeZone timeZone = DateTimeZone.forID("Asia/Jakarta");
	protected final String collName;
	protected final Class<T> entityClass;
	protected final Class<? extends T> implClass;
	protected long currentSchemaVersion;
	protected final String mongoUri;
	protected final boolean migrationEnabled;
	protected final boolean autoExplainSlow;
	protected final DB db;

	/**
	 * @param intfClass
	 * @param currentSchemaVersion e.g. {@link PersonImpl#CURRENT_SCHEMA_VERSION}.
	 * @param mongoUri
	 * @param readPattern
	 * @param collName
	 * @param migrationEnabled
	 * @param autoExplainSlow
	 * @param indexes
	 */
	public MongoRepositoryBase(Class<T> intfClass, Class<? extends T> implClass, long currentSchemaVersion, 
			String mongoUri, ReadPattern readPattern, String collName, boolean migrationEnabled, boolean autoExplainSlow,
			Index... indexes) {
		super();
		this.entityClass = intfClass;
		this.implClass = implClass;
		this.currentSchemaVersion = currentSchemaVersion;
		this.mongoUri = mongoUri;
		this.collName = collName;
		this.migrationEnabled = migrationEnabled;
		this.autoExplainSlow = autoExplainSlow;
		// WARNING: mongoUri may contain password!
		final MongoClientURI realMongoUri = new MongoClientURI(mongoUri);
		this.log = LoggerFactory.getLogger(getClass().getName() + "/" + realMongoUri.getDatabase() + "/" + collName + "/" + currentSchemaVersion);
		log.info("Connecting to MongoDB database {}/{} {} as {} for {}",
				realMongoUri.getHosts(), realMongoUri.getDatabase(), readPattern, realMongoUri.getUsername(), collName);
		try {
			switch (readPattern) {
			case PRIMARY:
				final DB primDb = MongoUtils.getDb(realMongoUri, ReadPreference.primary());
				db = primDb;
				Preconditions.checkState(primDb.getMongo().getReadPreference() == ReadPreference.primary(),
						"Expected ReadPreference '%s' but got '%s' for Mongo primDb %s",
						ReadPreference.primary(), primDb.getMongo().getReadPreference(), primDb.getMongo());
				primary = primDb.getCollection(collName);
				secondary = primary;
				break;
			case SECONDARY_PREFERRED:
				final DB spDb = MongoUtils.getDb(realMongoUri, ReadPreference.secondaryPreferred());
				db = spDb;
				Preconditions.checkState(spDb.getMongo().getReadPreference() == ReadPreference.secondaryPreferred(),
						"Expected ReadPreference '%s' but got '%s' for Mongo spDb %s",
						ReadPreference.secondaryPreferred(), spDb.getMongo().getReadPreference(), spDb.getMongo());
				secondary = spDb.getCollection(collName);
				primary = secondary;
				break;
			case DUAL:
				final DB primaryDb = MongoUtils.getDb(realMongoUri, ReadPreference.primary());
				db = primaryDb;
				Preconditions.checkState(primaryDb.getMongo().getReadPreference() == ReadPreference.primary(),
						"Expected ReadPreference '%s' but got '%s' for Mongo primaryDb %s",
						ReadPreference.primary(), primaryDb.getMongo().getReadPreference(), primaryDb.getMongo());
				primary = primaryDb.getCollection(collName);
				final DB secondaryDb = MongoUtils.getDb(realMongoUri, ReadPreference.secondaryPreferred());
				Preconditions.checkState(secondaryDb.getMongo().getReadPreference() == ReadPreference.secondaryPreferred(),
						"Expected ReadPreference '%s' but got '%s' for Mongo secondaryDb %s",
						ReadPreference.secondaryPreferred(), secondaryDb.getMongo().getReadPreference(), secondaryDb.getMongo());
				secondary = secondaryDb.getCollection(collName);
				break;
			default:
				throw new MongoRepositoryException("Unknown readPattern: " + readPattern);
			}
			morphia = new Morphia();
			morphia.map(implClass);
			morphia.getMapper().getOptions().objectFactory = new DefaultCreator() {
				@Override
				public Object createInstance(Class clazz, DBObject dbObj) {
					// TODO: Do not hardcode
					if (clazz == Email.class) {
						return new EmailImpl();
					}
					return super.createInstance(clazz, dbObj);
				}
			};
		} catch (Exception e) {
			throw new MongoRepositoryException(e, "Cannot connect to MongoDB %s/%s as %s for %s repository",
					realMongoUri.getHosts(), realMongoUri.getDatabase(), realMongoUri.getUsername(),
					collName);
		}
		if (migrationEnabled) {
			log.info("Migrating collection {}...", collName);
			beforeEnsureIndexes();
		} else {
			log.debug("Migration disabled for collection {}", collName);
		}
		final List<String> ensuredIndexes = MongoUtils.ensureIndexes(primary, indexes);
		MongoUtils.retainIndexes(primary, ensuredIndexes.toArray(new String[] {}));
	}
	
	private static Index[] indexedFieldMapToIndexes(Map<String, Integer> indexedFields) {
		final List<Index> indexes = new ArrayList<>();
		for (final Map.Entry<String, Integer> indexedField : indexedFields.entrySet()) {
			indexes.add(indexedField.getValue() == 1 ? Index.asc(indexedField.getKey()) : Index.desc(indexedField.getKey()));
		}
		return indexes.toArray(new Index[] {});
	}
	
	/**
	 * @param intfClass
	 * @param currentSchemaVersion e.g. {@link PersonImpl#CURRENT_SCHEMA_VERSION}.
	 * @param mongoUri
	 * @param readPattern
	 * @param collName
	 * @param uniqueFields
	 * @param migrationEnabled
	 * @param autoExplainSlow
	 * @param indexes
	 * @deprecated Use {@link #MongoRepositoryBase(Class, Class, long, String, ReadPattern, String, boolean, boolean, Index...)}
	 */
	@Deprecated
	public MongoRepositoryBase(Class<T> intfClass, Class<? extends T> implClass, long currentSchemaVersion, 
			String mongoUri, ReadPattern readPattern, String collName, List<String> uniqueFields, boolean migrationEnabled, boolean autoExplainSlow,
			Index... indexes) {
		this(intfClass, implClass, currentSchemaVersion, mongoUri, readPattern, collName, migrationEnabled, autoExplainSlow,
				mergeUniquesAndIndexes(uniqueFields, indexes));
	}
	
	@Deprecated
	private static Index[] mergeUniquesAndIndexes(List<String> uniqueFields, Index... indexes) {
		final FluentIterable<Index> uniques = FluentIterable.from(uniqueFields != null ? uniqueFields : ImmutableList.<String>of())
				.transform(new Function<String, Index>() {
			@Override
			public Index apply(String input) {
				return Index.uniqueAsc(input);
			}
		});
		return Iterables.toArray(Iterables.concat(uniques, Arrays.asList(indexes)), Index.class);
	}

	/**
	 * @param intfClass
	 * @param currentSchemaVersion e.g. {@link PersonImpl#CURRENT_SCHEMA_VERSION}.
	 * @param mongoUri
	 * @param collName
	 * @param indexedFields
	 */
	@Deprecated
	public MongoRepositoryBase(Class<T> intfClass, Class<? extends T> implClass, long currentSchemaVersion, 
			String mongoUri, ReadPattern readPattern, String collName, List<String> uniqueFields, Map<String, Integer> indexedFields,
			boolean migrationEnabled) {
		this(intfClass, implClass, currentSchemaVersion, mongoUri, readPattern, collName, uniqueFields, migrationEnabled, false,
				indexedFieldMapToIndexes(indexedFields));
	}

	/**
	 * @param intfClass
	 * @param currentSchemaVersion e.g. {@link PersonImpl#CURRENT_SCHEMA_VERSION}.
	 * @param mongoUri
	 * @param collName
	 * @param indexedFields
	 */
	@Deprecated
	public MongoRepositoryBase(Class<T> intfClass, Class<? extends T> implClass, long currentSchemaVersion, 
			String mongoUri, ReadPattern readPattern, String collName, List<String> uniqueFields, Map<String, Integer> indexedFields,
			boolean migrationEnabled, boolean autoExplainSlow) {
		this(intfClass, implClass, currentSchemaVersion, mongoUri, readPattern, collName, uniqueFields, migrationEnabled, autoExplainSlow,
				indexedFieldMapToIndexes(indexedFields));
	}

	@Deprecated
	public MongoRepositoryBase(Class<T> entityClass, String mongoUri, String collName, String[] indexedFields) {
		super();
		this.entityClass = entityClass;
		this.implClass = entityClass;
		this.currentSchemaVersion = 1L;
		this.mongoUri = mongoUri;
		this.collName = collName;
		this.migrationEnabled = true;
		this.autoExplainSlow = false;
		// WARNING: mongoUri may contain password!
		final MongoClientURI realMongoUri = new MongoClientURI(mongoUri);
		this.log = LoggerFactory.getLogger(getClass().getName() + "/" + realMongoUri.getDatabase() + "/" + collName);
		log.info("Connecting to MongoDB database {}/{} as {} for {}",
				realMongoUri.getHosts(), realMongoUri.getDatabase(), realMongoUri.getUsername(), collName);
		try {
			db = MongoUtils.getDb(realMongoUri, ReadPreference.primary());
			primary = db.getCollection(collName);
			secondary = primary;
			morphia = new Morphia();
		} catch (Exception e) {
			throw new MongoRepositoryException(e, "Cannot connect to MongoDB %s/%s as %s for %s repository",
					realMongoUri.getHosts(), realMongoUri.getDatabase(), realMongoUri.getUsername(),
					collName);
		}
		beforeEnsureIndexes();
		log.debug("Ensuring {} indexes on {}: {}", indexedFields.length, collName, indexedFields);
		for (String field : indexedFields) {
			primary.createIndex(new BasicDBObject(field, 1));
		}
	}
	

	public boolean isMigrationEnabled() {
		return migrationEnabled;
	}
	
	/**
	 * Automatically {@link DBCursor#explain()}s slow queries.
	 * @return
	 */
	public boolean isAutoExplainSlow() {
		return autoExplainSlow;
	}

	/**
	 * If {@link #migrationEnabled} is {@true}, called by constructor after connection and authentication but 
	 * before calling {@link MongoUtils#ensureUnique(DBCollection, String...)} and {@link MongoUtils#ensureIndexes(DBCollection, Map)}.
	 * Useful if you want to migrate data or reslug.
	 */
	protected void beforeEnsureIndexes() {
	}

	@PreDestroy
	public final void destroy() {
		log.info("Shutting down {} MongoDB repository", collName);
		// DO NOT CALL THIS: mongoClient.close();
		/**
		 * [11:38 PM, 12/6/2017] Boss Hendy Bippo: kynya karena mongoClient itu dipake rame2 oleh MongoRepository yang lain. mohon tambahkan commentnya biar lebih jleas 
		 */
	}

	@Override
	public final Page<T> findAll(Pageable pageable) {
		final long total = secondary.count(new BasicDBObject());
		final BasicDBObject sortQuery = MongoUtils.getSort(pageable.getSort(), "modificationTime", Sort.Direction.DESC);
		try {
			log.debug("findAll sort={} skip={} limit={} on {}",
					sortQuery, pageable.getOffset(), pageable.getPageSize(), entityClass);
			final List<T> entities = findSecondary(null, null, sortQuery, pageable.getOffset(), pageable.getPageSize(), "findAll");
			return new PageImpl<>(entities, pageable, total);
		} catch (Exception e) {
			throw new MongoRepositoryException(e, "%s: Cannot findAll %s sort=%s skip=%s limit=%s on %s",
					db.getName(), collName, sortQuery, pageable.getOffset(), pageable.getPageSize(), entityClass);
		}
	}

	@Override
	public final Page<T> findAllFields(@Nullable Projection projection, Pageable pageable) {
		final long total = secondary.count(new BasicDBObject());
		final BasicDBObject sortQuery = MongoUtils.getSort(pageable.getSort(), "modificationTime", Sort.Direction.DESC);
		try {
			log.debug("findAll projection={} sort={} skip={} limit={} on {}",
					projection, sortQuery, pageable.getOffset(), pageable.getPageSize(), entityClass);
			final List<T> entities = findSecondary(null, getProjectionDBObject(projection),
					sortQuery, pageable.getOffset(), pageable.getPageSize(), "findAllFields", projection);
			return new PageImpl<>(entities, pageable, total);
		} catch (Exception e) {
			throw new MongoRepositoryException(e, "%s: Cannot findAll %s projection=%s sort=%s skip=%s limit=%s on %s",
					db.getName(), collName, projection, sortQuery, pageable.getOffset(), pageable.getPageSize(), entityClass);
		}
	}

	/* (non-Javadoc)
	 * @see org.soluvas.data.repository.BasicRepository#count()
	 */
	@Override
	public final long count() {
		return secondary.count();
	}
	
	/* (non-Javadoc)
	 * @see org.soluvas.data.repository.CrudRepositoryBase#getId(java.lang.Object)
	 */
	@Override @Nullable
	protected final String getId(T entity) {
		return entity.getId();
	}

	/**
	 * @see org.soluvas.data.repository.PagingAndSortingRepositoryBase#add(java.util.Collection)
	 * @throws MongoRepositoryException
	 */
	@Override
	public <S extends T> Collection<S> add(Collection<S> entities) {
		if (entities.isEmpty()) {
			log.debug("Not adding empty list of {} documents", collName);
			return ImmutableList.of();
		}
		beforeSave(entities, ModificationTimePolicy.UPDATE);
		final Collection<String> transformedAsIds = Collections2.transform(entities, new IdFunction());
		final List<String> ids;
		try {
			ids = ImmutableList.copyOf(transformedAsIds);
		} catch (Exception e1) {
			throw new DataException(e1, "In colName '%s' and dbName '%s' --> Make sure all of the entities have valid 'id': %s",
					collName, db.getName(), transformedAsIds);
		}
		log.debug("Adding {} {} documents: {}", entities.size(), collName, ids);
		String dbObjsStr = "";
		try (Profiled p = new Profiled(log, "Added " + entities.size() + " " + collName + " documents: " + ids)) {
			final List<DBObject> dbObjs = ImmutableList.copyOf(Collections2
					.transform(entities, new EntityToDBObject()));
			beforeSaveDBObjects(dbObjs, ModificationTimePolicy.UPDATE);
			dbObjsStr = dbObjs.toString();
			primary.insert(dbObjs);
			log.info("Added {} {} documents: {}", entities.size(), collName, ids);
			return ImmutableList.copyOf(entities);
		} catch (Exception e) {
			throw new MongoRepositoryException(e, "Cannot add %s %s documents: %s", entities.size(), collName, ids);
		}
	}
	
	/**
	 * Override this method to perform additional checks/operations before adding/modifying an entity.
	 * setCreationTime and setModificationTime is already handled if entity implements
	 * {@link Timestamped}.
	 * @param entity
	 * @param mtimePolicy
	 */
	protected void beforeSave(T entity, org.soluvas.data.repository.CrudRepository.ModificationTimePolicy mtimePolicy) {
		if (entity instanceof Timestamped) {
			final Timestamped timestamped = (Timestamped) entity;
			if (timestamped.getCreationTime() == null) {
				timestamped.setCreationTime(new DateTime(timeZone));
			}
			if (mtimePolicy == ModificationTimePolicy.UPDATE || timestamped.getModificationTime() == null) {
				timestamped.setModificationTime(new DateTime(timeZone));
			}
		}
	}

	protected final void beforeSave(Collection<? extends T> entities, org.soluvas.data.repository.CrudRepository.ModificationTimePolicy mtimePolicy) {
		for (T entity : entities) {
			beforeSave(entity, mtimePolicy);
		}
	}

	/**
	 * Override this method to perform additional checks/operations before adding/modifying an entity
	 * after it's been converted to {@link DBObject}.
	 * @param obj
	 */
	protected void beforeSaveDBObject(DBObject obj, ModificationTimePolicy mtimePolicy) {
	}

	protected final void beforeSaveDBObjects(Collection<DBObject> objs, ModificationTimePolicy mtimePolicy) {
		for (final DBObject obj : objs) {
			beforeSaveDBObject(obj, mtimePolicy);
		}
	}
	
	@Override
	public <S extends T> Collection<S> modify(Map<String, S> entities, ModificationTimePolicy mtimePolicy) {
		if (entities.isEmpty()) {
			log.debug("Not modifying empty list of {} documents", collName);
			return ImmutableList.of();
		}
		log.debug("Modifying {} {} documents: {}", entities.size(), collName, entities.keySet());
		beforeSave(entities.values(), mtimePolicy);
		
		if (entities.size() <= 1) {
			// use normal update
			final String entityId = Iterables.getOnlyElement(entities.keySet());
			final S entity = Iterables.getOnlyElement(entities.values());
			final DBObject dbo = new EntityToDBObject().apply(entity);
			beforeSaveDBObject(dbo, mtimePolicy);
			try {
				primary.update(new BasicDBObject("_id", entityId), dbo);
				log.info("Modified {} document '{}'", collName, entityId);
				return ImmutableList.of(entity);
			} catch (Exception e) {
				throw new MongoRepositoryException(e,
						"%s: Cannot modify %s documents '%s'", db.getName(), collName, entityId);
			}
		} else {
			// bulk update (requires MongoDB ≥ 2.6)
			final ImmutableList.Builder<S> modifiedb = ImmutableList.builder();
			final BulkWriteOperation bulk = primary.initializeUnorderedBulkOperation();
			for (final Map.Entry<String, S> entry : entities.entrySet()) {
				final S entity = entry.getValue();
				final DBObject dbo = new EntityToDBObject().apply(entity);
				beforeSaveDBObject(dbo, mtimePolicy);
				bulk.find(new BasicDBObject("_id", entry.getKey())).replaceOne(dbo);
				modifiedb.add(entity);
			}
			final BulkWriteResult writeResult = bulk.execute();
			log.info("Matched {}, modified {} of {} {} documents: {}", 
					writeResult.getMatchedCount(), writeResult.getModifiedCount(), entities.size(), collName, entities.keySet());
			return modifiedb.build();
		}
	}

	/**
	 * @deprecated Use {@link #modify(Map, org.soluvas.data.repository.CrudRepository.ModificationTimePolicy)}
	 */
	@Deprecated
	@Override
	public <S extends T> Collection<S> modify(Map<String, S> entities) {
		return modify(entities, ModificationTimePolicy.UPDATE);
	}
	
	@Override
	public final <S extends T> S modify(String id, S entity, ModificationTimePolicy mtimePolicy) {
		return modify(ImmutableMap.of(id, entity), mtimePolicy).iterator().next();
	}

	@Override
	public final Set<String> exists(final Collection<String> ids) {
		log.debug("Checking existence of {} {}: {}", ids.size(), collName, ids);
		return findPrimary(new BasicDBObject("_id", new BasicDBObject("$in", ids)), new BasicDBObject("_id", 1), null, 0, 0, new CursorFunction<Set<String>>() {
			@Override
			public Set<String> apply(DBCursor cursor) throws Exception {
				final Set<String> existed = ImmutableSet.copyOf(Iterables.transform(cursor, new Function<DBObject, String>() {
					@Override @Nullable
					public String apply(@Nullable DBObject input) {
						return (String) input.get("_id");
					}
				}));
				log.info("Found {} out of {} existing {}: {}, checked: {}",
						existed.size(), ids.size(), collName, existed, ids);
				return existed;
			}
		}, "exists", ids);
	}

	/**
	 * Used by {@link #findOne(java.io.Serializable)}, so this must use the {@link #primary} client.
	 * @param ids
	 * @param sort
	 * @return
	 */
	@Override
	public final List<T> findAll(Collection<String> ids, Sort sort) {
		Preconditions.checkNotNull(ids, "ids must be provided");
		final BasicDBObject sortQuery = MongoUtils.getSort(sort, "_id", Direction.ASC);
		log.trace("finding {} {} sort by {}: {}", ids.size(), collName, sort, Iterables.limit(ids, 10));
		final List<T> entities;
		if (ids.size() == 1) {
			// special case, for better debugging
			final String id = ids.iterator().next();
			entities = ImmutableList.copyOf(Optional.fromNullable(
					findOnePrimaryAsEntity(new BasicDBObject("_id", id), null, "findOne", id)).asSet());
			if (!entities.isEmpty()) {
				log.debug("findOne {} by _id '{}' returned that document", collName, id);  
			} else {
				log.trace("findOne {} by _id '{}' returned nothing", collName, id);
			}
		} else {
			final BasicDBObject idsQuery = new BasicDBObject("_id", new BasicDBObject("$in", ids));
			entities = findPrimary(idsQuery, null, sortQuery, 0, 0, "findAll", ids, sort);
			if (ids.size() > 1 || ids.size() != entities.size()) {
				log.debug("find {} {} by _id ({}) returned {} documents", 
						ids.size(), collName, Iterables.limit(ids, 10), entities.size());  
			}
		}
		return entities;
	}

	@Override
	public final long deleteIds(Collection<String> ids) {
		log.debug("Deleting {} {}: {}", ids.size(), collName, ids);
		try {
			final WriteResult result = primary.remove(new BasicDBObject("_id", new BasicDBObject("$in", ids)));
			log.info("Deleted {} out of {} {} ({})", result.getN(), ids.size(), collName, ids);
			return result.getN();
		} catch (Exception e) {
			throw new MongoRepositoryException(e, "%s: Cannot delete %s %s", db.getName(), collName, ids);
		}
	}

	@Override
	public final Page<String> findAllIds(Pageable pageable) {
		final BasicDBObject query = new BasicDBObject();
		final long total = secondary.count(query);
		final BasicDBObject sortQuery = MongoUtils.getSort(pageable.getSort(), "_id", Direction.ASC);
		final List<String> entityIds = findSecondary(query, new BasicDBObject("_id", true),
				sortQuery, pageable.getOffset(), pageable.getPageSize(), new Function<DBObject, String>() {
			@Override @Nullable
			public String apply(@Nullable DBObject input) {
				return (String) input.get("_id");
			}
		}, "findAllIds");
		return new PageImpl<>(entityIds, pageable, total);
	}
	
	/**
	 * @deprecated Use {@link #countByQuery(DBObject)}
	 */
	@Deprecated
	@Override
	public long countByQuery(DBObject query) {
		final long total = secondary.count(query);
		log.debug("Got count {} by query {}", total, query);
		return total;
	}
	
	@Override
	public long countByQuery(ReadPreference readPref, DBObject query, String method, Object... params) {
		final long total = primary.count(query, readPref);
		log.debug("Counted {} by query {} {} for {} {}", total, query, readPref, method, params);
		return total;
	}
	
	@Override
	public Page<T> findAllByQuery(DBObject query, Pageable pageable) {
		final BasicDBObject sortQuery = MongoUtils.getSort(pageable.getSort(), "modificationTime", Sort.Direction.DESC);
		log.debug("findAllByQuery {} {} sort {} skip {} limit {}",
				collName, query, sortQuery, pageable.getOffset(), pageable.getPageSize());
		final long total = secondary.count(query);
		final List<T> entities = findSecondary(query, null, sortQuery, pageable.getOffset(), pageable.getPageSize(), "findAllByQuery");
		log.debug("findAllByQuery {} {} returned {} out of {} documents, sort {} skip {} limit {}",
				collName, query, entities.size(), total, sortQuery, pageable.getOffset(), pageable.getPageSize());
		return new PageImpl<>(entities, pageable, total);		
	}

	protected DBObject findDBObjectByQuery(DBObject query, DBObject fields) {
		log.trace("findDBObjectByQuery {} {}", collName, query, fields);
		final DBObject dbo = secondary.findOne(query, fields);
		log.trace("findDBObjectByQuery {} {} {} returned {}",
				collName, query, fields, dbo != null ? dbo.get("_id") : null);
		return dbo;
	}

	@Override
	public T findOneByQuery(DBObject upQuery) {
		final DBObject dbo = findDBObjectByQuery(upQuery, null);
		final T entity = new DBObjectToEntity().apply(dbo);
		return entity;
	}
	
	/**
	 * @param coll
	 * @param query
	 * @param fields
	 * @param sort
	 * @param skip 0 means no skip (obviously)
	 * @param limit 0 means no limit.
	 * @param func
	 * @param methodName
	 * @param params {@code Object[]} is used instead of {@link List} because {@link ImmutableList} does not accept {@code null} values.
	 * @return
	 */
	private <R> R doFindClient(DBCollection coll, @Nullable DBObject query, @Nullable DBObject fields, @Nullable DBObject sort, long skip, long limit,
			CursorFunction<R> func, String methodName, @Nullable Object... params) {
		final long startTime = System.currentTimeMillis();
		final String methodSignature = getClass().getSimpleName() + "." + methodName + "(" + (params != null ? Joiner.on(", ").skipNulls().join(params) : "") + ")";
		log.trace("Find {} {} {} fields={} sort={} page={}/{} for method {}… db.{}.find({}, {}).sort({}).skip({}).limit({})",
				coll.getDB().getMongo().getReadPreference(), collName, query, fields, sort, skip, limit, methodSignature,
				collName, query, fields, sort, skip, limit);
		Integer cursorSize = null;
		try (final DBCursor cursor = coll.find(query, fields).addSpecial("$comment", Thread.currentThread().getName() + ": " + methodSignature)
			.sort(sort).skip((int) skip).limit((int) limit)) {
			final R applied = func.apply(cursor);
			cursorSize = cursor.size();

			// only check SLOW_QUERY_THRESHOLD if query succeeds
			final long duration = System.currentTimeMillis() - startTime;
			if (duration > SLOW_QUERY_THRESHOLD) {
				if (autoExplainSlow) {
					try {
						final DBObject explain = coll.find(query, fields).addSpecial("$comment", Thread.currentThread().getName() + ": " + methodSignature)
							.sort(sort).skip((int) skip).limit((int) limit).explain();
						final int n = (int) explain.get("n");
						final int nscanned = (int) explain.get("nscannedAllPlans");
						final int efficiency = nscanned > 0 ? n * 100 / nscanned : 100;
						final int millis = (int) explain.get("millis");
						log.warn("Slow find {} {} {} fields={} sort={} page={}/{} for method {} size {} took {}ms (DB scanned {} to get {} for {}ms, {}% efficiency).\n"
								+ "db.{}.find({}, {}).sort({}).skip({}).limit({}).explain() >>\n"
								+ "{}",
								coll.getDB().getMongo().getReadPreference(), collName, query, fields, sort, skip, limit, methodSignature, cursorSize, duration,
								nscanned, n, millis, efficiency, collName, query, fields, sort, skip, limit, explain);
					} catch (Exception e) {
						log.warn(String.format("Slow find %s %s %s fields=%s sort=%s page=%s/%s for method %s size %s took %sms. explain() throws error",
								coll.getDB().getMongo().getReadPreference(), collName, query, fields, sort, skip, limit, methodSignature, cursorSize, duration),
								e);
					}
				} else {
					log.warn("Slow find {} {} {} fields={} sort={} page={}/{} for method {} size {} took {}ms",
							coll.getDB().getMongo().getReadPreference(), collName, query, fields, sort, skip, limit, methodSignature, cursorSize, duration);
				}
			}
			
			return applied;
		} catch (Exception e) {
			throw new MongoRepositoryException(e, "%s: Cannot find %s %s %s fields=%s sort=%s page=%s/%s for method %s: %s",
					db.getName(), coll.getDB().getMongo().getReadPreference(), collName, query, fields, sort, skip, limit, methodSignature, e);
		}
	}

	/**
	 * @param coll
	 * @param query
	 * @param fields
	 * @param sort
	 * @param skip
	 * @param limit 0 means no limit.
	 * @param func Must not return {@code null}!
	 * @param methodName
	 * @param params
	 * @return Important: It may not contain {@code null} elements!
	 */
	private <R> ImmutableList<R> doFindClient(DBCollection coll, @Nullable DBObject query, @Nullable DBObject fields, @Nullable DBObject sort, long skip, long limit,
			final Function<DBObject, R> func, String methodName, @Nullable Object... params) {
		return doFindClient(coll, query, fields, sort, skip, limit, new CursorFunction<ImmutableList<R>>() {
			@Override
			public ImmutableList<R> apply(DBCursor cursor)
						throws Exception {
					return FluentIterable.from(cursor).transform(func).toList();
			}
			}, methodName, params);
	}

	/**
	 * @param coll
	 * @param query
	 * @param fields
	 * @param sort
	 * @param skip
	 * @param limit 0 means no limit.
	 * @param methodName
	 * @param params
	 * @return Important: It may not contain {@code null} elements!
	 */
	private ImmutableList<T> doFindClient(DBCollection coll, @Nullable DBObject query, @Nullable DBObject fields, @Nullable DBObject sort, long skip, long limit,
			String methodName, @Nullable Object... params) {
		return doFindClient(coll, query, fields, sort, skip, limit, new DBObjectToEntity(), methodName, params);
	}

	/**
	 * Runs {@link DBCollection#find(DBObject, DBObject)} with specified parameters using {@link #primary} client.
	 * @param query
	 * @param fields
	 * @param sort
	 * @param skip
	 * @param limit 0 means no limit.
	 * @param func
	 * @param methodName
	 * @param params
	 * @return
	 */
	protected <R> R findPrimary(@Nullable DBObject query, @Nullable DBObject fields, @Nullable DBObject sort, long skip, long limit,
			CursorFunction<R> func, String methodName, @Nullable Object... params) {
		return doFindClient(primary, query, fields, sort, skip, limit, func, methodName, params);
	}

	/**
	 * Runs {@link DBCollection#find(DBObject, DBObject)} with specified parameters using {@link #primary} client.
	 * @param query
	 * @param fields
	 * @param sort
	 * @param skip
	 * @param limit 0 means no limit.
	 * @param func
	 * @param methodName
	 * @param params
	 * @return
	 */
	protected <R> ImmutableList<R> findPrimary(@Nullable DBObject query, @Nullable DBObject fields, @Nullable DBObject sort, long skip, long limit,
			final Function<DBObject, R> func, String methodName, @Nullable Object... params) {
		return doFindClient(primary, query, fields, sort, skip, limit, func, methodName, params);
	}

	/**
	 * Runs {@link DBCollection#find(DBObject, DBObject)} with specified parameters using {@link #primary} client.
	 * @param query
	 * @param fields
	 * @param sort
	 * @param skip
	 * @param limit 0 means no limit.
	 * @param methodName
	 * @param params
	 * @return
	 */
	protected ImmutableList<T> findPrimary(@Nullable DBObject query, @Nullable DBObject fields, @Nullable DBObject sort, long skip, long limit,
			String methodName, @Nullable Object... params) {
		return doFindClient(primary, query, fields, sort, skip, limit, methodName, params);
	}

	/**
	 * Runs {@link DBCollection#find(DBObject, DBObject)} with specified parameters using {@link #primary} client.
	 * @param query
	 * @param fields
	 * @param sort
	 * @param skip
	 * @param limit 0 means no limit.
	 * @param methodName
	 * @param params
	 * @return
	 */
	protected List<DBObject> findPrimaryAsDBObjects(@Nullable DBObject query, @Nullable DBObject fields, @Nullable DBObject sort, long skip, long limit,
			String methodName, @Nullable Object... params) {
		return doFindClient(primary, query, fields, sort, skip, limit,
				new CursorFunction<List<DBObject>>() {
					@Override
					public List<DBObject> apply(DBCursor cursor) throws Exception {
						return cursor.toArray();
					}
				}, methodName, params);
	}

	/**
	 * Runs {@link DBCollection#find(DBObject, DBObject)} with specified parameters using {@link #secondary} client.
	 * @param query
	 * @param fields
	 * @param sort
	 * @param skip
	 * @param limit 0 means no limit.
	 * @param func
	 * @param methodName
	 * @param params
	 * @return
	 */
	protected <R> R findSecondary(@Nullable DBObject query, @Nullable DBObject fields, @Nullable DBObject sort, long skip, long limit,
			CursorFunction<R> func, String methodName, @Nullable Object... params) {
		return doFindClient(secondary, query, fields, sort, skip, limit, func, methodName, params);
	}

	/**
	 * Runs {@link DBCollection#find(DBObject, DBObject)} with specified parameters using {@link #secondary} client.
	 * @param query
	 * @param fields
	 * @param sort
	 * @param skip
	 * @param limit 0 means no limit.
	 * @param func
	 * @param methodName
	 * @param params
	 * @return
	 */
	protected <R> ImmutableList<R> findSecondary(@Nullable DBObject query, @Nullable DBObject fields, @Nullable DBObject sort, long skip, long limit,
			final Function<DBObject, R> func, String methodName, @Nullable Object... params) {
		return doFindClient(secondary, query, fields, sort, skip, limit, func, methodName, params);
	}

	/**
	 * Runs {@link DBCollection#find(DBObject, DBObject)} with specified parameters using {@link #secondary} client.
	 * @param query
	 * @param fields
	 * @param sort
	 * @param skip
	 * @param limit 0 means no limit.
	 * @param methodName
	 * @param params
	 * @return
	 */
	protected ImmutableList<T> findSecondary(@Nullable DBObject query, @Nullable DBObject fields, @Nullable DBObject sort, long skip, long limit,
			String methodName, @Nullable Object... params) {
		return doFindClient(secondary, query, fields, sort, skip, limit, methodName, params);
	}

	/**
	 * Runs {@link DBCollection#find(DBObject, DBObject)} with specified parameters using {@link #secondary} client.
	 * @param query
	 * @param fields
	 * @param sort
	 * @param skip
	 * @param limit 0 means no limit.
	 * @param methodName
	 * @param params
	 * @return
	 */
	protected List<DBObject> findSecondaryAsDBObjects(@Nullable DBObject query, @Nullable DBObject fields, @Nullable DBObject sort, long skip, long limit,
			String methodName, @Nullable Object... params) {
		return doFindClient(secondary, query, fields, sort, skip, limit,
				new CursorFunction<List<DBObject>>() {
					@Override
					public List<DBObject> apply(DBCursor cursor) throws Exception {
						return cursor.toArray();
					}
				}, methodName, params);
	}

	@Nullable
	private DBObject doFindOneClient(DBCollection coll, @Nullable DBObject query, @Nullable DBObject fields, @Nullable DBObject orderBy,
			String methodName, @Nullable Object... params) {
		final long startTime = System.currentTimeMillis();
		try {
			final DBObject result = coll.findOne(query, fields, orderBy);

			// only check SLOW_QUERY_THRESHOLD if query succeeds
			final long duration = System.currentTimeMillis() - startTime;
			if (duration > SLOW_QUERY_THRESHOLD) {
				// defer methodSignature calculation until necessary to save performance
				final String methodSignature = getClass().getSimpleName() + "." + methodName + "(" + (params != null ? Joiner.on(", ").join(params) : "") + ")";
				if (autoExplainSlow) {
					try {
						final DBObject explain = coll.find(query, fields).addSpecial("$comment", Thread.currentThread().getName() + ": " + methodSignature)
							.sort(orderBy).limit(1).explain();
						final int n = (int) explain.get("n");
						final int nscanned = (int) explain.get("nscannedAllPlans");
						final int efficiency = nscanned > 0 ? n * 100 / nscanned : 100;
						final int millis = (int) explain.get("millis");
						log.warn("Slow findOne {} {} {} fields={} sort={} for method {} took {}ms (DB scanned {} to get {} for {}ms, {}% efficiency)\n"
								+ "db.{}.find({}, {}).sort({}).limit(1).explain() >>\n"
								+ "{}",
								coll.getDB().getMongo().getReadPreference(), collName, query, fields, orderBy, methodSignature, duration, 
								nscanned, n, millis, efficiency, collName, query, fields, orderBy, explain);
					} catch (Exception e) {
						log.warn(String.format("Slow findOne %s %s %s fields=%s sort=%s for method %s took %sms. explain() throws error",
								coll.getDB().getMongo().getReadPreference(), collName, query, fields, orderBy, methodSignature, duration),
								e);						
					}
				} else {
					log.warn("Slow findOne {} {} {} fields={} sort={} for method {} took {}ms",
							coll.getDB().getMongo().getReadPreference(), collName, query, fields, orderBy, methodSignature, duration);
				}
			}

			return result;
		} catch (Exception e) {
			// defer methodSignature calculation until necessary to save performance
			final String methodSignature = getClass().getSimpleName() + "." + methodName + "(" + (params != null ? Joiner.on(", ").join(params) : "") + ")";
			throw new MongoRepositoryException(e, "%s: Cannot findOne %s %s %s fields=%s orderBy=%s for method %s: %s",
					db.getName(), coll.getDB().getMongo().getReadPreference(), collName, query, fields, orderBy, methodSignature, e);
		}
	}

	/**
	 * Runs {@link DBCollection#findOne(DBObject, DBObject, DBObject)} with specified parameters using {@link #primary} client.
	 * @param query
	 * @param fields
	 * @param orderBy
	 * @param methodName
	 * @param params
	 * @return
	 */
	@Nullable
	protected DBObject findOnePrimary(@Nullable DBObject query, @Nullable DBObject fields, @Nullable DBObject orderBy,
			String methodName, @Nullable Object... params) {
		return doFindOneClient(primary, query, fields, orderBy, methodName, params);
	}

	/**
	 * Runs {@link DBCollection#findOne(DBObject, DBObject, DBObject)} with specified parameters using {@link #primary} client.
	 * @param query
	 * @param fields
	 * @param orderBy
	 * @param methodName
	 * @param params
	 * @return
	 */
	@Nullable
	protected T findOnePrimaryAsEntity(@Nullable DBObject query, @Nullable DBObject fields, @Nullable DBObject orderBy,
			String methodName, @Nullable Object... params) {
		final DBObject obj = findOnePrimary(query, fields, orderBy, methodName, params);
		return obj != null ? new DBObjectToEntity().apply(obj) : null;
	}

	/**
	 * Runs {@link DBCollection#findOne(DBObject, DBObject, DBObject)} with specified parameters using {@link #primary} client.
	 * @param query
	 * @param fields
	 * @param methodName
	 * @param params
	 * @return
	 */
	@Nullable
	protected DBObject findOnePrimary(@Nullable DBObject query, @Nullable DBObject fields,
			String methodName, @Nullable Object... params) {
		return doFindOneClient(primary, query, fields, null, methodName, params);
	}

	/**
	 * Runs {@link DBCollection#findOne(DBObject, DBObject, DBObject)} with specified parameters using {@link #primary} client.
	 * @param query
	 * @param fields
	 * @param methodName
	 * @param params
	 * @return
	 */
	@Nullable
	protected T findOnePrimaryAsEntity(@Nullable DBObject query, @Nullable DBObject fields,
			String methodName, @Nullable Object... params) {
		final DBObject obj = findOnePrimary(query, fields, methodName, params);
		return obj != null ? new DBObjectToEntity().apply(obj) : null;
	}

	/**
	 * Runs {@link DBCollection#findOne(DBObject, DBObject, DBObject)} with specified parameters using {@link #secondary} client.
	 * @param query
	 * @param fields
	 * @param orderBy
	 * @param methodName
	 * @param params
	 * @return
	 */
	@Nullable
	protected DBObject findOneSecondary(@Nullable DBObject query, @Nullable DBObject fields, @Nullable DBObject orderBy,
			String methodName, @Nullable Object... params) {
		return doFindOneClient(secondary, query, fields, orderBy, methodName, params);
	}

	/**
	 * Runs {@link DBCollection#findOne(DBObject, DBObject, DBObject)} with specified parameters using {@link #secondary} client.
	 * @param query
	 * @param fields
	 * @param orderBy
	 * @param methodName
	 * @param params
	 * @return
	 */
	@Nullable
	protected T findOneSecondaryAsEntity(@Nullable DBObject query, @Nullable DBObject fields, @Nullable DBObject orderBy,
			String methodName, @Nullable Object... params) {
		final DBObject obj = findOneSecondary(query, fields, orderBy, methodName, params);
		return obj != null ? new DBObjectToEntity().apply(obj) : null;
	}

	/**
	 * Runs {@link DBCollection#findOne(DBObject, DBObject, DBObject)} with specified parameters using {@link #secondary} client.
	 * @param query
	 * @param fields
	 * @param methodName
	 * @param params
	 * @return
	 */
	@Nullable
	protected DBObject findOneSecondary(@Nullable DBObject query, @Nullable DBObject fields,
			String methodName, @Nullable Object... params) {
		return doFindOneClient(secondary, query, fields, null, methodName, params);
	}

	/**
	 * Runs {@link DBCollection#findOne(DBObject, DBObject, DBObject)} with specified parameters using {@link #secondary} client.
	 * @param query
	 * @param fields
	 * @param methodName
	 * @param params
	 * @return
	 */
	@Nullable
	protected T findOneSecondaryAsEntity(@Nullable DBObject query, @Nullable DBObject fields,
			String methodName, @Nullable Object... params) {
		final DBObject obj = findOneSecondary(query, fields, methodName, params);
		return obj != null ? new DBObjectToEntity().apply(obj) : null;
	}

	/**
	 * Safely returns a MongoDB {@link DBObject} {@link Projection}.
	 * @param projection
	 * @return
	 */
	@Nullable
	protected DBObject getProjectionDBObject(@Nullable Projection projection) {
		if (projection != null) {
			final BasicDBObject projectionObj = new BasicDBObject();
			if (!projection.isIdIncluded()) {
				projectionObj.append("_id", false);
			}
			for (String field : projection.getIncludedFields()) {
				projectionObj.append(field, true);
			}
			for (String field : projection.getExcludedFields()) {
				projectionObj.append(field, false);
			}
			return projectionObj;
		} else {
			return null;
		}
	}

	@Override
	public <S extends T> S modifyByModificationTime(String id, DateTime prevModificationTime, S entity) {
		log.debug("Modifying {} : {}", collName, id);
		// use normal update
		final DBObject dbo = new EntityToDBObject().apply(entity);
		beforeSaveDBObject(dbo, ModificationTimePolicy.UPDATE);
		final BasicDBObject query = new BasicDBObject();
		query.put("_id", id);
		query.put("modificationTime", prevModificationTime.toDate());
		try {
			primary.update(query, dbo);
			log.info("Modified {} document '{}'", collName, id);
			return entity;
		} catch (MongoRepositoryException e) {
			throw new MongoRepositoryException(e, "%s: Cannot modify %s documents '%s'", db.getName(), collName, id);
		}
	}

}
