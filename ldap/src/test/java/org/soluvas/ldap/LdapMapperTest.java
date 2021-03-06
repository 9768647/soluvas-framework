package org.soluvas.ldap;

import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

import org.apache.directory.api.ldap.model.entry.DefaultEntry;
import org.apache.directory.api.ldap.model.entry.Entry;
import org.apache.directory.api.ldap.model.entry.Modification;
import org.apache.directory.api.ldap.model.entry.ModificationOperation;
import org.apache.directory.api.ldap.model.exception.LdapException;
import org.apache.directory.api.ldap.model.exception.LdapInvalidAttributeValueException;
import org.apache.directory.api.ldap.model.exception.LdapInvalidDnException;
import org.apache.directory.api.ldap.model.message.ModifyRequest;
import org.hamcrest.Matchers;
import javax.money.CurrencyUnit;
import javax.money.Monetary;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soluvas.commons.AccountStatus;
import org.soluvas.commons.Gender;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

/**
 * Test mapping of {@link Person} to {@link Entry} and back.
 * @author ceefour
 */
public class LdapMapperTest {

	private static final Logger log = LoggerFactory.getLogger(LdapMapperTest.class);

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test public void mapsSimpleClassToEntry() throws LdapInvalidAttributeValueException {
		final LdapMapper<Person> mapper = new LdapMapper<>();
		
		final Person hendy = new Person("hendy", "hendy.irawan", "Hendy", "Irawan", "hendy@soluvas.com");
		log.info("Input Person: {}", hendy);
		
		final Entry entry = mapper.toEntry(hendy, "ou=users,dc=aksimata,dc=com");
		log.info("Output Entry: {}", entry);
		
		assertTrue(entry.contains("objectClass", "inetOrgPerson", "uidObject", "extensibleObject") );
		assertEquals("uid=hendy,ou=users,dc=aksimata,dc=com", entry.getDn().toString());
		assertEquals("hendy", entry.get("uid").getString());
		assertEquals("hendy.irawan", entry.get("uniqueIdentifier").getString());
		assertEquals("Hendy", entry.get("gn").getString());
		assertEquals("Irawan", entry.get("sn").getString());
		assertEquals("Hendy Irawan", entry.get("cn").getString());
		assertEquals("hendy@soluvas.com", entry.get("mail").getString());
	}

	@Test public void mapsEntryWithProperAttributeTypes() throws LdapInvalidAttributeValueException {
		final LdapMapper<Person> mapper = new LdapMapper<>();
		
		Person hendy = new Person("hendy", "hendy.irawan", "Hendy", "Irawan", "hendy@soluvas.com");
		log.info("Input Person: {}", hendy);
		
		Entry entry = mapper.toEntry(hendy, "ou=users,dc=aksimata,dc=com");
		log.info("Output Entry: {}", entry);
		
		assertTrue("mapped Entry should contain AttributeType objectClass", entry.containsAttribute("objectClass"));
		assertTrue("mapped Entry should contain AttributeType uid", entry.containsAttribute("uid"));
		assertTrue("mapped Entry should contain AttributeType uniqueIdentifier", entry.containsAttribute("uniqueIdentifier"));
		assertTrue("mapped Entry should contain AttributeType gn", entry.containsAttribute("gn"));
		assertTrue("mapped Entry should contain AttributeType sn", entry.containsAttribute("sn"));
		assertTrue("mapped Entry should contain AttributeType cn", entry.containsAttribute("cn"));
		assertTrue("mapped Entry should contain AttributeType mail", entry.containsAttribute("mail"));
	}

	@Test public void mapsSimpleClassWithProperAlias() throws LdapInvalidAttributeValueException {
		final LdapMapper<Person> mapper = new LdapMapper<>();
		
		Person hendy = new Person("hendy", "hendy.irawan", "Hendy", "Irawan", "hendy@soluvas.com");
		log.info("Input Person: {}", hendy);
		
		Entry entry = mapper.toEntry(hendy, "ou=users,dc=aksimata,dc=com");
		log.info("Output Entry: {}", entry);
		
		assertEquals("Hendy", entry.get("gn").getString());
//		assertEquals("Hendy", entry.get("givenName").getString()); // no longer schema aware :)
	}

	@Test public void mapsMultiValuesToEntry() throws LdapInvalidAttributeValueException {
		final LdapMapper<Person> mapper = new LdapMapper<>();
		
		final Person hendy = new Person("hendy", "hendy.irawan", "Hendy", "Irawan", "male");
		hendy.setEmails(ImmutableSet.of("hendy@soluvas.com", "hendy@bippo.co.id", "ceefour666@gmail.com"));
		log.info("Input Person: {}", hendy);
		
		Entry entry = mapper.toEntry(hendy, "ou=users,dc=aksimata,dc=com");
		log.info("Output Entry: {}", entry);
		
		assertTrue( entry.contains("objectClass", "inetOrgPerson", "uidObject", "extensibleObject") );
		assertEquals("uid=hendy,ou=users,dc=aksimata,dc=com", entry.getDn().toString());
		assertEquals("hendy", entry.get("uid").getString());
		assertEquals("hendy.irawan", entry.get("uniqueIdentifier").getString());
		assertEquals("Hendy", entry.get("gn").getString());
		assertEquals("Irawan", entry.get("sn").getString());
		assertEquals("Hendy Irawan", entry.get("cn").getString());
		assertTrue( entry.contains("mail", "hendy@soluvas.com", "hendy@bippo.co.id", "ceefour666@gmail.com") );
	}
	
