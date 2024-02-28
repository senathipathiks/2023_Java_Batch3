package com.hibernate.day5.EndToEnd;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table

public class Mobile {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int mId;

	private String brand;
	private String model;
	
	@ManyToOne
	@JoinColumn(name="uId")
	private User user;
	
	public Mobile() {
		// TODO Auto-generated constructor stub
	}

	public Mobile(int mId, String brand, String model) {
		super();
		this.mId = mId;
		this.brand = brand;
		this.model = model;
	}
	
	

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getmId() {
		return mId;
	}

	public void setmId(int mId) {
		this.mId = mId;
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

	
}
