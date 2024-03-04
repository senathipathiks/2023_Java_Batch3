package com.controller.day3_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {

	private int id;

	@Autowired
	private Person p1;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int id, Person person) {
		super();
		this.id = id;
		this.p1 = person;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Person getPerson() {
		return p1;
	}

	public void setPerson(Person person) {
		this.p1 = person;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + id +  ", person=" + p1 + "]";
	}

}