	@Test public void mapsSubclassToEntry() throws Exception {
//		final SchemaLoader customSchemaLoader = new LdifSchemaLoader(new File("/var/lib/apacheds-2.0.0-M7/default/partitions/schema/"));
//		final SchemaManager customSchemaMgr = new DefaultSchemaManager(customSchemaLoader);
//		final Collection<Schema> schemas = customSchemaLoader.getAllEnabled();
//		log.info("Loaded {} LDAP schemas: {}", schemas.size(), schemas);
//		customSchemaMgr.enable(schemas.toArray(new Schema[] {}));
		final LdapMapper<SocialPerson> customMapper = new LdapMapper<>();
		
		SocialPerson hendy = new SocialPerson("hendy", "hendy.irawan", "Hendy", "Irawan", Gender.MALE);
		hendy.setEmails(ImmutableSet.of("hendy@soluvas.com", "hendy@bippo.co.id", "ceefour666@gmail.com"));
		hendy.setPhotoId("hendy");
		hendy.setFacebookId(596326671L);
		hendy.setFacebookUsername("ceefour");
		hendy.setTwitterId(384154265L);
		hendy.setTwitterScreenName("hendyirawan");
		log.info("Input Person: {}", hendy);
		
		Entry entry = customMapper.toEntry(hendy, "ou=users,dc=aksimata,dc=com");
		log.info("Output Entry: {}", entry);
		
		assertTrue( entry.contains("objectClass", "inetOrgPerson", "uidObject", "extensibleObject") );
		assertEquals("uid=hendy,ou=users,dc=aksimata,dc=com", entry.getDn().toString());
		assertEquals("hendy", entry.get("uid").getString());
		assertEquals("hendy.irawan", entry.get("uniqueIdentifier").getString());
		assertEquals("Hendy", entry.get("gn").getString());
		assertEquals("Irawan", entry.get("sn").getString());
		assertEquals("Hendy Irawan", entry.get("cn").getString());
		assertTrue(entry.contains("mail", "hendy@soluvas.com", "hendy@bippo.co.id", "ceefour666@gmail.com") );
		
		assertEquals("hendy", entry.get("photoId").getString());
		assertEquals("596326671", entry.get("fbId").getString());
		assertEquals("ceefour", entry.get("fbUser").getString());
		assertEquals("384154265", entry.get("twitterId").getString());
		assertEquals("hendyirawan", entry.get("twitterScreenName").getString());
	}

	@Test public void mapsEntryToSimpleClass() throws LdapInvalidAttributeValueException, LdapInvalidDnException {
		final LdapMapper<Person> mapper = new LdapMapper<>();
		
		final Entry entry = new DefaultEntry("uid=hendy,ou=users,dc=aksimata,dc=com");
		entry.put("objectClass", "organizationalPerson", "extensibleObject");
		entry.put("uid", "hendy");
		entry.put("uniqueIdentifier", "hendy.irawan");
		entry.put("gn", "Hendy");
		entry.put("sn", "Irawan");
		entry.put("cn", "Hendy Irawan");
		entry.put("mail", "hendy@soluvas.com");
		log.info("Input Entry: {}", entry);
		
		final Person person = mapper.fromEntry(entry, Person.class);
		log.info("Output Person: {}", person);
		
		assertEquals("hendy", person.getId());
		assertEquals("hendy.irawan", person.getSlug());
		assertEquals("Hendy", person.getFirstName());
		assertEquals("Irawan", person.getLastName());
		assertEquals("Hendy Irawan", person.getName());
		assertEquals(ImmutableSet.of("hendy@soluvas.com"), person.getEmails());
	}

	@Test public void mapsUserPasswordCorrectly() throws LdapInvalidAttributeValueException, LdapInvalidDnException {
		final LdapMapper<Person> mapper = new LdapMapper<>();
		
		final Entry entry = new DefaultEntry("uid=hendy,ou=users,dc=aksimata,dc=com");
		entry.put("objectClass", "organizationalPerson", "extensibleObject");
		entry.put("uid", "hendy");
		final String password = "{SSHA}BacKnhFVjpSunHYgivCVPAzcavAZZe9QFtd51A==";
		entry.put("userPassword", password.getBytes());
		log.info("Input Entry: {}", entry);
		
		final Person person = mapper.fromEntry(entry, Person.class);
		log.info("Output Person: {}", person);
		
		assertEquals(password, person.getPassword());
	}

	@Test
	public void mapsMultiToSimpleClass() throws LdapInvalidAttributeValueException, LdapInvalidDnException {
		final LdapMapper<Person> mapper = new LdapMapper<>();
		
		final Entry entry = new DefaultEntry("uid=hendy,ou=users,dc=aksimata,dc=com");
		entry.put("objectClass", "organizationalPerson", "extensibleObject");
		entry.put("uid", "hendy");
		entry.put("uniqueIdentifier", "hendy.irawan");
		entry.put("gn", "Hendy");
		entry.put("sn", "Irawan");
		entry.put("cn", "Hendy Irawan");
		entry.put("mail", "hendy@soluvas.com", "ceefour666@gmail.com", "hendy@bippo.co.id");
		log.info("Input Entry: {}", entry);
		
		final Person person = mapper.fromEntry(entry, Person.class);
		log.info("Output Person: {}", person);
		
		assertEquals("hendy", person.getId());
		assertEquals("hendy.irawan", person.getSlug());
		assertEquals("Hendy", person.getFirstName());
		assertEquals("Irawan", person.getLastName());
		assertEquals("Hendy Irawan", person.getName());
		assertEquals(ImmutableSet.of("hendy@soluvas.com", "ceefour666@gmail.com", "hendy@bippo.co.id"),
				person.getEmails());
	}

