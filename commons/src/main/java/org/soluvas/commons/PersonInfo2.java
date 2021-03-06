/**
 */
package org.soluvas.commons;

import java.io.Serializable;

@SuppressWarnings("serial")
public class PersonInfo2 implements Identifiable, Serializable {
	
	private String id;
	private String email;
	private String imageId;
	private String mobileNumber;
	private String name;
	private String photoId;
	private String slug;
	private Gender gender;
	private String role;
	
	@Override
	public String getId() {
		return id;
	}
	@Override
	public void setId(String value) {
		this.id = value;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getImageId() {
		return imageId;
	}
	public void setImageId(String imageId) {
		this.imageId = imageId;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhotoId() {
		return photoId;
	}
	public void setPhotoId(String photoId) {
		this.photoId = photoId;
	}
	public String getSlug() {
		return slug;
	}
	public void setSlug(String slug) {
		this.slug = slug;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

}
