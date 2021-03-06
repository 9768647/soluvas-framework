package org.soluvas.commons.shell;

import javax.annotation.Nullable;

import org.apache.felix.gogo.commands.Argument;
import org.apache.felix.gogo.commands.Command;
import org.apache.felix.gogo.commands.Option;
import org.soluvas.commons.tenant.ProvisionData;
import org.soluvas.commons.tenant.TenantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;

/**
 * Starts tenant(s) using {@link TenantRepository#start(java.util.Set)}.
 * @author ceefour
 */
@Service @Scope("prototype")
@Command(scope="tenant", name="remove", description="Removes tenant(s) using TenantRepository#remove(java.util.Set).")
public class TenantRemoveCommand extends ExtCommandSupport {
	
	
	/**
	 * Not required so it doesn't break apps that don't use {@link TenantRepository}. 
	 */
	@Autowired(required=false) @Nullable
	private TenantRepository<ProvisionData> tenantRepo;
	
	@Option(name="--forge", aliases="-f", description="Forge for removing..")
	private boolean f;
	
	@Argument(name="tenantId ...", required=true, multiValued=true, description="Tenant ID(s)")
	private String[] tenantIds;
	
	
	public TenantRemoveCommand() {
		super(false);
	}
	
	@Override
	protected Void doExecute() throws Exception {
		if (f) {
			Preconditions.checkNotNull(tenantRepo, "TenantRepository bean must present");
			tenantRepo.remove(ImmutableSet.copyOf(tenantIds));
		}
		return null;
	}

}
