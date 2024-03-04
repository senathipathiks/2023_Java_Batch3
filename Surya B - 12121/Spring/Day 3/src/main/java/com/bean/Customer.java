package com.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {

	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", person=" + person + "]";
	}

	int custid;
	
	@Autowired
	private Person person;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
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
