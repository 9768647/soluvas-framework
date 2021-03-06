package org.soluvas.security.shell; 

import java.util.Set;

import org.apache.felix.gogo.commands.Argument;
import org.apache.felix.gogo.commands.Command;
import org.apache.felix.gogo.commands.Option;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soluvas.commons.shell.ExtCommandSupport;
import org.soluvas.security.Role;
import org.soluvas.security.SecurityRepository;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.google.common.base.Joiner;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableSet;


/**
 * Add a {@link Role} to the Security Repository.
 * 
 * @author ceefour
 */
@Service @Scope("prototype")
@Command(scope = "sec", name = "roleadd", description = "Add a Role to the Security Repository")
public class SecRoleAddCommand extends ExtCommandSupport {

	private static final Logger log = LoggerFactory.getLogger(SecRoleAddCommand.class);

	@Option(name="-d", aliases="--description", description="Role description.")
	private String description;
	@Argument(index=0, name="role", required=true, description="Role name.")
	private String role;
	@Argument(index=1, name="personId ...", required=false, description="Role members as Person ID(s).", multiValued=true)
	private String[] personIds;

	@Override
	protected Object doExecute() throws Exception {
		final SecurityRepository securityRepo = getBean(SecurityRepository.class);
		final Set<String> personIdSet = ImmutableSet.copyOf(Optional.fromNullable(personIds).or(new String[] {}));
		System.out.format("Add role %s with members: %s and description '%s'...",
				role,
				Joiner.on(", ").join(personIdSet),
				description);
		securityRepo.addRole(role, description, personIdSet);
		System.out.format(" OK\n");
		return null;
	}

}