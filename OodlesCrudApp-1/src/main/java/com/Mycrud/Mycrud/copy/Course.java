package com.Mycrud.Mycrud.copy;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course 
{
	@Id
	String id;
	
	String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Course(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Course() {
		super();
		this.id = id;
		this.name = name;
	}
	
}
