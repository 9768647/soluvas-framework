package org.soluvas.commons;

import javax.annotation.Nullable;

import com.google.common.base.Function;

/**
 * Return {@link Identifiable#getId()}.
 * @author ceefour
 */
public class IdFunction implements Function<Identifiable, String> {

	/* (non-Javadoc)
	 * @see com.google.common.base.Function#apply(java.lang.Object)
	 */
	@Override @Nullable
	public String apply(@Nullable Identifiable input) {
		return input != null ? input.getId() : null;
	}

}
