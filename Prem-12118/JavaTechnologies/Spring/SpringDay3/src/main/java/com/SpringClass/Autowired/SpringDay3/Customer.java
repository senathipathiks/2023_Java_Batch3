package com.SpringClass.Autowired.SpringDay3;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {

	int custid;
	
	@Autowired
	private Person person;
	
	public Customer() {
		super();
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
	@Autowired
	public void setPerson(Person person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", person=" + person + "]";
	}
	void display() {
		System.out.println(custid);
		System.out.println(person);
	}
	 
	}