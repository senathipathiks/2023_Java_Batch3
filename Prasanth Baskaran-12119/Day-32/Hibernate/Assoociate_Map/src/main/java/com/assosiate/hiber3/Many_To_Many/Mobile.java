package com.assosiate.hiber3.Many_To_Many;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


//Many to One rel with Mobile class & User cls
@Entity
@Table(name="mobile")
public class Mobile {
	
	@Id @GeneratedValue
	private int id;
	private String brand;
	private String model;
	
	@ManyToOne(cascade= {CascadeType.ALL})
	@JoinColumn(name="user_id")
	private User user;

	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mobile(int id, String brand, String model, User user) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Mobile [id=" + id + ", brand=" + brand + ", model=" + model + ", user=" + user + "]";
	}
	
	
	
	

}
