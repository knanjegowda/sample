package com.nisum.personfamily;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonFamilyRespository extends CrudRepository<PersonFamily, String>{
	
	public List<PersonFamily> findByPerson(String personId);	

}
