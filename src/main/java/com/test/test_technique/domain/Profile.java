package com.test.test_technique.domain;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PROFILES")
public class Profile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;
	String label;
	String description;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Profile(Integer id, String label, String description) {
		super();
		this.id = id;
		this.label = label;
		this.description = description;
	}
	
	public Profile(String label, String description) {
		super();
		this.label = label;
		this.description = description;
	}
	
	
	@Override
	public String toString() {
		return "Profile [id=" + id + ", label=" + label + ", description=" + description + "]";
	}
	
	
	

}
