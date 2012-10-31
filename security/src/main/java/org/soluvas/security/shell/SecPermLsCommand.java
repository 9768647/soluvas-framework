 package org.soluvas.security.shell; 

import java.util.List;

import org.apache.felix.gogo.commands.Command;
import org.apache.karaf.shell.console.OsgiCommandSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soluvas.commons.EObjectNameOrdering;
import org.soluvas.multitenant.ServiceLookup;
import org.soluvas.security.Permission;
import org.soluvas.security.SecurityCatalog;

import com.google.common.base.Joiner;

/**
 * Shell command to list available {@link Permission}s.
 * 
 * @author ceefour
 */
@Command(scope = "sec", name = "permls", description = "List available Permissions")
public class SecPermLsCommand extends OsgiCommandSupport {

	private transient Logger log = LoggerFactory.getLogger(SecPermLsCommand.class);

	private final ServiceLookup svcLookup;

	public SecPermLsCommand(ServiceLookup svcLookup) {
		super();
		this.svcLookup = svcLookup;
	}

	/* (non-Javadoc)
	 * @see org.apache.karaf.shell.console.AbstractAction#doExecute()
	 */
	@Override
	protected Object doExecute() throws Exception {
		System.out.format("%3s | %-15s | %-15s | %-15s | %-20s | %s\n", "#",
				"Domain", "Action", "Instance", "Role", "Source");
		SecurityCatalog securityCatalog = svcLookup.getSupplied(
				SecurityCatalog.class, session);
		List<Permission> sortedPermissions = new EObjectNameOrdering()
				.immutableSortedCopy(securityCatalog.getPermissions());
		int i = 0;
		for (Permission it : sortedPermissions) {
			// TODO: use locale settings to format date, currency, amount,
			// "and", many
			// TODO: format products
			final Joiner commaJoiner = Joiner.on(", ");
			System.out.format("%3d | %-15s | %-15s | %-15s | %-20s | %s\n",
					++i, commaJoiner.join(it.getDomainPermission()),
					commaJoiner.join(it.getActionPermission()), commaJoiner
							.join(it.getInstancePermission()), commaJoiner
							.join(it.getRoles()),
					it.eResource() != null ? it.eResource().getURI() : null);
		}
		System.out.format("%d Permissions\n", securityCatalog.getPermissions()
				.size());
		return null;
	}

}