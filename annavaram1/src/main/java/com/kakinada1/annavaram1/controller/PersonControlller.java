package com.kakinada1.annavaram1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kakinada1.annavaram1.model.Person;
import com.kakinada1.annavaram1.service.PersonServiceImpl;


@RestController
public class PersonControlller {

	@Autowired
	PersonServiceImpl psl;
	
	@RequestMapping(value="/persons", method=RequestMethod.POST, produces="application/json", consumes="application/json")
	public Person addPerson(@RequestBody Person p){
		return psl.addPerson(p);
	}
	
	@RequestMapping(value="/persons/{id}", method=RequestMethod.DELETE, produces="text/palin")
	public String deletePerson(@PathVariable("id") Integer id){
		return psl.deletePerson(id);
		
	}
	
	@RequestMapping(value="/persons/{id}", method=RequestMethod.GET, produces="application/json")
	public Person getPerson(@PathVariable("id") Integer id){
		return psl.getPerson(id);
		
	}
	
	@RequestMapping(value="/persons", method=RequestMethod.PUT, produces="application/json", consumes="application/json")
	public Person updatePerson(@RequestBody Person p){
		return psl.updatePerson(p);
		
	}
}
