package com.bms.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Bike {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bikeId;
	private String brandName;
	private String engineCapacity;
	private String mileage;
	private int maxSpeed;
	private float price;
	public Bike() {
		super();
	}
	
	
	public Bike(int bikeId, String brandName, String engineCapacity, String mileage, int maxSpeed, float price) {
		this.bikeId = bikeId;
		this.brandName = brandName;
		this.engineCapacity = engineCapacity;
		this.mileage = mileage;
		this.maxSpeed = maxSpeed;
		this.price = price;
	}
	

	public String getMileage() {
		return mileage;
	}


	public void setMileage(String mileage) {
		this.mileage = mileage;
	}


	public int getBikeId() {
		return bikeId;
	}
	public void setBikeId(int bikeId) {
		this.bikeId = bikeId;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getEngineCapacity() {
		return engineCapacity;
	}
	public void setEngineCapacity(String engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
}
