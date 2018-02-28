package com.OodlesCrudApp.main;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//import com.OodlesCrudApp.Subjects.Subjects;

@Entity

public class Topic {
	@Id
	private String id;
	private String name;
	private String description;
	@ManyToOne
	private Subjects subjects;
	
	
	
	public Topic(String id, String name, String description,String subjectId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.subjects=new Subjects(subjectId,"","");
	}
	public Topic()
	{
		super();
		
	}
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Subjects getSubjects() {
		return subjects;
	}
	public void setSubjects(Subjects subjects) {
		this.subjects = subjects;
	}
	

}