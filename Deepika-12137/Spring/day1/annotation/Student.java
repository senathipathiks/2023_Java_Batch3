package com.day1.annotation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
 private int id;
 private String name;
 private String city;
 
 @Autowired
 private Parent Details;
 
 

public Student() {
	super();
	// TODO Auto-generated constructor stub
}



public Student(int id, String name, String city) {
	super();
	this.id = id;
	this.name = name;
	this.city = city;
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

public Parent getDetails() {
	return Details;
}

public void setDetails(Parent details) {
	Details = details;
}

@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
}
 
 
}