	@Test
	public void mapsEntryToSubclass() throws LdapInvalidAttributeValueException, LdapInvalidDnException {
		final LdapMapper<SocialPerson> mapper = new LdapMapper<>();
		
		final Entry entry = new DefaultEntry("uid=hendy,ou=users,dc=aksimata,dc=com");
		entry.put("objectClass", "organizationalPerson", "extensibleObject", "socialPerson", "facebookObject", "twitterObject");
		entry.put("uid", "hendy");
		entry.put("uniqueIdentifier", "hendy.irawan");
		entry.put("gn", "Hendy");
		entry.put("sn", "Irawan");
		entry.put("cn", "Hendy Irawan");
		entry.put("mail", "hendy@soluvas.com", "ceefour666@gmail.com", "hendy@bippo.co.id");
		
		entry.put("photoId", "hendy");
		entry.put("fbId", "596326671");
		entry.put("fbUser", "ceefour");
		entry.put("twitterId", "384154265");
		entry.put("twitterScreenName", "hendyirawan");
		log.info("Input Entry: {}", entry);
		
		final SocialPerson person = mapper.fromEntry(entry, SocialPerson.class);
		log.info("Output Person: {}", person);
		
		assertEquals("hendy", person.getId());
		assertEquals("hendy.irawan", person.getSlug());
		assertEquals("Hendy", person.getFirstName());
		assertEquals("Irawan", person.getLastName());
		assertEquals("Hendy Irawan", person.getName());
		assertEquals(ImmutableSet.of("hendy@soluvas.com", "ceefour666@gmail.com", "hendy@bippo.co.id"),
				person.getEmails());
		assertEquals("hendy", person.getPhotoId());
		assertEquals((Long)596326671L, person.getFacebookId());
		assertEquals("ceefour", person.getFacebookUsername());
		assertEquals((Long)384154265L, person.getTwitterId());
		assertEquals("hendyirawan", person.getTwitterScreenName());
	}

	@Test
	public void includesSuperClassAttributes() throws LdapInvalidAttributeValueException, LdapInvalidDnException {
		final LdapMapper<SocialPerson> mapper = new LdapMapper<>();
		
		final Set<String> expectedAttributeIds = ImmutableSet.of(
			// Person:
			"uid", "uniqueIdentifier", "gn", "givenName", "sn", "cn",
			"userPassword", "mail", "mobile", "telephoneNumber",
			"street", "postalCode", "l", "st", "c",
			// SocialPerson:
			"primaryMail", "photoId", "gender", "fbId", "facebookId", "facebookUsername", "fbUser",
			"fbAccessToken",
			"twitterId", "twitterScreenName", "virtualMail", "nickname",
			"primaryShippingAddress" );
		final Set<String> attributeIds = mapper.getAttributeIds(SocialPerson.class);
		log.info("Attribute IDs of SocialPerson: {}", attributeIds);
		assertThat(attributeIds, Matchers.hasItems(expectedAttributeIds.toArray(new String[] {})));
//		assertEquals(Ordering.natural().immutableSortedCopy(expectedAttributeIds), Ordering.natural().immutableSortedCopy(attributeIds));
	}

	@Test public void mapsLongToEntry() throws LdapInvalidAttributeValueException {
		final LdapMapper<PersonWithLong> mapper = new LdapMapper<>();
		
		final PersonWithLong hendy = new PersonWithLong("hendy", "hendy.irawan", "Hendy", "Irawan", "male");
		hendy.setEmployeeNumber(123L);
		log.info("Input Person: {}", hendy);
		
		final Entry entry = mapper.toEntry(hendy, "ou=users,dc=aksimata,dc=com");
		log.info("Output Entry: {}", entry);
		
		assertEquals("123", entry.get("employeeNumber").getString());
	}
	
	@Test public void mapsAttributeToLong() throws LdapInvalidAttributeValueException, LdapInvalidDnException {
		final LdapMapper<PersonWithLong> mapper = new LdapMapper<>();
		
		final Entry entry = new DefaultEntry("uid=hendy,ou=users,dc=aksimata,dc=com");
		entry.put("objectClass", "organizationalPerson", "extensibleObject", "socialPerson", "facebookObject", "twitterObject");
		entry.put("uid", "hendy");
		entry.put("uniqueIdentifier", "hendy.irawan");
		entry.put("gn", "Hendy");
		entry.put("sn", "Irawan");
		entry.put("cn", "Hendy Irawan");
		entry.put("mail", "hendy@soluvas.com", "ceefour666@gmail.com", "hendy@bippo.co.id");
		entry.put("employeeNumber", "123");
		
		log.info("Input Entry: {}", entry);
		
		final PersonWithLong person = mapper.fromEntry(entry, PersonWithLong.class);
		log.info("Output Person: {}", person);
		
		assertEquals((Long)123L, person.getEmployeeNumber());
	}
	
	@Test public void mapsBigDecimalToEntry() throws LdapInvalidAttributeValueException {
		final LdapMapper<PersonWithBigDecimal> mapper = new LdapMapper<>();
		
		final PersonWithBigDecimal hendy = new PersonWithBigDecimal("hendy", "hendy.irawan", "Hendy", "Irawan", "male");
		hendy.setDebitBalance(new BigDecimal("123.4567"));
		log.info("Input Person: {}", hendy);
		
		final Entry entry = mapper.toEntry(hendy, "ou=users,dc=aksimata,dc=com");
		log.info("Output Entry: {}", entry);
		
		assertEquals("123.4567", entry.get("debitBalance").getString());
	}
	
	@Test public void mapsAttributeToBigDecimal() throws LdapInvalidAttributeValueException, LdapInvalidDnException {
		final LdapMapper<PersonWithBigDecimal> mapper = new LdapMapper<>();
		
		final Entry entry = new DefaultEntry("uid=hendy,ou=users,dc=aksimata,dc=com");
		entry.put("objectClass", "organizationalPerson", "extensibleObject", "socialPerson", "facebookObject", "twitterObject");
		entry.put("uid", "hendy");
		entry.put("uniqueIdentifier", "hendy.irawan");
		entry.put("gn", "Hendy");
		entry.put("sn", "Irawan");
		entry.put("cn", "Hendy Irawan");
		entry.put("mail", "hendy@soluvas.com", "ceefour666@gmail.com", "hendy@bippo.co.id");
		entry.put("debitBalance", "123.4567");
		
		log.info("Input Entry: {}", entry);
		
		final PersonWithBigDecimal person = mapper.fromEntry(entry, PersonWithBigDecimal.class);
		log.info("Output Person: {}", person);
		
		assertEquals(new BigDecimal("123.4567"), person.getDebitBalance());
	}
	
