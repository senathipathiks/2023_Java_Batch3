package com.assosiate.hiber3.Many_To_Many;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


//One to one rel with Add cls & User Cls
@Entity
@Table(name="address")
public class Address {

	@Id @GeneratedValue
	private int id;
	private String street;
	private String city;
	
	@OneToOne(mappedBy="address")
	private User user;

	public Address(int id, String street, String city, User user) {
		super();
		this.id = id;
		this.street = street;
		this.city = city;
		this.user = user;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", city=" + city + ", user=" + user + "]";
	}
	
	
	
}
