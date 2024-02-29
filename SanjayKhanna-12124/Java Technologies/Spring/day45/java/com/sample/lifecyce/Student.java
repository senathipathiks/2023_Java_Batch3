package com.sample.lifecyce;

public class Student {
	
	private int sid;
	private String sname;
	private String scity;
	public Student() {
		System.out.println("I am Bean");
	}
	
	public void init() {
		System.out.println("I am in Init() method");
	}
	
	public void destroy() {
		System.out.println("I am in Destroy() method");
	}
}
