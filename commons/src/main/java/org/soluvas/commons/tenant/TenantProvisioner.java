package org.soluvas.commons.tenant;

import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.joda.time.DateTime;
import org.soluvas.commons.AdminMall;
import org.soluvas.commons.AppManifest;

/**
 * A provisioner is different that {@link TenantRepository} in that it's not
 * always used during runtime. It may be an ad-hoc management command ran from shell.
 * @author ceefour
 */
public interface TenantProvisioner<T> {
	
	/**
	 * Creates a blank provisionData.
	 * @return
	 */
	T newProvisionData();
	
	AppManifest add(String tenantId, AppManifest appManifest, T provisionData, String trackingId) ;

	@Deprecated
	Set<String> findAllStyles();
	
	void cpp(File file);

	void removeDatabases(Set<String> tenantIds);

	void removeSchemas(Set<String> tenantIds);
	
	/**
	 * key: tenantId
	 * value: creationTime of tenant's shop
	 * @param tenantIds TODO
	 * @return
	 */
	public Map<String, DateTime> getTenantCreationTimes(Collection<String> tenantIds);
	
	Map<String, List<AdminMall>> findAllAdmin(final Set<String> tenantIds);
	
}
