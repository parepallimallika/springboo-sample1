package com.kakinada1.annavaram1.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kakinada1.annavaram.repository.PersonRepository;
import com.kakinada1.annavaram1.model.Person;

@Service
public class PersonServiceImpl {
	
	@Autowired
	PersonRepository personRepository;
	
	public Person addPerson(Person p){
		return personRepository.save(p);
	}
	
	public String deletePerson(Integer id){
		personRepository.deleteById(id);
		return "success";
		
	}
	
	public Person getPerson(Integer id){
		return personRepository.findById(id).get();
	}
	
	public Person updatePerson(Person p){
		return personRepository.save(p);
		
	}

}
