package org.soluvas.commons.locale;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import javax.money.format.AmountFormatQuery;
import javax.money.format.AmountFormatQueryBuilder;
import javax.money.format.MonetaryAmountFormat;
import javax.money.format.MonetaryFormats;

import org.javamoney.moneta.Money;
import org.javamoney.moneta.format.AmountFormatParams;
import org.javamoney.moneta.format.CurrencyStyle;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.format.DateTimeFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Provides locale information based on a context (usually logged in user).
 * 
 * <p>For shell, the locale information is retrieved from: (in order)
 * 
 * <ol>
 * <li>The CommandSession</li>
 * <li>The default Locale for the tenant</li>
 * <li>The default Locale for the OSGi framework (global)</li> 
 * </ol>
 * 
 * <p>The goal is 1:1 API mapping with the JavaScript counterpart. 
 * 
 * <p>References:
 * 
 * <ol>
 * <li>Eclipse RCP LocaleProvider: http://help.eclipse.org/indigo/index.jsp?topic=%2Forg.eclipse.platform.doc.isv%2Freference%2Fapi%2Forg%2Feclipse%2Fosgi%2Fservice%2Flocalization%2FLocaleProvider.html</li>
 * </ol>
 *  
 * @author ceefour
 */
public class LocaleContext {

	private static final Logger log = LoggerFactory
			.getLogger(LocaleContext.class);
	private final Locale locale;
	
	public LocaleContext() {
		super();
		// TODO: get from LDAP
		this.locale = new Locale("in", "ID"); // the ID is required, otherwise you'll get 2012 Agustus 16!
	}
	
	public LocaleContext(Locale locale) {
		this.locale = locale;
	}
	
	/**
	 * Get the preferred {@link Locale} for the specified user.
	 * @param personId
	 * @return
	 * @todo Always 'in' (aka id_ID), Implement this
	 */
	@Nonnull
	public Locale getLocale() {
		return locale;
	}

	/**
	 * Get the preferred DateTimeZone for the specified user.
	 * @param personId
	 * @return
	 * @todo Always Asia/Jakarta, implement this
	 */
	@Nonnull
	public DateTimeZone getTimeZone() {
		// TODO: get from LDAP
		return DateTimeZone.forID("Asia/Jakarta");
	}

	/**
	 * @deprecated Use {@link PersonUtils#formatLongDateTime(String, DateTime)}.
	 * @param personId
	 * @param time
	 * @return
	 */
	@Deprecated
	public DateTime toPersonTime(DateTime time) {
		DateTimeZone tz = getTimeZone();
		return time.withZone(tz);
	}
	
	// Note about date formats:
	// short datetime: month is numeric
	// medium datetime: month is abbr
	// long datetime: month is full, second added to time. timezone depends on language, for "ID", it is omitted :(
	// short time: hour minute only
	// medium time: hour minute second
	
	@Nullable
	public String formatShortDateTime(@Nullable ReadableInstant instant) {
		if (instant == null)
			return null;
		else
			return DateTimeFormat.shortDateTime().withLocale(getLocale()).withZone(getTimeZone())
				.print(instant);
	}

	public String formatShortDate(@Nullable ReadablePartial partial) {
		if (partial == null)
			return "";
		else
			return DateTimeFormat.shortDate().withLocale(getLocale()).withZone(getTimeZone())
				.print(partial);
	}

	@Nullable
	public String formatShortDateTime(@Nullable Date time) {
		if (time == null)
			return null;
		else
			return formatShortDateTime(new DateTime(time));
	}

