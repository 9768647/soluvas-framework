package org.soluvas.data.person.shell; 

import static org.fusesource.jansi.Ansi.ansi;

import org.apache.felix.gogo.commands.Command;
import org.apache.felix.gogo.commands.Option;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soluvas.commons.Email2;
import org.soluvas.commons.Gender;
import org.soluvas.commons.entity.Person2;
import org.soluvas.commons.shell.ExtCommandSupport;
import org.soluvas.commons.tenant.TenantRef;
import org.soluvas.data.StatusMask;
import org.soluvas.data.domain.Page;
import org.soluvas.data.domain.PageRequest;
import org.soluvas.data.domain.Sort.Direction;
import org.soluvas.data.person.PersonRepository;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Shell command to list entities of {@link Person2}.
 *
 * @author ceefour
 */
@Service @Scope("prototype")
@Command(scope="person", name="ls", description="List Person entities.")
public class PersonLsCommand extends ExtCommandSupport {

	private static final Logger log = LoggerFactory.getLogger(PersonLsCommand.class);

	@Option(name="--page", description="Page number.")
	private transient long pageNumber = 0;
	@Option(name="--pagesize", description="Page size.")
	private transient long pageSize = 100;
	@Option(name="--sort", description="Sort property.")
	private transient String sortProperty = "modificationTime";
	@Option(name="--sortdir", description="Sort direction.")
	private transient Direction sortDir = Direction.DESC;
	@Option(name="-a", aliases="--all", description="Shortcut to --status=RAW.")
	private Boolean all;
	@Option(name="--status", description="Status mask: RAW|ACTIVE_ONLY|INCLUDE_INACTIVE|DRAFT_ONLY|VOID_ONLY.")
	private transient StatusMask statusMask = StatusMask.ACTIVE_ONLY;
	
	@Override
	protected Long doExecute() throws Exception {
		if (all != null && all) {
			statusMask = StatusMask.RAW;
		}
		final PersonRepository personRepo = getBean(PersonRepository.class);
		final TenantRef tenant = getBean(TenantRef.class);
		System.out.println(ansi().render("@|negative_on %3s|%-15s|%-20s|%-21s|%-10s|%-30s|@",
				"№", "ID", "Slug", "Name", "Status", "Email(s)" ));
		final Page<Person2> personPage = personRepo.findAll(new PageRequest(pageNumber, pageSize, sortDir, sortProperty));
		int i = 0;
		for (Person2 it : personPage.getContent()) {
			final String genderStr = it.getGender() == Gender.MALE ? "@|bold,blue ♂|@" : it.getGender() == Gender.FEMALE ? "@|bold,magenta ♀|@" : " ";
			String emails = "";
			if (!it.getEmails().isEmpty()) {
				for (final Email2 email : it.getEmails()) {
					if (emails.equals("")) {
						emails += email.getEmail();
					} else {
						emails += " " + email.getEmail();
					}
				}
			} else {
				emails = it.getEmail();
			}
			System.out.println(ansi().render("@|bold,black %3d||@@|bold %-15s|@@|bold,black ||@%-20s@|bold,black ||@" + genderStr + "%-20s@|bold,black ||@%-10s@|bold,black ||@%-30s",
				++i, it.getId(), it.getSlug(), it.getName(), it.getAccountStatus(), emails) );
		}
		System.out.println(ansi().render("@|bold %d|@ of @|bold %d|@ Person entities in @|bold %s|@",
			personPage.getNumberOfElements(), personPage.getTotalElements(), tenant.getTenantId()));
		return personPage.getTotalElements();
	}

}