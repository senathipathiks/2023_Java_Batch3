package com.practice.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
 

@Entity
public class Vehicle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vId;
	private String vtype;
	private String vBrand;
	private String vYear;
	private String vPrice;
	private String vFueltype;

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle(int vId, String vtype, String vBrand, String vYear, String vPrice, String vFueltype) {
		super();
		this.vId = vId;
		this.vtype = vtype;
		this.vBrand = vBrand;
		this.vYear = vYear;
		this.vPrice = vPrice;
		this.vFueltype = vFueltype;
	}

	public int getvId() {
		return vId;
	}

	public void setvId(int vId) {
		this.vId = vId;
	}

	public String getVtype() {
		return vtype;
	}

	public void setVtype(String vtype) {
		this.vtype = vtype;
	}

	public String getvBrand() {
		return vBrand;
	}

	public void setvBrand(String vBrand) {
		this.vBrand = vBrand;
	}

	public String getvYear() {
		return vYear;
	}

	public void setvYear(String vYear) {
		this.vYear = vYear;
	}

	public String getvPrice() {
		return vPrice;
	}

	public void setvPrice(String vPrice) {
		this.vPrice = vPrice;
	}

	public String getvFueltype() {
		return vFueltype;
	}

	public void setvFueltype(String vFueltype) {
		this.vFueltype = vFueltype;
	}

}
