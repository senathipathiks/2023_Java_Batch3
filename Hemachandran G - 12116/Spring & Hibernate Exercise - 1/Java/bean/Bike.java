package com.bms.bean;

public class Bike {
	
	private int bikeno;
	private String brandname;
	private String model;
	private int cc;
	private float price;
	
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bike(int bikeno, String brandname, String model, int cc, float price) {
		super();
		this.bikeno = bikeno;
		this.brandname = brandname;
		this.model = model;
		this.cc = cc;
		this.price = price;
	}

	public int getBikeno() {
		return bikeno;
	}

	public void setBikeno(int bikeno) {
		this.bikeno = bikeno;
	}

	public String getBrandname() {
		return brandname;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Bike [bikeno=" + bikeno + ", brandname=" + brandname + ", model=" + model + ", cc=" + cc + ", price="
				+ price + "]";
	}
	
	
	

	

}
