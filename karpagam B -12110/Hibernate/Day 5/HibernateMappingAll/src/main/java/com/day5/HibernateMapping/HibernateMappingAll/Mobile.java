package com.day5.HibernateMapping.HibernateMappingAll;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Mobile {
	
	@Id
	@GeneratedValue
	private int id;
	private String model;
	private String brand;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Mobile [id=" + id + ", model=" + model + ", brand=" + brand + ", user=" + user + "]";
	}
	
	
	
}
