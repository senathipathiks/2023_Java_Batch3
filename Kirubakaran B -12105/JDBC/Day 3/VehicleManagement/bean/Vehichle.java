package com.veh.bean;

public class Vehichle {
   private int id;
	private String name;
	private String brand;
	private String color;
	public Vehichle(int id, String name, String brand, String color) {
		
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.color = color;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	

}
