package com.demoSpring.bean;

public class Student {

	private int id;
	private String name;
	private String gender;
	private String address;
	
	public void init() {
		System.out.println("Bean Created successfully...!!!");
	}
	
	public void destroy() {
		System.out.println("bean is going to destroy..!");
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, String gender, String address) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.address = address;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", address=" + address + "]";
	}

}
