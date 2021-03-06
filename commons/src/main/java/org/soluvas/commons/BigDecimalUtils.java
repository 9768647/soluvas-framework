package org.soluvas.commons;

import java.math.BigDecimal;
import java.math.MathContext;

import javax.annotation.Nullable;
import javax.measure.Measure;
import javax.measure.unit.Unit;

/**
 * @author anton
 *
 */
public class BigDecimalUtils {

	/**
	 * Like {@link BigDecimal#stripTrailingZeros()} but always uses plain notation,
	 * not engineering notation.
	 * @param inp
	 * @return
	 */
	@Nullable
	public static BigDecimal stripFractionZeros(@Nullable BigDecimal inp) {
		if (inp == null) {
			return null;
		}
		final BigDecimal stripped = inp.stripTrailingZeros();
		final BigDecimal fixed = stripped.scale() < 0 ? stripped.setScale(0) : stripped;
		return fixed;
	}

	public static boolean isNegative(java.math.BigDecimal b) {
		return b.signum() == -1;
	}
	
	@SuppressWarnings({ "null", "rawtypes", "unchecked" })
	public static BigDecimal getValue(Measure<?> measure) {
		return measure.decimalValue((Unit) measure.getUnit(), MathContext.UNLIMITED);
	}

}
