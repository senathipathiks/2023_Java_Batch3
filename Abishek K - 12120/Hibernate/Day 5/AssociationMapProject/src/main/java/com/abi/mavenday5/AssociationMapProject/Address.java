package com.abi.mavenday5.AssociationMapProject;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Address")
public class Address {
	
	@Id
	private int Aid;
	private String Street;
	private String city;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int aid, String street, String city) {
		super();
		Aid = aid;
		Street = street;
		this.city = city;
	}

	public int getAid() {
		return Aid;
	}

	public void setAid(int aid) {
		Aid = aid;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	

}