	@Test public void mapsAttributeAlias() throws LdapInvalidAttributeValueException, LdapInvalidDnException {
		final LdapMapper<SocialPerson> mapper = new LdapMapper<>();
		
		final Entry entry = new DefaultEntry("uid=hendy,ou=users,dc=aksimata,dc=com");
		entry.put("objectClass", "organizationalPerson", "extensibleObject", "socialPerson", "facebookObject", "twitterObject");
		entry.put("uid", "hendy");
		entry.put("uniqueIdentifier", "hendy.irawan");
		entry.put("givenName", "Hendy");
		entry.put("sn", "Irawan");
		entry.put("cn", "Hendy Irawan");
		entry.put("mail", "hendy@soluvas.com", "ceefour666@gmail.com", "hendy@bippo.co.id");
		entry.put("magentoId", "123");
		
		log.info("Input Entry: {}", entry);
		
		final SocialPerson person = mapper.fromEntry(entry, SocialPerson.class);
		log.info("Output Person: {}", person);
		
		assertEquals("Hendy", person.getFirstName());
	}
	
	@Test public void mapsEmptyCollectionToNothing() throws LdapInvalidAttributeValueException {
		final LdapMapper<SocialPerson> mapper = new LdapMapper<>();
		
		final Person hendy = new Person("hendy", "hendy.irawan", "Hendy", "Irawan", "hendy@soluvas.com");
		hendy.setEmails(ImmutableSet.<String>of());
		log.info("Input Person: {}", hendy);
		
		final Entry entry = mapper.toEntry(hendy, "ou=users,dc=aksimata,dc=com");
		log.info("Output Entry: {}", entry);
		
		assertFalse(entry.containsAttribute("mail"));
	}

	@Test public void canAddObjectClasses() throws LdapException {
		final LdapMapper<Person> mapper = new LdapMapper<>();
		
		final Entry existingEntry = new DefaultEntry("uid=budi,ou=users,dc=dev,dc=berbatik,dc=com");
		existingEntry.put("objectClass", "organizationalPerson", "extensibleObject", "socialPerson", "facebookObject", "twitterObject");
//		existing.put("uid", "hendy");
		existingEntry.put("uniqueIdentifier", "hendy.irawan");
		existingEntry.put("givenName", "Hendy");
		existingEntry.put("sn", "Irawan");
		existingEntry.put("cn", "Hendy Irawan");
		existingEntry.put("mail", "hendy@soluvas.com", "ceefour666@gmail.com", "hendy@bippo.co.id");
		existingEntry.put("magentoId", "123");
		
		final Person oldLiz = mapper.fromEntry(existingEntry, Person.class);
		final Person newLiz = mapper.fromEntry(existingEntry, Person.class);
		
		final ModifyRequest request = mapper.createModifyRequest(existingEntry, oldLiz, newLiz);
		log.info("Modify request: {}", request);
		assertNotNull(request);
		assertThat(request.getModifications(), hasSize(1));
		final Modification modification = request.getModifications().iterator().next();
		assertEquals(ModificationOperation.ADD_ATTRIBUTE, modification.getOperation());
		assertEquals("objectClass", modification.getAttribute().getUpId());
		assertEquals(2, modification.getAttribute().size());
	}

	@Test public void properModificationWhenUpdatingStandardPerson() throws LdapException {
		final LdapMapper<Person> mapper = new LdapMapper<>();
		
		final Entry existingEntry = new DefaultEntry("uid=budi,ou=users,dc=dev,dc=berbatik,dc=com");
		existingEntry.put("objectClass", "organizationalPerson", "extensibleObject", "socialPerson", "facebookObject", "twitterObject",
				"inetOrgPerson", "uidObject");
//		existing.put("uid", "hendy");
		existingEntry.put("uniqueIdentifier", "hendy.irawan");
		existingEntry.put("givenName", "Hendy");
		existingEntry.put("sn", "Irawan");
		existingEntry.put("cn", "Hendy Irawan");
		existingEntry.put("mail", "hendy@soluvas.com", "ceefour666@gmail.com", "hendy@bippo.co.id");
		existingEntry.put("magentoId", "123");
		
		final Person oldLiz = mapper.fromEntry(existingEntry, Person.class);
		final Person newLiz = mapper.fromEntry(existingEntry, Person.class);
		newLiz.setMobile("08123456789");
		
		final ModifyRequest request = mapper.createModifyRequest(existingEntry, oldLiz, newLiz);
		log.info("Modify request: {}", request);
		assertNotNull(request);
		assertThat(request.getModifications(), hasSize(1));
		final Modification modification = request.getModifications().iterator().next();
		assertEquals(ModificationOperation.ADD_ATTRIBUTE, modification.getOperation());
		assertEquals("mobile", modification.getAttribute().getUpId());
	}

