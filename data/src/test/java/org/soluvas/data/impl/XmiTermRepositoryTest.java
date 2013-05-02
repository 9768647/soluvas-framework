package org.soluvas.data.impl;

import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import java.io.File;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soluvas.data.Term;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

/**
 * @author adri
 *
 */
public class XmiTermRepositoryTest {

	private static final Logger log = LoggerFactory
			.getLogger(XmiTermRepositoryTest.class);
	private XmiTermRepository repo;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		repo = new XmiTermRepository("base", "Color", 
				ImmutableList.of(XmiTermRepositoryTest.class.getResource("/org/soluvas/data/base_Color-base.DataCatalog.xmi")),
				ImmutableMap.of("berbatik", new File(System.getProperty("user.home"), "git/bedi-model/berbatik_common/base_Color-berbatik.DataCatalog.xmi")));
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void count() {
		final long count = repo.count();
		log.info("Count {}", count);
		// 147 standard HTML colors
		assertThat(count, greaterThan(100L));
	}

	@Test
	public void addTerm() {
		final Term term = new TermImpl();
		term.setNsPrefix("berbatik");
		term.setKindNsPrefix("base");
		term.setKindName("Color");
		term.setName("merahcinta");
		term.setColor("#f0f0dd");
		term.setDisplayName("Merah Cinta");
		log.info("Adding {}", term);
		final Term added = repo.add(term);
		assertNotNull(added);
		assertEquals(148L, repo.count());
	}

}
