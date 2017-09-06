package com.nisum.controller;

import java.util.Calendar;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PersonController {
	
	@Autowired
	private PersonService personService;	
	
	@Scheduled(initialDelay = 1000, fixedRate = 10000)
	public void run() {
	    System.out.println("Current time is :: " + Calendar.getInstance().getTime());
	}
	
	@RequestMapping("/person/{id}")
	public Person gettPerson(@PathVariable String id) {
		return personService.getPerson(id);
		}
	
	@RequestMapping(method=RequestMethod.GET , value = "/person")
	public List<Person> getAllPersons(){
		return personService.getAllPersons();
		}
	
	@RequestMapping(method=RequestMethod.POST , value="/person")
	public void addPerson(ModelMap model,@RequestBody Person person) {
		personService.addPerson(person);
	}
	
	@RequestMapping(method=RequestMethod.PUT , value="/person/{id}")
	public void updatePerson(@RequestBody Person person, @PathVariable String id) {
		personService.updatePerson(person,id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE , value="/person/{id}")
	public void deletePerson(@PathVariable String id) {
		personService.deletePerson(id);
	}
	}