	@Test public void canUpdateSocialPerson() throws LdapException {
		final LdapMapper<SocialPerson> mapper = new LdapMapper<>();
		
		final Entry existingEntry = new DefaultEntry("uid=budi,ou=users,dc=dev,dc=berbatik,dc=com");
		existingEntry.put("objectClass", "organizationalPerson", "extensibleObject", "socialPerson", "facebookObject", "twitterObject",
				"inetOrgPerson", "uidObject");
//		existing.put("uid", "hendy");
		existingEntry.put("uniqueIdentifier", "hendy.irawan");
		existingEntry.put("givenName", "Hendy");
		existingEntry.put("sn", "Irawan");
		existingEntry.put("cn", "Hendy Irawan");
		existingEntry.put("mail", "hendy@soluvas.com", "ceefour666@gmail.com", "hendy@bippo.co.id");
		existingEntry.put("magentoId", "123");

		final SocialPerson oldLiz = mapper.fromEntry(existingEntry, SocialPerson.class);
		final SocialPerson newLiz = mapper.fromEntry(existingEntry, SocialPerson.class);
		
		newLiz.setFacebookAccessToken("abcdefgh");
		
		final ModifyRequest request = mapper.createModifyRequest(existingEntry, oldLiz, newLiz);
		log.info("Modify request: {}", request);
		assertNotNull(request);
		assertThat(request.getModifications(), hasSize(1));
		final Modification modification = request.getModifications().iterator().next();
		assertEquals(ModificationOperation.ADD_ATTRIBUTE, modification.getOperation());
		assertEquals("fbAccessToken", modification.getAttribute().getUpId());
	}

	@Test public void replaceAttributeModifyRequest() throws LdapException {
		final LdapMapper<Person> mapper = new LdapMapper<>();
		
		final Entry existing = new DefaultEntry("uid=hendy,ou=users,dc=aksimata,dc=com");
		existing.put("objectClass", "organizationalPerson", "extensibleObject", "inetOrgPerson", "uidObject");
		existing.put("uid", "hendy");
		existing.put("cn", "Hendy Irawan");
		log.info("Existing Entry: {}", existing);
		
		final Entry updating = new DefaultEntry("uid=hendy,ou=users,dc=aksimata,dc=com");
		updating.put("objectClass", "organizationalPerson", "extensibleObject", "inetOrgPerson", "uidObject");
		updating.put("uid", "hendy");
		updating.put("cn", "Hendy Irawan 2");
		log.info("Updating Entry: {}", updating);
		
		final Person oldObj = mapper.fromEntry(existing, Person.class);
		final Person newObj = mapper.fromEntry(updating, Person.class);
		
		final ModifyRequest request = mapper.createModifyRequest(existing, oldObj, newObj);
		log.info("Modify request: {}", request);
		assertNotNull(request);
		assertThat(request.getModifications(), hasSize(1));
		final Modification modification = request.getModifications().iterator().next();
		assertEquals(ModificationOperation.REPLACE_ATTRIBUTE, modification.getOperation());
		assertEquals("cn", modification.getAttribute().getUpId());
	}

	@Test public void replaceAttributeAliasModifyRequest() throws LdapException {
		final LdapMapper<Person> mapper = new LdapMapper<>();
		
		final Entry existing = new DefaultEntry("uid=hendy,ou=users,dc=aksimata,dc=com");
		existing.put("objectClass", "organizationalPerson", "extensibleObject", "inetOrgPerson", "uidObject");
		existing.put("uid", "hendy");
		existing.put("givenName", "Hendy");
		log.info("Existing Entry: {}", existing);
		
		final Entry updating = new DefaultEntry("uid=hendy,ou=users,dc=aksimata,dc=com");
		updating.put("objectClass", "organizationalPerson", "extensibleObject", "inetOrgPerson", "uidObject");
		updating.put("uid", "hendy");
		updating.put("gn", "Rudi");
		log.info("Updating Entry: {}", updating);
		
		final Person oldObj = mapper.fromEntry(existing, Person.class);
		final Person newObj = mapper.fromEntry(updating, Person.class);
		
		final ModifyRequest request = mapper.createModifyRequest(existing, oldObj, newObj);
		log.info("Modify request: {}", request);
		assertNotNull(request);
		assertThat(request.getModifications(), hasSize(1));
		final Modification modification = request.getModifications().iterator().next();
		assertEquals(ModificationOperation.REPLACE_ATTRIBUTE, modification.getOperation());
		assertEquals("gn", modification.getAttribute().getUpId());
	}

	@Test public void addAttributeModifyRequest() throws LdapException {
		final LdapMapper<Person> mapper = new LdapMapper<>();
		
		final Entry existing = new DefaultEntry("uid=hendy,ou=users,dc=aksimata,dc=com");
		existing.put("objectClass", "organizationalPerson", "extensibleObject", "inetOrgPerson", "uidObject");
		existing.put("uid", "hendy");
		log.info("Existing Entry: {}", existing);
		
		final Entry updating = new DefaultEntry("uid=hendy,ou=users,dc=aksimata,dc=com");
		updating.put("objectClass", "organizationalPerson", "extensibleObject", "inetOrgPerson", "uidObject");
		updating.put("uid", "hendy");
		updating.put("cn", "Hendy Irawan");
		log.info("Input Entry: {}", updating);
		
		final Person oldObj = mapper.fromEntry(existing, Person.class);
		final Person newObj = mapper.fromEntry(updating, Person.class);
		
		final ModifyRequest request = mapper.createModifyRequest(existing, oldObj, newObj);
		log.info("Modify request: {}", request);
		assertNotNull(request);
		assertThat(request.getModifications(), hasSize(1));
		final Modification modification = request.getModifications().iterator().next();
		assertEquals(ModificationOperation.ADD_ATTRIBUTE, modification.getOperation());
		assertEquals("cn", modification.getAttribute().getUpId());
	}

	@Test public void addMultiAttributeModifyRequest() throws LdapException {
		final LdapMapper<Person> mapper = new LdapMapper<>();
		
		final Entry existing = new DefaultEntry("uid=hendy,ou=users,dc=aksimata,dc=com");
		existing.put("objectClass", "organizationalPerson", "extensibleObject", "inetOrgPerson", "uidObject");
		existing.put("uid", "hendy");
		log.info("Existing Entry: {}", existing);
		
		final Person oldObj = mapper.fromEntry(existing, Person.class);
		final Person newObj = mapper.fromEntry(existing, Person.class);
		newObj.setEmails(ImmutableSet.of("hendy@member.dev.aksimata.com"));
		
		final ModifyRequest request = mapper.createModifyRequest(existing, oldObj, newObj);
		log.info("Modify request: {}", request);
		assertNotNull(request);
		assertThat(request.getModifications(), hasSize(1));
		final Modification modification = request.getModifications().iterator().next();
		assertEquals(ModificationOperation.ADD_ATTRIBUTE, modification.getOperation());
		assertEquals("mail", modification.getAttribute().getUpId());
		assertEquals("hendy@member.dev.aksimata.com", modification.getAttribute().getString());
	}

