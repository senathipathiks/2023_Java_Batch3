package com.hibernate.day5.EndToEnd;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Address")

public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int aId;
	@Column
	private String uCity;
	@Column
	private String uStreet;
	
	@OneToOne(mappedBy = "address")
	private User user;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(int aId, String uCity, String uStreet) {
		super();
		this.aId = aId;
		this.uCity = uCity;
		this.uStreet = uStreet;
	}

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	public String getuCity() {
		return uCity;
	}

	public void setuCity(String uCity) {
		this.uCity = uCity;
	}

	public String getuStreet() {
		return uStreet;
	}

	public void setuStreet(String uStreet) {
		this.uStreet = uStreet;
	}

	@Override
	public String toString() {
		return "Address [aId=" + aId + ", uCity=" + uCity + ", uStreet=" + uStreet + "]";
	}
	
	
	

}
