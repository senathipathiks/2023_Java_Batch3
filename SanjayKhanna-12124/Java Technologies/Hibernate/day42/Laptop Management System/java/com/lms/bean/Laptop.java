package com.lms.bean;

import javax.persistence.*;


@Entity
@Table
public class Laptop {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int laptopId;
	
	private String laptopName;
	private String processor;
	private float price;
	public Laptop() {
		
	}
	
	
	public Laptop(String laptopName, String processor, float price) {
		this.laptopName = laptopName;
		this.processor = processor;
		this.price = price;
	}


	public Laptop(int laptopId, String laptopName, String processor, float price) {
		this.laptopId = laptopId;
		this.laptopName = laptopName;
		this.processor = processor;
		this.price = price;
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
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	

}
