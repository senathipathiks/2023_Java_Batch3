package com.day3.annotation2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Customer {
	int custid;
	
	@Autowired
	private Person person;
	
	public Customer() {
		// TODO Auto-generated constructor stub
		super();
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

	@Autowired
	public void setPerson(Person person) {
		this.person = person;
	}
	
	
	void display() {
		System.out.println(custid);
		System.out.println(person);
	}
	
//	@Override
//	public String toString() {
//		return "Customer [custid=" + custid + ", person=" + person + "]";
//	}

	
	
	
	
	

}
