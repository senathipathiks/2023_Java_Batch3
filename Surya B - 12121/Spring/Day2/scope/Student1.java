package com.frame.Day2.scope;

public class Student1 {
	
	private int sid;
	private String sname;
	private String scity;
	
	public Student1() {
		System.out.println("Bean Created");
	}
	
	public void init() {
		System.out.println("I am in int() Method");
	}
	public void destroy() {
		System.out.println("I am in destroy() Method");
	}
}
