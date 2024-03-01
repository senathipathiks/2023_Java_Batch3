package com.Spring.day2.Spring;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Student3 {
	private int id;
	private String name;
	// private List<Address> address;
	// private Set<Address> address;
	private Map<Integer, String> address;

	public Student3() {
		super();
		// TODO Auto-generated constructor stub
	}

//	public Student3(int id, String name, Set<Address> address) {

	public Student3(int id, String name, Map<Integer, String> address) {
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

	public Map<Integer, String> getAddress() {
		return address;
	}

	public void setAddress(Map<Integer, String> address) {
		this.address = address;
	}
	void display() {
		System.out.println("ID: " + id);
		System.out.println("Name :" + name);
		System.out.println("Address:");
		Set<Entry<Integer, String>> set = address.entrySet();
		Iterator<Entry<Integer, String>> itr = set.iterator();
		while (itr.hasNext()) {
			Entry<Integer, String> entry = itr.next();
			System.out.println("door no:" + entry.getKey() + " \nplace:" + entry.getValue());
		}
	}

}
