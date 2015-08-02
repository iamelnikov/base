package com.ee.repository.mongo.person;

import org.springframework.data.repository.CrudRepository;

import com.ee.domain.person.Person;

public interface PersonRepository extends CrudRepository<Person, String>{

	
}
