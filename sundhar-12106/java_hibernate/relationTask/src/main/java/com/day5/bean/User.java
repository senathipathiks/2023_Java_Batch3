package com.day5.bean;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String uname;
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Vehicle> vehicles;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "user")
	private List<Mobile> mobile;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String uname, Address address, List<Vehicle> vehicles, List<Mobile> mobile) {
		super();
		this.uname = uname;
		this.address = address;
		this.vehicles = vehicles;
		this.mobile = mobile;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}ok

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	public List<Mobile> getMobile() {
		return mobile;
	}

	public void setMobile(List<Mobile> mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", uname=" + uname + ", address=" + address + ", vehicles=" + vehicles + ", mobile="
				+ mobile + "]";
	}

}
