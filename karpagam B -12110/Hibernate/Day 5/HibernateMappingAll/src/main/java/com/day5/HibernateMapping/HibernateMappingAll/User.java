package com.day5.HibernateMapping.HibernateMappingAll;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="user_dets")
public class User {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int id;
	private String userName;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="usr_vehicle",joinColumns=@JoinColumn(name="user_id"),
	inverseJoinColumns=@JoinColumn(name="vehicle_id") )
	private Collection<Vehicle> vehicle=new ArrayList<>();
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="address_id")
	private Address address;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="user_mobile_mapping",joinColumns=@JoinColumn(name="user_id"),inverseJoinColumns=@JoinColumn(name="mobile_id"))
	private Collection<Mobile> mobile=new ArrayList<>();

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

	public Collection<Vehicle> getVehicle() {
		return vehicle;
	}

	public void setVehicle(Collection<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Collection<Mobile> getMobile() {
		return mobile;
	}

	public void setMobile(Collection<Mobile> mobile) {
		this.mobile = mobile;
	}
}
