package com.day1.Scope;

import java.util.List;

public class Student3 {
	private int id;
	private String name;
	private List<Address> address;
	
	public Student3() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student3(int id, String name, List<Address> address) {
		super();
		this.id = id;
		this.name = name;
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

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	void display() {
		System.out.println("ID:"+id);
		System.out.println("Name :"+name);
		System.out.println("Address :");
		for (Address add1:address) {
			System.out.println(add1);
		}
	
	

}}
