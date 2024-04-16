package com.day2.LifeCycle;

public class Student {
	
	private int sid;
	private String sname;
	private String scity;
	
	public Student() {
		System.out.println("Bean created");
	}
	
	
	public void init() {
		System.out.println("I am in init() Method");
	}
	
	public void destroy() {
		System.out.println("I am in destroy() Method");
	}
	
	
	
	
	

}
