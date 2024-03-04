package com.spring.day3.Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Customer {
	private int cusId;
	@Autowired
	private Person person;

	public Customer() {
		super();
	}

	public Customer(int cusId) {
		super();
		this.cusId = cusId;
		
	}

	public int getCusId() {
		return cusId;
	}

	public void setCusId(int cusId) {
		this.cusId = cusId;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	void display() {
		System.out.println("Customer Id "+cusId);
		System.out.println(person);
		
	}
	
	

}

