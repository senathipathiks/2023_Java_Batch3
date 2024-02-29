package com.day7.SpringSetMethod;

import java.util.Set;

public class Student2 {
	private int id;
	private String name;
	private String city;
	private Set<Address> address;
	public Student2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student2(int id, String name, String city, Set<Address> address) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Set<Address> getAddress() {
		return address;
	}
	public void setAddress(Set<Address> address) {
		this.address = address;
	}
	
	void display() {
		System.out.println("Id:"+ id);
		System.out.println("Name:"+ name);
		System.out.println("City:" + city);
		
		for(Address add: address) {
			System.out.println(add);
		}
	}
	
}
