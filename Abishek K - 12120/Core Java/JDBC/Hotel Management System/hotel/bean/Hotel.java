package com.hotel.bean;

public class Hotel {
	
	private int id;
	private String name;
	private String phno;
	private String location;
	
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hotel(int id, String name, String phno, String location) {
		super();
		this.id = id;
		this.name = name;
		this.phno = phno;
		this.location = location;
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

	public String getPhno() {
		return phno;
	}

	public void setPhno(String phno) {
		this.phno = phno;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
	
	
	

	

}
