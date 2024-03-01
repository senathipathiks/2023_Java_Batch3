package com.demoSpring.bean;

import java.util.List;

public class Student1 {

	private int id;
	private String name;
	private String gender;
	private List<String> address;

	public Student1() {
		// TODO Auto-generated constructor stub
	}

	public Student1(int id, String name, String gender, List<String> address) {
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

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}
	
	public void display() {
		System.out.println("id : "+id+"\nname: "+name+"\ngender: "+gender+"\naddress");
		for (String s : address) {
			System.out.println(s);
		}
	}

	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", gender=" + gender + ", address=" + address + "]";
	}

}
