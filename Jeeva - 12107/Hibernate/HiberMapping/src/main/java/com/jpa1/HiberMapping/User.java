package com.jpa1.HiberMapping;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class User {
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private int id;
	private String userName;
	private Address address;
	
	public User() {
		super();
	}

	public User(int id, String userName, Address address) {
		super();
		this.id = id;
		this.userName = userName;
		this.address = address;
	}

	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getUserName() {
		return userName;
	}




	public void setUserName(String userName) {
		this.userName = userName;
	}




	public Address getAddress() {
		return address;
	}




	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
}
