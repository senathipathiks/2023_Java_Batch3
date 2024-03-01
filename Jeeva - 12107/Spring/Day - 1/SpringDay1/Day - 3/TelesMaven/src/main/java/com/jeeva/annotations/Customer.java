package com.jeeva.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {

	private int cId;
	
	@Autowired
	private Person person;

	public Customer() {
		
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public void totring() {
		System.out.println(cId);
		System.out.println(person);
	}
	
	
	
}
