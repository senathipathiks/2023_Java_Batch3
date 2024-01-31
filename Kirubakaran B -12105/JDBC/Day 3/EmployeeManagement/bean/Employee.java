package com.emp.bean;

public class Employee {
	private int id;
	private String name;
	private String city;
	
	public Employee() {
		// TODO Auto-generated constructor stub
		super();
	}
	

	public Employee(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
         

	public Employee(int id) {
		this.id = id;
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


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
