package com.vms.bean;

public class Vehicle {
	
	private int v_id;
	private String v_name;
	private String brand;
	private int price;
	private int b_id;
	private int s_id;
	

	public Vehicle() {
		super();
	}
	
	public Vehicle(int v_id, String v_name, String brand, int price, int b_id, int s_id) {
		this.v_id = v_id;
		this.v_name = v_name;
		this.brand = brand;
		this.price = price;
		this.b_id = b_id;
		this.s_id = s_id;
		
	}

	public int getV_id() {
		return v_id;
	}

	public void setV_id(int v_id) {
		this.v_id = v_id;
	}

	public String getV_name() {
		return v_name;
	}

	public void setV_name(String v_name) {
		this.v_name = v_name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getB_id() {
		return b_id;
	}

	public void setB_id(int b_id) {
		this.b_id = b_id;
	}

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}	

}
