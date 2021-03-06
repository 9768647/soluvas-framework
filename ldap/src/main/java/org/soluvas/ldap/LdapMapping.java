package org.soluvas.ldap;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;

/**
 * Describes LDAP attributes mapping to class fields. 
 * @author ceefour
 */
public class LdapMapping {
	
	private final String primaryObjectClass;
	private final Set<String> objectClasses;
	private final LdapAttributeMapping rdn;
	private final List<LdapAttributeMapping> attributes;
	
	/**
	 * @param objectClasses The ordering of objectClass-es is special. The first objectClass will be used by
	 * 		{@link LdapRepository#findAll()}.
	 * @param rdn
	 * @param attributes
	 */
	public LdapMapping(final Collection<String> objectClasses, final LdapAttributeMapping rdn,
			final List<LdapAttributeMapping> attributes) {
		super();
		this.primaryObjectClass = Iterables.getFirst(objectClasses, null);
		this.objectClasses = ImmutableSet.copyOf(objectClasses);
		this.rdn = rdn;
		this.attributes = attributes;
	}
	
	/**
	 * @return the primaryObjectClass
	 */
	public String getPrimaryObjectClass() {
		return primaryObjectClass;
	}

	/**
	 * Get the <tt>objectClass</tt>-es defined by an LDAP POJO {@link LdapEntry}-annotated entity.
	 * @return the objectClasses
	 */
	public Set<String> getObjectClasses() {
		return objectClasses;
	}

	/**
	 * @return the rdn
	 */
	public LdapAttributeMapping getRdn() {
		return rdn;
	}

	/**
	 * @return the attributes
	 */
	public List<LdapAttributeMapping> getAttributes() {
		return attributes;
	}
	
	public boolean isValid() {
		try {
			Preconditions.checkNotNull(objectClasses, "objectClass-es must not be null");
			Preconditions.checkArgument(!objectClasses.isEmpty(), "objectClass-es must not be empty");
			Preconditions.checkNotNull(rdn, "RDN attribute must not be null");
			Preconditions.checkNotNull(attributes, "attribute mappings must not be null");
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LdapMapping ["
				+ (objectClasses != null ? "objectClasses=" + objectClasses
						+ ", " : "") + (rdn != null ? "rdn=" + rdn + ", " : "")
				+ (attributes != null ? "attributes=" + attributes : "") + "]";
	}

}
