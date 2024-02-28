package com.Spring.HibernateMapping.HibernateMapping;


import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Address")
public class Address {
	
	
	@Id
	private int id;
	private String street;
	private String city;
	private int pincode;
	

	public Address() {
		super();
		
	}

	public Address(int id, String street, String city, int pincode) {
		super();
		this.id = id;
		this.street = street;
		this.city = city;
		this.pincode = pincode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
		
	
}
