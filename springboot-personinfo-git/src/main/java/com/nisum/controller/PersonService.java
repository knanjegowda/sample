package com.nisum.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
	
	@Autowired
	private PersonRespository personRespository;
	
	
	public List<Person> getAllPersons() {
		List<Person> persons = new ArrayList<Person>();
		personRespository.findAll()
		.forEach(persons::add);
		return persons;
	}	
	
	public Person getPerson(String id) {
		return personRespository.findOne(id);
	}
	
	public void addPerson(Person person) {
		personRespository.save(person);
	}

	
	public void deletePerson(String id) {
		personRespository.delete(id);		
	}

	public void updatePerson(Person person, String id) {
		personRespository.save(person);		
	}	
}
