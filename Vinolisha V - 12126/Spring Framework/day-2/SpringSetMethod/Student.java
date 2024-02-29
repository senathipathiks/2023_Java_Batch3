package com.day7.SpringSetMethod;

import java.util.Iterator;
import java.util.Set;

public class Student {
	private int id;
	private String name;
	private String city;
	private Set<String> address;
	
	public Student() {
		super();
		
	}

	public Student(int id, String name, String city, Set<String> address) {
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

	public Set<String> getAddress() {
		return address;
	}

	public void setAddress(Set<String> address) {
		this.address = address;
	}
	
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", address=" + address + "]";
	}

	void display() {
		System.out.println("Id:"+ id);
		System.out.println("Name:" + name);
		System.out.println("City:" + city);
		
		for(String str: address) {
			System.out.println(str);
		}
		
	}
	
}
