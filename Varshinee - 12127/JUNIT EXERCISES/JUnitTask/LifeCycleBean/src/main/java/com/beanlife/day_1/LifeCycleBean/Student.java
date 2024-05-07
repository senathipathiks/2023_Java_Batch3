package com.beanlife.day_1.LifeCycleBean;

public class Student {
	private int sid;
	private String sname;
	private String scity;
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
