package com.nisum.personfamily;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nisum.controller.Person;

@Controller
public class PersonFamilyController {
	
	@Autowired
	private PersonFamilyService personFamilyService;	
	
	@RequestMapping("/person/{id}/personfamily")
	public List<PersonFamily> getAllPersonFamily(@PathVariable String id){
		return personFamilyService.getAllPersonFamily(id);
		}
	
	@RequestMapping("/person/{personid}/personfamily/{id}")
	public PersonFamily gettPersonFamily(@PathVariable String id) {
		return personFamilyService.gettPersonFamily(id);
		}
	
	
	@RequestMapping(method=RequestMethod.POST , value="/person/{personid}/personfamily")
	public void addPersonFamily(@RequestBody PersonFamily personFamily, @PathVariable String personid) {
		personFamily.setPerson(new Person(personid, "" , ""));
		personFamilyService.addPersonFamily(personFamily);
	}
	
	@RequestMapping(method=RequestMethod.PUT , value="/person/{personid}/personfamily/{id}")
	public void updatePersonFamily(@RequestBody PersonFamily personFamily,@PathVariable String personid, @PathVariable String id) {
		personFamily.setPerson(new Person(personid, "" , ""));
		personFamilyService.updatePersonFamily(personFamily);
	}
	
	@RequestMapping(method=RequestMethod.DELETE , value="/person/{personid}/personfamily/{id}")
	public void deletePersonFamily(@PathVariable String id) {
		personFamilyService.deletePersonFamily(id);
	}
	}
