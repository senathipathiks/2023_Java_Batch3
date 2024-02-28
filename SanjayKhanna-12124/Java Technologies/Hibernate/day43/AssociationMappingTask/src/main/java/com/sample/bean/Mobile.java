package com.sample.bean;

import javax.persistence.*;

@Entity
public class Mobile {
	
	@Id
	private int mobileId;
	private String brand;
	private String model;
	
	
	public Mobile() {
		
	}

	public Mobile(int mobileId, String brand, String model) {
		super();
		this.mobileId = mobileId;
		this.brand = brand;
		this.model = model;
	}

	public int getMobileId() {
		return mobileId;
	}

	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

//	public UserDetails getUser() {
//		return user;
//	}
//
//	public void setUser(UserDetails user) {
//		this.user = user;
//	}

}
