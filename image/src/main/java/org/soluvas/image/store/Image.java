package org.soluvas.image.store;

import java.io.File;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.annotation.Nullable;

import org.bson.BasicBSONObject;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soluvas.commons.SlugUtils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Maps.EntryTransformer;

/**
 * Image descriptor.
 * Was to be replaced by EMF {@link org.soluvas.image.Image}, but now EMF is "deprecated". :-P
 * @author ceefour
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Image implements Serializable {
	
	private static final long serialVersionUID = 1L;
	public static final int MAX_ID_LENGTH = 63;

	public static class ToId implements Function<Image, String> {
		@Override @Nullable
		public String apply(@Nullable Image input) {
			return input.getId();
		}
	}
	
	private static final Logger log = LoggerFactory.getLogger(Image.class);

	private String id;
	private String uri;
	private String originUri;
	private String contentType;
	private String extension;
	private String fileName;
	private Long size;
	// TODO: Support original width and height
//	private int width;
//	private int height;
	private Map<String, StyledImage> styles;
	/**
	 * Only used for creating/uploading new image. Otherwise it's always null.
	 * @see MongoImageRepository#add(Image)
	 */
	@Nullable
	private File originalFile;
	/**
	 * Only used for creating/uploading new image. Otherwise it's always {@link Optional#absent()}.
	 * @see MongoImageRepository#add(Image)
	 */
	private Optional<String> sourceUri = Optional.absent();
	@Nullable
	private String name;
	private DateTime created;
	
	public static <S extends Image> List<String> toIds(List<S> images) {
		return FluentIterable.from(images).transform(new Function<Image, String>() {
			@Override
			public String apply(Image input) {
				return input.getId();
			}
		}).toList();
	}
	
	public Image() {
		super();
	}
	
	/**
	 * Convenience constructor for passing to {@link MongoImageRepository#add(Image)}
	 * with pre-determined ID.
	 * FIXME: Setting ID is not working, {@link MongoImageRepository} still generates its own ID (and adding garbage generated ID)
	 * @param id Lower-alphabetic and underscore only. Max {@value #MAX_ID_LENGTH} chars. Strongly recommended to be SEO-friendly,
	 *           don't use autogenerated IDs.
	 * @param originalFile
	 * @param contentType
	 * @param name
	 */
	public Image(String id, File originalFile, String contentType, String name,
			@Nullable Predicate<String> predicate) {
		super();
		Preconditions.checkArgument(id.length() <= MAX_ID_LENGTH,
				"Image ID '%s' (%s characters) cannot be more than %s characters.", id, id.length(), MAX_ID_LENGTH);
		if (predicate != null) {
			this.id = SlugUtils.generateValidId(id, predicate);
		} else {
			this.id = SlugUtils.generateId(id, 0);
		}
		this.originalFile = originalFile;
		this.contentType = contentType;
		this.name = name;
	}

	/**
	 * Convenience constructor for passing to {@link MongoImageRepository#add(Image)} with ID based on {@code name}.
	 * @param originalFile
	 * @param contentType
	 * @param name
	 */
	public Image(File originalFile, String contentType, String name, @Nullable Predicate<String> predicate) {
		this(name, originalFile, contentType, name, predicate);
	}
	
	public Image(File originalFile, String contentType, String name) {
		this(name, originalFile, contentType, name, null);
	}

	/**
	 * Convenience for passing to {@link MongoImageRepository#add(Image)} from a remote image URI,
	 * with unknown content type and dimensions.
	 * @param sourceUri Source image that will be downloaded before adding.
	 * @param name Image name, this also will be the SEO-friendly {@link Image#getId()} via
	 * 	{@link SlugUtils#generateValidId(String, com.google.common.base.Predicate)}.
	 */
	public static Image fromRemote(String sourceUri, String name) {
		final Image image = new Image();
		image.setSourceUri(Optional.of(sourceUri));
		image.setName(name);
		return image;
	}

	public Image(ImageRepository imageStore, BasicBSONObject dbo) {
		super();
		id = dbo.getString("_id");
		name = dbo.getString("name");
		uri = dbo.getString("uri");
		extension = dbo.getString("extension", "jpg");
		if (uri == null) {
			// Legacy schema support
			try {
				uri = imageStore.getPublicUri(id, MongoImageRepository.ORIGINAL_NAME, extension);
			} catch (Exception e) {
				// FolderImageConnector does not support public URI
				log.debug("Not storing public URI for {] image '{}': {}", imageStore.getNamespace(), id, e);
			}
		}
		contentType = dbo.getString("contentType");
		fileName = dbo.getString("fileName");
		size = dbo.get("size") != null ? dbo.getLong("size") : null;
//		width = dbo.getInt("width");
//		height = dbo.getInt("height");
		BasicBSONObject stylesBson = (BasicBSONObject) dbo.get("styles");
		if (stylesBson == null) {
			log.warn("Image {} has null styles", id);
			stylesBson = new BasicBSONObject();
		}
		styles = ImmutableMap.copyOf(Maps.transformEntries(
				stylesBson, new EntryTransformer<String, Object, StyledImage>() {
			@Override
			public StyledImage transformEntry(String key, Object value) {
				BasicBSONObject styleBson = (BasicBSONObject)value;
				final Long size = styleBson.get("size") != null ? styleBson.getLong("size") : null;
				return new StyledImage(key, styleBson.getString("code"),
						styleBson.getString("uri"),
						styleBson.getString("contentType"), size,
						styleBson.getInt("width"), styleBson.getInt("height"));
			}
		}));
		
		// v1 field but forgotten in API
		created = dbo.get("created") != null ? new DateTime(dbo.get("created")) : null;
		// v2 field
		try {
			originUri = dbo.get("originUri") != null ? dbo.getString("originUri") : uri.toString();
		} catch (Exception e) {
			// FolderImageConnector does not support public URI
			log.debug("Not storing origin URI for {] image '{}': {}", imageStore.getNamespace(), id, e);
		}
	}
	
	public Image(String id, String uri, String originUri, String contentType,
			String fileName, Long size, Map<String, StyledImage> styles,
			String name, DateTime created) {
		super();
		this.id = id;
		this.uri = uri;
		this.originUri = originUri;
		this.contentType = contentType;
		this.fileName = fileName;
		this.size = size;
		this.styles = styles;
		this.name = name;
		this.created = created;
	}

	public String getId() {
		return id;
	}

	/**
	 * Public URI of the original image.
	 * @return
	 */
	public String getUri() {
		return uri;
	}
	
	/**
	 * @return the originUri
	 */
	public String getOriginUri() {
		return originUri;
	}

	/**
	 * @param originUri the originUri to set
	 */
	public void setOriginUri(String originUri) {
		this.originUri = originUri;
	}

	public String getContentType() {
		return contentType;
	}

	/**
	 * Only set this for new Images, do not set this on existing images.
	 * @param contentType
	 */
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getFileName() {
		return fileName;
	}

	public Long getSize() {
		return size;
	}

	public Map<String, StyledImage> getStyles() {
		return styles;
	}

	/**
	 * Only used for creating/uploading new image. Otherwise it's always null.
	 * @see MongoImageRepository#add(Image)
	 */
	public File getOriginalFile() {
		return originalFile;
	}

	/**
	 * Only used for creating/uploading new image. Otherwise it's always null.
	 * @see MongoImageRepository#add(Image)
	 */
	public void setOriginalFile(File originalFile) {
		this.originalFile = originalFile;
	}
	
	public Optional<String> getSourceUri() {
		return sourceUri;
	}
	
	public void setSourceUri(Optional<String> sourceUri) {
		this.sourceUri = sourceUri;
	}

	/**
	 * Only used for creating/uploading new image. Otherwise it's always null.
	 * @see MongoImageRepository#add(Image)
	 */
	public String getName() {
		return name;
	}

	/**
	 * Only used for creating/uploading new image. Otherwise it's always null.
	 * @see MongoImageRepository#add(Image)
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the created
	 */
	public DateTime getCreated() {
		return created;
	}

	/**
	 * @param created the created to set
	 */
	public void setCreated(DateTime created) {
		this.created = created;
	}
	
	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	@Override
	public String toString() {
		return String.format(
				"Image [id=%s, contentType=%s, fileName=%s, name=%s, size=%d, uri=%s]",
				id, contentType, fileName, name, size, uri);
	}
	
}
