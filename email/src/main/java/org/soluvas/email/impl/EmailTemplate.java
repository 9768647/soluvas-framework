package org.soluvas.email.impl;

import javax.annotation.Nullable;

/**
 * These attributes are all Mustache templates.
 * @author ceefour
 * @param <T> model
 */
public class EmailTemplate<T> {
	
	String html;
	String text;
	String subject;
	String fromName;
	String fromEmail;
//	String senderName;
//	String senderEmail;
	@Nullable
	String replyToName;
	@Nullable
	String replyToEmail;
//	String toName;
//	String toEmail;
	
	/**
	 * @return the html
	 */
	public String getHtml() {
		return html;
	}
	/**
	 * @param html the html to set
	 */
	public void setHtml(String html) {
		this.html = html;
	}
	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}
	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}
	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}
	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}
	/**
	 * @return the fromName
	 */
	public String getFromName() {
		return fromName;
	}
	/**
	 * @param fromName the fromName to set
	 */
	public void setFromName(String fromName) {
		this.fromName = fromName;
	}
	/**
	 * @return the fromEmail
	 */
	public String getFromEmail() {
		return fromEmail;
	}
	/**
	 * @param fromEmail the fromEmail to set
	 */
	public void setFromEmail(String fromEmail) {
		this.fromEmail = fromEmail;
	}
	
//	/**
//	 * @return the senderName
//	 */
//	public String getSenderName() {
//		return senderName;
//	}
//	/**
//	 * @param senderName the senderName to set
//	 */
//	public void setSenderName(String senderName) {
//		this.senderName = senderName;
//	}
//	/**
//	 * @return the senderEmail
//	 */
//	public String getSenderEmail() {
//		return senderEmail;
//	}
//	/**
//	 * @param senderEmail the senderEmail to set
//	 */
//	public void setSenderEmail(String senderEmail) {
//		this.senderEmail = senderEmail;
//	}
	
	/**
	 * @return the replyToName
	 */
	@Nullable
	public String getReplyToName() {
		return replyToName;
	}
	/**
	 * @param replyToName the replyToName to set
	 */
	public void setReplyToName(@Nullable String replyToName) {
		this.replyToName = replyToName;
	}
	/**
	 * @return the replyToEmail
	 */
	@Nullable
	public String getReplyToEmail() {
		return replyToEmail;
	}
	/**
	 * @param replyToEmail the replyToEmail to set
	 */
	public void setReplyToEmail(@Nullable String replyToEmail) {
		this.replyToEmail = replyToEmail;
	}
//	/**
//	 * @return the toName
//	 */
//	public String getToName() {
//		return toName;
//	}
//	/**
//	 * @param toName the toName to set
//	 */
//	public void setToName(String toName) {
//		this.toName = toName;
//	}
//	/**
//	 * @return the toEmail
//	 */
//	public String getToEmail() {
//		return toEmail;
//	}
//	/**
//	 * @param toEmail the toEmail to set
//	 */
//	public void setToEmail(String toEmail) {
//		this.toEmail = toEmail;
//	}
	
}
