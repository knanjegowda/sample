package com.nisum.personfamily;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonFamilyService {
	
	@Autowired
	private PersonFamilyRespository personFamilyRespository;
	
	public List<PersonFamily> getAllPersonFamily(String personId) {
		List<PersonFamily> personFamilys = new ArrayList<PersonFamily>();
		personFamilyRespository.findByPerson(personId)
		.forEach(personFamilys::add);
		return personFamilys;
	}
	
	public PersonFamily gettPersonFamily(String id) {
		return personFamilyRespository.findOne(id);
	}
	
	public void addPersonFamily(PersonFamily personFamily) {
		personFamilyRespository.save(personFamily);
	}
	public void deletePersonFamily(String id) {
		personFamilyRespository.delete(id);
		
	}
	public void updatePersonFamily(PersonFamily personFamily) {
		personFamilyRespository.save(personFamily);
		
	}	
	
}