	@Test public void removeMultiAttributeModifyRequest1() throws LdapException {
		final LdapMapper<Person> mapper = new LdapMapper<>();
		
		final Entry existing = new DefaultEntry("uid=hendy,ou=users,dc=aksimata,dc=com");
		existing.put("objectClass", "organizationalPerson", "extensibleObject", "inetOrgPerson", "uidObject");
		existing.put("uid", "hendy");
		existing.put("mail", "hendy@member.dev.aksimata.com");
		log.info("Existing Entry: {}", existing);
		
		final Person oldObj = mapper.fromEntry(existing, Person.class);
		final Person newObj = mapper.fromEntry(existing, Person.class);
		newObj.setEmails(ImmutableSet.<String>of());
		
		final ModifyRequest request = mapper.createModifyRequest(existing, oldObj, newObj);
		log.info("Modify request: {}", request);
		assertNotNull(request);
		assertThat(request.getModifications(), hasSize(1));
		final Modification modification = request.getModifications().iterator().next();
		assertEquals(ModificationOperation.REMOVE_ATTRIBUTE, modification.getOperation());
		assertEquals("mail", modification.getAttribute().getUpId());
	}

	@Test public void removeAttributeModifyRequest() throws LdapException {
		final LdapMapper<Person> mapper = new LdapMapper<>();
		
		final Entry existing = new DefaultEntry("uid=hendy,ou=users,dc=aksimata,dc=com");
		existing.put("objectClass", "organizationalPerson", "extensibleObject", "inetOrgPerson", "uidObject");
		existing.put("uid", "hendy");
		existing.put("cn", "Hendy Irawan");
		existing.put("sn", "Irawan");
		log.info("Existing Entry: {}", existing);
		
		final Entry updating = new DefaultEntry("uid=hendy,ou=users,dc=aksimata,dc=com");
		updating.put("objectClass", "organizationalPerson", "extensibleObject", "inetOrgPerson", "uidObject");
		updating.put("uid", "hendy");
		updating.put("cn", "Hendy Irawan");
		log.info("Input Entry: {}", updating);
		
		final Person oldObj = mapper.fromEntry(existing, Person.class);
		final Person newObj = mapper.fromEntry(updating, Person.class);
		
		final ModifyRequest request = mapper.createModifyRequest(existing, oldObj, newObj);
		log.info("Modify request: {}", request);
		assertNotNull(request);
		assertThat(request.getModifications(), hasSize(1));
		final Modification modification = request.getModifications().iterator().next();
		assertEquals(ModificationOperation.REMOVE_ATTRIBUTE, modification.getOperation());
		assertEquals("sn", modification.getAttribute().getUpId());
	}

	@Test public void addAndRemoveMultiAttributeModifyRequest() throws LdapException {
		final LdapMapper<Person> mapper = new LdapMapper<>();
		
		final Entry existing = new DefaultEntry("uid=hendy,ou=users,dc=aksimata,dc=com");
		existing.put("objectClass", "organizationalPerson", "extensibleObject", "inetOrgPerson", "uidObject");
		existing.put("uid", "hendy");
		existing.put("mail", "atang@yahoo.com");
		log.info("Existing Entry: {}", existing);
		
		final Person oldObj = mapper.fromEntry(existing, Person.class);
		final Person newObj = mapper.fromEntry(existing, Person.class);
		newObj.setEmails(ImmutableSet.of("atang@keren.com"));
		
		final ModifyRequest request = mapper.createModifyRequest(existing, oldObj, newObj);
		log.info("Modify request: {}", request);
		assertNotNull(request);
		assertThat(request.getModifications(), hasSize(2));
		final List<Modification> modifications = ImmutableList.copyOf(request.getModifications());
		final Modification modification1 = modifications.get(0);
		assertEquals(ModificationOperation.ADD_ATTRIBUTE, modification1.getOperation());
		assertEquals("mail", modification1.getAttribute().getUpId());
		assertEquals("atang@keren.com", modification1.getAttribute().getString());
		final Modification modification2 = modifications.get(1);
		assertEquals(ModificationOperation.REMOVE_ATTRIBUTE, modification2.getOperation());
		assertEquals("mail", modification2.getAttribute().getUpId());
		assertEquals("atang@yahoo.com", modification2.getAttribute().getString());
	}

	@Test public void doNotRemoveAttributeWithAlias() throws LdapException {
		final LdapMapper<Person> mapper = new LdapMapper<>();
		
		final Entry existing = new DefaultEntry("uid=hendy,ou=users,dc=aksimata,dc=com");
		existing.put("objectClass", "organizationalPerson", "extensibleObject", "inetOrgPerson", "uidObject");
		existing.put("uid", "hendy");
		existing.put("gn", "Hendy");
		log.info("Existing Entry: {}", existing);
		
		final Entry updating = new DefaultEntry("uid=hendy,ou=users,dc=aksimata,dc=com");
		updating.put("objectClass", "organizationalPerson", "extensibleObject", "inetOrgPerson", "uidObject");
		updating.put("uid", "hendy");
		updating.put("givenName", "Hendy");
		log.info("Input Entry: {}", updating);
		
		final Person oldObj = mapper.fromEntry(existing, Person.class);
		final Person newObj = mapper.fromEntry(updating, Person.class);
		
		final ModifyRequest request = mapper.createModifyRequest(existing, oldObj, newObj);
		log.info("Modify request: {}", request);
		assertNotNull(request);
		assertThat(request.getModifications(), empty());
	}

