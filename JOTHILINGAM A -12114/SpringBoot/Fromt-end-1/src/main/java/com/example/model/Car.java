package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String owner;
	private String model;
	private int year;
	private int price;
	private String carno;
	private String engineno;

	public Car(int id, String owner, String model, int year, int price, String carno, String engineno) {
		super();
		this.id = id;
		this.owner = owner;
		this.model = model;
		this.year = year;
		this.price = price;
		this.carno = carno;
		this.engineno = engineno;
	}
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCarno() {
		return carno;
	}

	public void setCarno(String carno) {
		this.carno = carno;
	}

	public String getEngineno() {
		return engineno;
	}

	public void setEngineno(String engineno) {
		this.engineno = engineno;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", owner=" + owner + ", model=" + model + ", year=" + year + ", price=" + price
				+ ", carno=" + carno + ", engineno=" + engineno + "]";
	}

}
