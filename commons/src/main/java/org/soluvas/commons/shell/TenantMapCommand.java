package org.soluvas.commons.shell; 

import static org.fusesource.jansi.Ansi.ansi;

import java.util.Map;
import java.util.Map.Entry;

import org.apache.felix.gogo.commands.Command;
import org.apache.felix.gogo.commands.Option;
import org.soluvas.commons.AppManifest;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Lists tenant {@link AppManifest}s.
 *
 * @author ceefour
 * @see TenantLsCommand
 * @see TenantIdsCommand
 */
@Service @Scope("prototype")
@Command(scope="tenant", name="map", description="Lists tenant AppManifests using tenantMap.")
public class TenantMapCommand extends ExtCommandSupport {
	
	@Option(name="-1", description="Only return IDs, similar to tenant:ids command")
	public transient boolean idsOnly = false;
	
	public TenantMapCommand() {
		super(false);
	}
	
	@Override
	protected Object doExecute() throws Exception {
		final Map<String, AppManifest> tenantMap = appCtx.getBean("tenantMap", Map.class);
		if (idsOnly) {
			return tenantMap.keySet();
		}
		System.out.println(ansi().render("@|negative_on %3s|%-15s|%-20s|%-25s|%-30s|%-5s|%-2s|%-20s|%-3s|@",
				"№", "ID", "Title", "Domain", "Email", "Lang", "CC", "Time Zone", "$"));
		int i = 0;
		for (final Entry<String, AppManifest> entry : tenantMap.entrySet()) {
			AppManifest tenant = entry.getValue();
			System.out.println(ansi().render("@|bold,black %3d||@%-15s@|bold,black ||@%-20s@|bold,black ||@%-25s@|bold,black ||@%-30s@|bold,black ||@%-5s@|bold,black ||@%-2s@|bold,black ||@%-20s@|bold,black ||@%-3s",
				++i, entry.getKey(), tenant.getTitle(), tenant.getDomain(), tenant.getGeneralEmail(), 
				tenant.getDefaultLocale().toLanguageTag(), tenant.getDefaultCountryCode(), 
				tenant.getDefaultTimeZone(), tenant.getDefaultCurrency()));
		}
		System.out.println(ansi().render("@|bold %d|@ tenants", i));
		return null;
	}

}