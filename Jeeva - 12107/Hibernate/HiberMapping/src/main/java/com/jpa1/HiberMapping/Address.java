package com.jpa1.HiberMapping;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class Address {
	@Id
	@GeneratedValue
	private int id;
	private String street;
	private String city;
	@OneToOne(mappedBy="address")
	@JoinColumn
	private User user;
	
	public Address() {
		
	}
	
	public Address(int id, String street, String city) {
		this.id = id;
		this.street = street;
		this.city = city;
	}

	public String getStreet() {
		return street;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public String getCity() {
		return city;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}


