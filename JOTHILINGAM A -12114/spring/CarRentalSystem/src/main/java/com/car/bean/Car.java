package com.car.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "car_tbl2")
public class Car {
	@Id
	private int CarID;
	private String CarModel;
	private String CarType;
	private int Rate_per_km;
	private String Seat_Capacity;

	public Car() {
		super();
	}

	public Car(int carID, String carModel, String carType, int rate_per_km, String seat_Capacity) {
		super();
		CarID = carID;
		CarModel = carModel;
		CarType = carType;
		Rate_per_km = rate_per_km;
		Seat_Capacity = seat_Capacity;
	}

	public int getCarID() {
		return CarID;
	}

	public void setCarID(int carID) {
		CarID = carID;
	}

	public String getCarModel() {
		return CarModel;
	}

	public void setCarModel(String carModel) {
		CarModel = carModel;
	}

	public String getCarType() {
		return CarType;
	}

	public void setCarType(String carType) {
		CarType = carType;
	}

	public int getRate_per_km() {
		return Rate_per_km;
	}

	public void setRate_per_km(int rate_per_km) {
		Rate_per_km = rate_per_km;
	}

	public String getSeat_Capacity() {
		return Seat_Capacity;
	}

	public void setSeat_Capacity(String seat_Capacity) {
		Seat_Capacity = seat_Capacity;
	}

	@Override
	public String toString() {
		return "Car [CarID=" + CarID + ", CarModel=" + CarModel + ", CarType=" + CarType + ", Rate_per_km="
				+ Rate_per_km + ", Seat_Capacity=" + Seat_Capacity + "]";
	}

}
