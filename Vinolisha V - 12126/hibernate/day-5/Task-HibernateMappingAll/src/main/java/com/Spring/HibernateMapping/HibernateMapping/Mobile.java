package com.Spring.HibernateMapping.HibernateMapping;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Mobile")
public class Mobile {
	
	@Id
	private int id;
	private String brand;
	private String model;
	
	@ManyToOne(targetEntity = User.class, cascade = CascadeType.ALL)
	@JoinColumn(name="uId")
	private User uid;
	
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mobile(int id, String brand, String model, User uid) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.uid = uid;
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

	public User getUid() {
		return uid;
	}

	public void setUid(User uid) {
		this.uid = uid;
	}

	
	
}

