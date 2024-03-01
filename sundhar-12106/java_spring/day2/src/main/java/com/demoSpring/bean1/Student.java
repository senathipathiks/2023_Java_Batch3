package com.demoSpring.bean1;

import java.util.Set;

import com.demoSpring.bean.Address;

public class Student {

	private int id;
	private String name;
	private String gender;
	private Set<Address> address;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, String gender, Set<Address> address) {
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

	public Set<Address> getAddress() {
		return address;
	}

	public void setAddress(Set<Address> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", gender=" + gender + ", address=" + address ;
	}

}
