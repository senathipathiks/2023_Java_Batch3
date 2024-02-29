package com.day1.lifecycle;

public class Student {
 private int id;
 private String name;
 private String city;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
 
 public void init() {
	 System.out.println("I am in init() method");
 }
 public void destroy() {
	 System.out.println("I am in destroy() method ");
 }
}
