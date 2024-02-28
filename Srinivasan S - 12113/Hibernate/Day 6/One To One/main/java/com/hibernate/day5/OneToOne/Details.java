package com.hibernate.day5.OneToOne;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Details {
	@Id
	private int uhouseNo;
	private String uStreet;
	private String uArea;
	

	public Details() {
		// TODO Auto-generated constructor stub
	}


	public Details(int uhouseNo, String uStreet, String uArea) {
		super();
		this.uhouseNo = uhouseNo;
		this.uStreet = uStreet;
		this.uArea = uArea;
	}


	public int getUhouseNo() {
		return uhouseNo;
	}


	public void setUhouseNo(int uhouseNo) {
		this.uhouseNo = uhouseNo;
	}


	public String getuStreet() {
		return uStreet;
	}


	public void setuStreet(String uStreet) {
		this.uStreet = uStreet;
	}


	public String getuArea() {
		return uArea;
	}


	public void setuArea(String uArea) {
		this.uArea = uArea;
	}


	@Override
	public String toString() {
		return "Details [uhouseNo=" + uhouseNo + ", uStreet=" + uStreet + ", uArea=" + uArea + "]";
	}
	
	

}
