package com.vms.model;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Vehicle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vehicleId;
	private String vehicleName;
	private String vehicleType;
	private String vehicleBrand;
	private String fuelEntity;
	private String weight;
	
	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "customerId")
	private Customer customer;

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

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getVehicleBrand() {
		return vehicleBrand;
	}

	public void setVehicleBrand(String vehicleBrand) {
		this.vehicleBrand = vehicleBrand;
	}

	public String getFuelEntity() {
		return fuelEntity;
	}

	public void setFuelEntity(String fuelEntity) {
		this.fuelEntity = fuelEntity;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Vehicle(int vehicleId, String vehicleName, String vehicleType, String vehicleBrand, String fuelEntity,
			String weight, Customer customer) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleName = vehicleName;
		this.vehicleType = vehicleType;
		this.vehicleBrand = vehicleBrand;
		this.fuelEntity = fuelEntity;
		this.weight = weight;
		this.customer = customer;
	}

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
