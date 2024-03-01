package com.day3.Spring.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //
public class Customer {
	private int cusid;
	
	@Autowired
	private Person person;
	
	
	public Customer() {
		super();
		
	}
	public int getCusid() {
		return cusid;
	}
	public void setCusid(int cusid) {
		this.cusid = cusid;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
	
	
	void display() {
		System.out.println("Customer Id:" + cusid);
		System.out.println("Person Name:"+  person);
	}
}
