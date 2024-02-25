package com.hibernate.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student1")
public class Student1 {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
 private int id;
 private String name;
 private String city;
public Student1() {
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
@Override
public String toString() {
	return "Student1 [id=" + id + ", name=" + name + ", city=" + city + "]";
}
 
 
 
}
