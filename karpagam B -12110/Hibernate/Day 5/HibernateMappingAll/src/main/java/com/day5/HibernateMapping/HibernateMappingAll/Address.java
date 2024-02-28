package com.day5.HibernateMapping.HibernateMappingAll;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="addr")

public class Address {
	
	@Id
	@GeneratedValue
	private int id;
	private String city;
	private String street;
	
	@OneToOne(targetEntity =User.class, cascade=CascadeType.ALL)
	@JoinColumn
	private User user;
	
	public Address() {
		super();
	}

	public Address(int id, String city, String street) {
		super();
		this.id = id;
		this.city = city;
		this.street = street;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + ", street=" + street + ", user=" + user + "]";
	}
	
	
	

}
