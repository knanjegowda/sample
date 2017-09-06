package com.nisum.controller;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
	
		
	@Id
	private String id;
	private String name;
	private String age;	
	

	
	public Person(String name, String age, String id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
		
	}
	
	public Person() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
}
