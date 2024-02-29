package com.spring.day1.Project2;

public class Vehicle {
	
	private int vId;
	private String vBrand;
	private String vModel;
	
	
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}


	public Vehicle(int vId, String vBrand, String vModel) {
		super();
		this.vId = vId;
		this.vBrand = vBrand;
		this.vModel = vModel;
	}


	public int getvId() {
		return vId;
	}


	public void setvId(int vId) {
		this.vId = vId;
	}


	public String getvBrand() {
		return vBrand;
	}


	public void setvBrand(String vBrand) {
		this.vBrand = vBrand;
	}


	public String getvModel() {
		return vModel;
	}


	public void setvModel(String vModel) {
		this.vModel = vModel;
	}


	@Override
	public String toString() {
		return "Vehicle [vId=" + vId + ", vBrand=" + vBrand + ", vModel=" + vModel + "]";
	}

	
}
