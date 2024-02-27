package com.emp.bean;

public class Employee {
 private int id;
 private String name;
 private String city;
 private int phoneno;
 private String department;
 

public Employee(int id, String name, String city, int phoneno, String department) {
	super();
	this.id = id;
	this.name = name;
	this.city = city;
	this.phoneno = phoneno;
	this.department = department;
}

public Employee() {
	super();
	
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
public int getPhoneno() {
	return phoneno;
}
public void setPhoneno(int phoneno) {
	this.phoneno = phoneno;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
 
}
