package com.spring.day2.Example2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	int custid;
	
	@Autowired
	private Person person;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
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
	void display()
	{
		System.out.println(custid);
		System.out.println(person);
	}
	
	

}
