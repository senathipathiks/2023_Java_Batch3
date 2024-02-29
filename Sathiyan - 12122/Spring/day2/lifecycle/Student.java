package com.day2.lifecycle;

public class Student {
	
	public Student() {
		System.out.println("Bean Created");
	}
	
	public void init() {
		System.out.println("I am init() method");
	}
	
	public void destroy() {
		System.out.println("I am destroy() method");
	}

}
