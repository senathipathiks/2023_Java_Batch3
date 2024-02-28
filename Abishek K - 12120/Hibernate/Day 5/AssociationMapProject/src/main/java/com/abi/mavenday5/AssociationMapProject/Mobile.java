package com.abi.mavenday5.AssociationMapProject;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Mobile")
public class Mobile {
	
	@Id
	private int Mid;
	private String brand;
	private String model;
	
	@ManyToOne(targetEntity = UserDetails.class, cascade = CascadeType.ALL)
	@JoinColumn(name="UID")
	private UserDetails ud;

	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mobile(int mid, String brand, String model, UserDetails ud) {
		super();
		Mid = mid;
		this.brand = brand;
		this.model = model;
		this.ud = ud;
	}

	public int getMid() {
		return Mid;
	}

	public void setMid(int mid) {
		Mid = mid;
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

	public UserDetails getUd() {
		return ud;
	}

	public void setUd(UserDetails ud) {
		this.ud = ud;
	}
	
	

	
	

}
