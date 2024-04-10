package com.spring2.day2;

import java.util.List;

public class Student2 {
	private int id;
	private String name;


	private List <Address> location;
	
	public Student2()
	{
		super();
	}

	public Student2(int id, String name, List<Address> location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
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

	public List<Address> getLocation() {
		return location;
	}

	public void setLocation(List<Address> location) {
		this.location = location;
	}



	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Id :" +id);
		System.out.println("Name: " +name);
		System.out.println("Address: " );
		for(Address add:location)
		{
			System.out.println(add);
		}
	}

	
}