	@Test public void stringEqualsBytesPassword() throws LdapException {
		final LdapMapper<Person> mapper = new LdapMapper<>();
		
		final String password = "{SSHA}BacKnhFVjpSunHYgivCVPAzcavAZZe9QFtd51A==";

		final Entry existing = new DefaultEntry("uid=hendy,ou=users,dc=aksimata,dc=com");
		existing.put("objectClass", "organizationalPerson", "extensibleObject", "inetOrgPerson", "uidObject");
		existing.put("uid", "hendy");
		existing.put("cn", "Hendy Irawan");
		existing.put("userPassword", password);
		log.info("Input Entry: {}", existing);
		
		final Entry updating = new DefaultEntry("uid=hendy,ou=users,dc=aksimata,dc=com");
		updating.put("objectClass", "organizationalPerson", "extensibleObject", "inetOrgPerson", "uidObject");
		updating.put("uid", "hendy");
		updating.put("cn", "Hendy Irawan");
		updating.put("userPassword", password.getBytes());
		log.info("Input Entry: {}", updating);
		
		final Person oldObj = mapper.fromEntry(existing, Person.class);
		final Person newObj = mapper.fromEntry(updating, Person.class);
		
		final ModifyRequest request = mapper.createModifyRequest(existing, oldObj, newObj);
		log.info("Modify request: {}", request);
		assertNotNull(request);
		assertThat(request.getModifications(), empty());
	}

	@Test public void canChangePassword() throws LdapException {
		final LdapMapper<Person> mapper = new LdapMapper<>();
		
		final String password = "{SSHA}BacKnhFVjpSunHYgivCVPAzcavAZZe9QFtd51A==";

		final Entry existing = new DefaultEntry("uid=hendy,ou=users,dc=aksimata,dc=com");
		existing.put("objectClass", "organizationalPerson", "extensibleObject", "inetOrgPerson", "uidObject");
		existing.put("uid", "hendy");
		existing.put("cn", "Hendy Irawan");
		existing.put("userPassword", password.getBytes());
		log.info("Input Entry: {}", existing);
		
		final Entry updating = new DefaultEntry("uid=hendy,ou=users,dc=aksimata,dc=com");
		updating.put("objectClass", "organizationalPerson", "extensibleObject", "inetOrgPerson", "uidObject");
		updating.put("uid", "hendy");
		updating.put("cn", "Hendy Irawan");
		updating.put("userPassword", password + "a");
		log.info("Input Entry: {}", existing);
		
		final Person oldObj = mapper.fromEntry(existing, Person.class);
		final Person newObj = mapper.fromEntry(updating, Person.class);
		
		final ModifyRequest request = mapper.createModifyRequest(existing, oldObj, newObj);
		log.info("Modify request: {}", request);
		assertNotNull(request);
		assertThat(request.getModifications(), hasSize(1));
		final Modification modification = request.getModifications().iterator().next();
		assertEquals(ModificationOperation.REPLACE_ATTRIBUTE, modification.getOperation());
		assertEquals("userPassword", modification.getAttribute().getUpId());
	}
	
	@Test
	public void canMapFromDateToDateTime() throws LdapException {
		final LdapMapper<SocialPerson> mapper = new LdapMapper<>();
		
		final Entry existing = new DefaultEntry("uid=hendy,ou=users,dc=aksimata,dc=com");
		existing.put("objectClass", "organizationalPerson", "extensibleObject", "inetOrgPerson", "uidObject");
		existing.put("uid", "hendy");
		existing.put("cn", "Hendy Irawan");
		existing.put("birthDate", "19831213170000Z");
		log.info("Input Entry: {}", existing);
		
		final SocialPerson person = mapper.fromEntry(existing, SocialPerson.class);
		final DateTimeZone wib = DateTimeZone.forID("Asia/Jakarta");
		assertEquals(new DateTime(1983, 12, 14, 0, 0, wib), person.getBirthDate());
	}
	
	@Test
	public void canMapToDateTime() throws LdapException {
		final LdapMapper<SocialPerson> mapper = new LdapMapper<>();
		
		final SocialPerson hendy = new SocialPerson("hendy", "hendy.irawan", "Hendy", "Irawan");
		final DateTimeZone wib = DateTimeZone.forID("Asia/Jakarta");
		hendy.setBirthDate(new DateTime(1983, 12, 14, 0, 0, wib));
		log.info("Input Person: {}", hendy);
		
		Entry entry = mapper.toEntry(hendy, "ou=users,dc=aksimata,dc=com");
		log.info("Output Entry: {}", entry);

		assertEquals("19831213170000.000Z", entry.get("birthDate").getString());//, "19831213170000Z");
	}
	
	@Test
	public void canMapFromCurrencyUnit() throws LdapException {
		final LdapMapper<SocialPerson> mapper = new LdapMapper<>();
		
		final Entry existing = new DefaultEntry("uid=hendy,ou=users,dc=aksimata,dc=com");
		existing.put("objectClass", "organizationalPerson", "extensibleObject", "inetOrgPerson", "uidObject");
		existing.put("uid", "hendy");
		existing.put("cn", "Hendy Irawan");
		existing.put("currency", "IDR");
		log.info("Input Entry: {}", existing);
		
		final SocialPerson person = mapper.fromEntry(existing, SocialPerson.class);
		final CurrencyUnit idr = Monetary.getCurrency("IDR");
		assertEquals(idr, person.getCurrency());
	}
	
