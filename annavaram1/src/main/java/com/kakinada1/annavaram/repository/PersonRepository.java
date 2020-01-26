package com.kakinada1.annavaram.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kakinada1.annavaram1.model.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer>{
}
