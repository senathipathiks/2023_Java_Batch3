package com.demoSpring.bean;

import java.util.List;

public class Student3 {

	private int id;
	private String name;
	private String gender;
	private List<Address> address;

	public Student3() {
		// TODO Auto-generated constructor stub
	}

	public Student3(int id, String name, String gender, List<Address> address) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student3 [id=" + id + ", name=" + name + ", gender=" + gender + ", address=" + address + "]";
	}

}