	@Test
	public void canMapToCurrencyUnit() throws LdapException {
		final LdapMapper<SocialPerson> mapper = new LdapMapper<>();
		
		final SocialPerson hendy = new SocialPerson("hendy", "hendy", "Hendy", "Irawan");
		hendy.setCurrency(Monetary.getCurrency("IDR"));
		log.info("Input Person: {}", hendy);
		
		final Entry personEntry = mapper.toEntry(hendy, "ou=users");
		assertEquals("IDR", personEntry.get("currency").getString());
	}
	
	@Test
	public void canMapFromBooleanTrue() throws LdapException {
		final LdapMapper<SocialPerson> mapper = new LdapMapper<>();
		
		final Entry existing = new DefaultEntry("uid=hendy,ou=users,dc=aksimata,dc=com");
		existing.put("objectClass", "organizationalPerson", "extensibleObject", "inetOrgPerson", "uidObject");
		existing.put("uid", "hendy");
		existing.put("cn", "Hendy Irawan");
		existing.put("newsletterSubscriptionEnabled", "TRUE");
		log.info("Input Entry: {}", existing);
		
		final SocialPerson person = mapper.fromEntry(existing, SocialPerson.class);
		assertEquals(true, person.getNewsletterSubscriptionEnabled());
	}
	
	@Test
	public void canMapFromBooleanTrue2() throws LdapException {
		final LdapMapper<SocialPerson> mapper = new LdapMapper<>();
		
		final Entry existing = new DefaultEntry("uid=hendy,ou=users,dc=aksimata,dc=com");
		existing.put("objectClass", "organizationalPerson", "extensibleObject", "inetOrgPerson", "uidObject");
		existing.put("uid", "hendy");
		existing.put("cn", "Hendy Irawan");
		existing.put("newsletterSubscriptionEnabled", "true");
		log.info("Input Entry: {}", existing);
		
		final SocialPerson person = mapper.fromEntry(existing, SocialPerson.class);
		assertEquals(true, person.getNewsletterSubscriptionEnabled());
	}
	
	@Test
	public void canMapToBooleanTrue() throws LdapException {
		final LdapMapper<SocialPerson> mapper = new LdapMapper<>();
		
		final SocialPerson hendy = new SocialPerson("hendy", "hendy", "Hendy", "Irawan");
		hendy.setNewsletterSubscriptionEnabled(true);
		log.info("Input Person: {}", hendy);
		
		final Entry personEntry = mapper.toEntry(hendy, "ou=users");
		assertEquals("TRUE", personEntry.get("newsletterSubscriptionEnabled").getString());
	}
	
	@Test
	public void canMapFromBooleanFalse() throws LdapException {
		final LdapMapper<SocialPerson> mapper = new LdapMapper<>();
		
		final Entry existing = new DefaultEntry("uid=hendy,ou=users,dc=aksimata,dc=com");
		existing.put("objectClass", "organizationalPerson", "extensibleObject", "inetOrgPerson", "uidObject");
		existing.put("uid", "hendy");
		existing.put("cn", "Hendy Irawan");
		existing.put("newsletterSubscriptionEnabled", "FALSE");
		log.info("Input Entry: {}", existing);
		
		final SocialPerson person = mapper.fromEntry(existing, SocialPerson.class);
		assertEquals(false, person.getNewsletterSubscriptionEnabled());
	}
	
	@Test
	public void canMapFromBooleanFalse2() throws LdapException {
		final LdapMapper<SocialPerson> mapper = new LdapMapper<>();
		
		final Entry existing = new DefaultEntry("uid=hendy,ou=users,dc=aksimata,dc=com");
		existing.put("objectClass", "organizationalPerson", "extensibleObject", "inetOrgPerson", "uidObject");
		existing.put("uid", "hendy");
		existing.put("cn", "Hendy Irawan");
		existing.put("newsletterSubscriptionEnabled", "false");
		log.info("Input Entry: {}", existing);
		
		final SocialPerson person = mapper.fromEntry(existing, SocialPerson.class);
		assertEquals(false, person.getNewsletterSubscriptionEnabled());
	}
	
	@Test
	public void canMapToBooleanFalse() throws LdapException {
		final LdapMapper<SocialPerson> mapper = new LdapMapper<>();
		
		final SocialPerson hendy = new SocialPerson("hendy", "hendy", "Hendy", "Irawan");
		hendy.setNewsletterSubscriptionEnabled(false);
		log.info("Input Person: {}", hendy);
		
		final Entry personEntry = mapper.toEntry(hendy, "ou=users");
		assertEquals("FALSE", personEntry.get("newsletterSubscriptionEnabled").getString());
	}
	
	@Test
	public void cantMapSaldo() throws LdapException {
		final LdapMapper<SocialPerson> ldapMapper = new LdapMapper<>();
		
		final SocialPerson person = new SocialPerson("hendy", "hendy", "Hendy", "Irawan");
		person.setDebitBalance(new BigDecimal(5000000));
		person.setDebitCurrency(Monetary.getCurrency("IDR"));
		log.info("Input Person: {}", person);
		
		final Entry personEntry = ldapMapper.toEntry(person, "ou=users");
		assertEquals(new BigDecimal(5000000), new BigDecimal(personEntry.get("debitBalance").getString()));
	}
	
	@Test
	public void canMapAccountStatus() throws LdapException {
		//FIXME: not fixed for Enum..
		final LdapMapper<Object> mapper = new LdapMapper<>();
		final SocialPerson person = new SocialPerson("hendy", "hendy", "Hendy", "Irawan");
		person.setAccountStatus(AccountStatus.ACTIVE);
		
		final Entry entry = mapper.toEntry(person, "ou=users");
		assertEquals(AccountStatus.ACTIVE.name(), entry.get("accountStatus").getString());
		
		final SocialPerson object = (SocialPerson) mapper.fromEntry(entry, SocialPerson.class);
		assertEquals(AccountStatus.ACTIVE.name().toLowerCase(), object.getAccountStatus());
	}
	
}
