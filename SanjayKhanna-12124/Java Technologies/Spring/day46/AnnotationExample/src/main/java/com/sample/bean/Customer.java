package com.sample.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	
	private int customerId;
	
	@Autowired
	private Person person;

	public Customer() {
		super();
	}
	

	public Customer(int customerId, Person person) {
		this.customerId = customerId;
		this.person = person;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	public void display() {
		System.out.println("Customer Id : "+customerId);
		System.out.println(person);
	}	
	
}
