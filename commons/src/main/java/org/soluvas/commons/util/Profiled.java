package org.soluvas.commons.util;

import org.slf4j.Logger;

/**
 * Logs DEBUG the execution time between the creation and the {@link #close()} method was called.
 * @author haidar
 */
public class Profiled implements AutoCloseable {

	private final long startTime;
	private final Logger log;
	private final String title;

	public Profiled(Logger log, String title) {
		super();
		this.log = log;
		this.title = title;
		startTime = System.currentTimeMillis();
	}
	
	@Override
	public void close() throws Exception {
		final long elapsed = System.currentTimeMillis() - startTime;
		log.debug("{}ms « {}", elapsed, title);
	}

}