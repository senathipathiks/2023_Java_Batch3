package com.sample.bean;

import javax.persistence.*;

@Entity
public class Address {
	
	@Id
	private int addressId;
	private String city;
	private String street;
	
	@OneToOne(mappedBy = "address")
	private UserDetails user;
	
	public Address() {
		
	}
	public Address(int addressId, String city, String street) {
		super();
		this.addressId = addressId;
		this.city = city;
		this.street = street;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
}
