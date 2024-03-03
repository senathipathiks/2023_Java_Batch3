package com.assosiate.hiber3.Many_To_Many;

import java.util.LinkedList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="User_Table")
public class User {

	@Id@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String userName;
	
	
	@ManyToMany(cascade = {CascadeType.ALL})
	@JoinTable(name="user_vehicle" ,joinColumns=@JoinColumn(name="user_id"),inverseJoinColumns=@JoinColumn(name="vehicle_id"))
    List<Vehicle> vehicle = new LinkedList<Vehicle>();
	
	@OneToMany(cascade = {CascadeType.ALL})
	@JoinTable(name="user_mobile" ,joinColumns=@JoinColumn(name="user_id"),inverseJoinColumns=@JoinColumn(name="mobile_id"))
	List<Mobile> mobile = new LinkedList<Mobile>();
	
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="address_id")
	private Address address;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String userName, List<Vehicle> vehicle, List<Mobile> mobile, Address address) {
		super();
		this.id = id;
		this.userName = userName;
		this.vehicle = vehicle;
		this.mobile = mobile;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<Vehicle> getVehicle() {
		return vehicle;
	}

	public void setVehicle(List<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}

	public List<Mobile> getMobile() {
		return mobile;
	}

	public void setMobile(List<Mobile> mobile) {
		this.mobile = mobile;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}	
	
	
	
	
	
	
}
