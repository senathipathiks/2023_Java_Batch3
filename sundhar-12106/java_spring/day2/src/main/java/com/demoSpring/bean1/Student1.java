package com.demoSpring.bean1;

import java.util.Map;

import com.demoSpring.bean.Address;

public class Student1 {

	private int id;
	private String name;
	private String gender;
	private Map<Integer, Address> address;

	public Student1() {
		// TODO Auto-generated constructor stub
	}

	public Student1(int id, String name, String gender, Map<Integer, Address> address) {
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

	public Map<Integer, Address> getAddress() {
		return address;
	}

	public void setAddress(Map<Integer, Address> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", gender=" + gender + ", address=" + address + "]";
	}

}
