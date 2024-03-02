package com.Spring.day3.Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Customer {
	private int cid;
	@Autowired
	private Person person;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int cid, Person person) {
		super();
		this.cid = cid;
		this.person = person;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", person=" + person + "]";
	}

	void display() {
		System.out.println(cid);
		System.out.println(person);
	}
}
