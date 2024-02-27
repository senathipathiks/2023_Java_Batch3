package com.ms.bean;

public class VehicleClass {

	
	int No;
	
	String BrandName;
	
	float Price;
	
	String Type;

//	public VehicleClass() {
//		super();
//		// TODO Auto-generated constructor stub
//	}

	public VehicleClass(int no, String brandName, float price, String type) {
//		super();
		No = no;
		BrandName = brandName;
		Price = price;
		Type = type;
	}

	public int getNo() {
		return No;
	}

	public void setNo(int no) {
		No = no;
	}

	public String getBrandName() {
		return BrandName;
	}

	public void setBrandName(String brandName) {
		BrandName = brandName;
	}

	public float getPrice() {
		return Price;
	}

	public void setPrice(float price) {
		Price = price;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}
	
	
	
	
	
	
}
