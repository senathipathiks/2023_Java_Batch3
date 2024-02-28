package com.sample.bean;

import java.util.List;
import javax.persistence.*;


@Entity
@Table
public class UserDetails {
	@Id
	private int userId;
	private String username;
	
	@OneToOne(targetEntity = Address.class,cascade = CascadeType.ALL)
	@JoinColumn(name="addressId")
	private Address address;
	
	@OneToMany(targetEntity = Mobile.class,cascade = CascadeType.ALL)
	@JoinColumn(name="userId")
	private List<Mobile> mList;
	
	@ManyToMany(targetEntity = Vehicle.class,cascade = CascadeType.ALL)
	@JoinTable(name = "User_Vehicle",joinColumns = @JoinColumn(name="userId"),inverseJoinColumns = @JoinColumn(name="vehicleId"))
	private List<Vehicle> vList;

	public UserDetails() {
		
	}
	

	public UserDetails(int userId, String username, Address address, List<Mobile> mList, List<Vehicle> vList) {
		super();
		this.userId = userId;
		this.username = username;
		this.address = address;
		this.mList = mList;
		this.vList = vList;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Mobile> getmList() {
		return mList;
	}

	public void setmList(List<Mobile> mList) {
		this.mList = mList;
	}

	public List<Vehicle> getvList() {
		return vList;
	}

	public void setvList(List<Vehicle> vList) {
		this.vList = vList;
	}

}
