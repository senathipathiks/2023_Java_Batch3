package com.day3.annoteg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	int custid;
	@Autowired // automatically inject the bean from  the container
	private Person person;

	public Customer() {
		super();
	}
	

	public Customer(int custid) {
		super();
		this.custid = custid;
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
	}

	void display() {
		System.out.println("Customer ID :" +custid);
		System.out.println("Person Details :" +person);
	}
	 

}
