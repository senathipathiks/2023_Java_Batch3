package com.stu_db.bean;

public class Employee {
	private int id;
	private String name;
	private String location;
	private int salary;
	
	public Employee() {
	super();
	}
	
	public Employee(int id, String name, String location, int salary) {
		this.id = id;
		this.name = name;
		this.location = location;
		this.salary = salary;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
         
	}

}
