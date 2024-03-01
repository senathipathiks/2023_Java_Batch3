package com.Spring.Day2.SpringDay2LifeCycleBean;

public class Student {
	
	private int sid;
	private String sname;
	private String scity;
	public Student() {
		System.out.println("Bean created");
	}
	
	
public void init() {
	System.out.println("I am in init() method");
}
public void destroy() {
	System.out.println("I am in destroy() method");
}
	

}