	/**
	 * Format a {@link DateTime} including time zone.
	 * 
	 * We have workarounds to render proper WIB/WITA/WIT on Indonesian locale.
	 * 
	 * @param personId
	 * @param instant
	 * @return
	 */
	@Nullable
	public String formatLongDateTime(@Nullable ReadableInstant instant) {
		if (instant == null)
			return null;
		final Locale locale = getLocale();
		final DateTimeZone tz = getTimeZone();
		String suffix = "";
		if (locale.equals(new Locale("in", "ID"))) {
			//if Locale is in_ID and Timezone is Asia/Jakarta, Asia/Makassar, or Asia/Jayapura :
			//append WIB/WITA/WIT
			if (tz.equals(DateTimeZone.forID("Asia/Jakarta")))
				suffix = " WIB";
			else if (tz.equals(DateTimeZone.forID("Asia/Makassar")))
				suffix = " WITA";
			else if (tz.equals(DateTimeZone.forID("Asia/Jayapura")))
				suffix = " WIT";
			else {
				//if Locale is in_ID and Timezone is unknown
				//append a new formatter with 'z'
				suffix = " " + DateTimeFormat.forPattern("z").withLocale(locale).withZone(tz)
						.print(instant);
			}
		} else if (locale.equals(new Locale("in"))) {
			 //if Locale is "in" without and language code is not "ID", show warning
			log.warn("Using incomplete locale {} in {} to format {}, please use in_ID!", 
					locale, tz, instant );
		}
		return DateTimeFormat.fullDate().withLocale(locale).withZone(tz).print(instant) +
				" " + DateTimeFormat.shortTime().withLocale(locale).withZone(tz).print(instant) + suffix;
	}

	@Nullable
	public String formatLongDateTime(@Nullable Date time) {
		if (time == null)
			return null;
		return formatLongDateTime(new DateTime(time));
	}
	
	@Nullable
	public String formatMoney(BigDecimal amount, Currency currency) {
		if (amount == null || currency == null)
			return null;
//		NumberFormat format = NumberFormat.getCurrencyInstance(getLocale());
//		format.setCurrency(currency);
//		format.setMaximumFractionDigits(0);
//		return format.format(amount);
		return formatMoney(Money.of(amount, Monetary.getCurrency(currency.getCurrencyCode())));
	}

	@Nullable
	public String formatMoney(BigDecimal amount, CurrencyUnit currency) {
		if (amount == null || currency == null)
			return null;
//		NumberFormat format = NumberFormat.getCurrencyInstance(getLocale());
//		format.setCurrency(currency);
//		format.setMaximumFractionDigits(0);
//		return format.format(amount);
		return formatMoney(Money.of(amount, currency));
	}

	@Nullable
	public String formatMoneyHtml(BigDecimal amount, CurrencyUnit currency) {
		if (amount == null || currency == null)
			return null;
//		NumberFormat format = NumberFormat.getCurrencyInstance(getLocale());
//		format.setCurrency(currency);
//		format.setMaximumFractionDigits(0);
//		return format.format(amount);
		return formatMoneyHtml(Money.of(amount, currency));
	}

	@Nullable
	public String formatMoney(BigDecimal amount, String currency) {
		if (amount == null || currency == null)
			return null;
		return formatMoney(amount, Monetary.getCurrency(currency));
	}

	@Nullable
	public String formatMoneyHtml(BigDecimal amount, String currency) {
		if (amount == null || currency == null)
			return null;
		return formatMoneyHtml(amount, Monetary.getCurrency(currency));
	}

	@Nullable
	public String formatMoney(MonetaryAmount total) {
		if (total == null)
			return null;
		final MonetaryAmountFormat formatter = MonetaryFormats.getAmountFormat(getLocale());
		return formatter.format(total);
	}

	@Nullable
	public String formatMoneyHtml(MonetaryAmount total) {
		if (total == null)
			return null;
		final AmountFormatQuery query = AmountFormatQueryBuilder.of(getLocale()).set(CurrencyStyle.SYMBOL)
				.set(AmountFormatParams.PATTERN, "<small class=\"text-muted\">¤</small>#,##0.#####").build();
		return MonetaryFormats.getAmountFormat(query).format(total);
	}

}
