package com.sbaadharapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbaadharapp.entity.Person;
import com.sbaadharapp.repo.PersonRepo;

@Service
public class PersonService {
	
	@Autowired 
	PersonRepo repo;
	
	public Person savePerson(Person person) {
		return repo.save(person);
		
	}

}
