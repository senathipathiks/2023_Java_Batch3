package com.day3.Annotations.SpringAnnotationssena;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {

	int custid;
	@Autowired
	private Person person;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int custid, Person person) {
		super();
		this.custid = custid;
		this.person = person;
	}

	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}you

	public void display() {
		System.out.println(custid);
		System.out.println(person);
	}

}
