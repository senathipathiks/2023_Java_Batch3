package com.Spring.day2.Spring;

public class Student {
	private int id;
	private String name;
	private String city;

	public Student() {
		System.out.println("Bean Created");
	}

	public void init() {
		System.out.println("I am in init() method");
	}
	public void destroy() {
		System.out.println("I am in destroy() method");
	}
	

}
