package com.spring2.day2;

public class Student {
	private int id;
	private String name;
	private String city;
	
	public Student() {
		System.out.println("bean created");
	}
	
	public void init()
	{
		System.out.println("Im in init() method");
	}
	
	public void destroy()
	{
		System.out.println("Im in destroy() method");
	}
}
