package com.sms.bean;

public class student {
	private int id;
	private String name;
	private String city;
	
	// default constructor
	public student() {
	// TODO Auto-generated constructor stub
	}	


	// parameterized constructor
	public student(int id, String name, String city) {
	super();
	this.id = id;
	this.name = name;
	this.city = city;
}
	

// getters and setters for all fields
	
	
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



	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}


		// main Method
	public static void main(String[] args) {



	}

}
