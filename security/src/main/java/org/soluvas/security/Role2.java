package org.soluvas.security;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.joda.time.DateTime;
import org.soluvas.commons.Identifiable;
import org.soluvas.commons.Timestamped;
import org.soluvas.commons.mongo.DateTimeConverter;

import com.google.code.morphia.annotations.Converters;
import com.google.code.morphia.annotations.Id;
import com.google.code.morphia.converters.EnumConverter;

/**
 * @author anisa
 *
 */
@Converters({DateTimeConverter.class, EnumConverter.class})
public class Role2 implements Serializable, Identifiable, Timestamped {
	
	private static final long serialVersionUID = 1L;

	
	//attribute 
	@Id private String id;
	
	private String name;
	
	private String description;
	
	private DateTime creationTime;
	
	private DateTime modificationTime;
	
	private AssignMode assignMode;
	
	private Map<String, List<String>> permissions;
	
	//constructor tanpa parameter
	public Role2() {
		super();
	}
	
	//contructor dengan parameter id dan name yang ber type data STRING!!!
	public Role2(final String id, final String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	//method dengan return value yg bertype  "STRING"
	public String getId() {
		return id;
	}

	@Override
	//method bukan return value //parameter id bertype string 
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public DateTime getCreationTime() {
		return creationTime;
	}

	@Override
	public void setCreationTime(DateTime creationTime) {
		this.creationTime = creationTime;
	}

	@Override
	public DateTime getModificationTime() {
		return modificationTime;
	}

	@Override
	public void setModificationTime(DateTime modificationTime) {
		this.modificationTime = modificationTime;
	}

	public AssignMode getAssignMode() {
		return assignMode;
	}

	public void setAssignMode(AssignMode assignMode) {
		this.assignMode = assignMode;
	}

	public Map<String, List<String>> getPermissions() {
		return permissions;
	}

	public void setPermissions(Map<String, List<String>> permissions) {
		this.permissions = permissions;
	}

	@Override
	public String toString() {
		return "Role2 [id=" + id + ", name=" + name + ", description=" + description + ", creationTime=" + creationTime
				+ ", modificationTime=" + modificationTime + ", assignMode=" + assignMode + ", permissions="
				+ permissions + "]";
	}
	
}
