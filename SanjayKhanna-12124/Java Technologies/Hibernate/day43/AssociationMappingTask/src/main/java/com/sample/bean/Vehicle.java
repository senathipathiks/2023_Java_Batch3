package com.sample.bean;

import java.util.List;

import javax.persistence.*;

@Entity
public class Vehicle {
	
	@Id
	private int vehicleId;
	private String vehicleName;
	
//	
//	public List<UserDetails> getUser() {
//		return user;
//	}
//	public void setUser(List<UserDetails> user) {
//		this.user = user;
//	}
	public Vehicle() {
		
	}
	public Vehicle(int vehicleId, String vehicleName) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleName = vehicleName;
	}
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	
}
