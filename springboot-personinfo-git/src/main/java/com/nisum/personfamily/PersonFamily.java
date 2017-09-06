package com.nisum.personfamily;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.nisum.controller.Person;

@Entity
public class PersonFamily {
	
		
	@Id
	private String id;
	private String name;
	private String description;
	
	@ManyToOne
	private Person person;

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

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public PersonFamily(String id, String name, String description, String personId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.person = new Person(personId,"","");
		
		
	}

	
}
