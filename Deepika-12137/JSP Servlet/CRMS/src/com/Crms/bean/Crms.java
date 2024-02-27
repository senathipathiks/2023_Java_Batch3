package com.Crms.bean;

public class Crms {

	private int carId;
	private String carModel;
	private String carType;
	private int ratePerKm;
	private String seatCapacity;
	
	public Crms(int carId,String carModel,String carType,int ratePerKm,String seatCapacity){
		
		this.carId=carId;
		this.carModel=carModel;
		this.carType=carType;
		this.ratePerKm=ratePerKm;
		this.seatCapacity=seatCapacity;
		
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public int getRatePerKm() {
		return ratePerKm;
	}

	public void setRatePerKm(int ratePerKm) {
		this.ratePerKm = ratePerKm;
	}

	public String getSeatCapacity() {
		return seatCapacity;
	}

	public void setSeatCapacity(String seatCapacity) {
		this.seatCapacity = seatCapacity;
	}
	

}
