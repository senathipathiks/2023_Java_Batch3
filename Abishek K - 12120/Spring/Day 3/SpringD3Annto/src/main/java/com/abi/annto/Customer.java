package com.abi.annto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component                //At Execution time, turn class into spring bean
public class Customer {
	
	private int custid;
	
	@Autowired               //It Automatically set the value to the person, another time we don't want to set the value. This is because of the "Autowired"
	private Person 	person;

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
