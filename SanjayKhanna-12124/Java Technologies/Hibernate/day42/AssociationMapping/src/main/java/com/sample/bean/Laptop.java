package com.sample.bean;

import javax.persistence.*;

@Entity
@Table
public class Laptop {
	
	@Id
	private int laptopId;
	private String laptopName;
	
	@OneToOne
	@JoinColumn(name = "empId")
	private Employee emp;
	public Laptop() {
		
	}
	public Laptop(int laptopId, String laptopName) {
		this.laptopId = laptopId;
		this.laptopName = laptopName;
	}
	public int getLaptopId() {
		return laptopId;
	}
	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}
	public String getLaptopName() {
		return laptopName;
	}
	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}
	
	
}
