package com.sbaadharapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.sbaadharapp.entity.Person;
import com.sbaadharapp.service.PersonService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class PersonController {
	
	@Autowired
	PersonService service;
	
	
	@PostMapping("save")
	public Person saveEmployee(@RequestBody Person person) {
		
		return service.savePerson(person);
	}
	

}
