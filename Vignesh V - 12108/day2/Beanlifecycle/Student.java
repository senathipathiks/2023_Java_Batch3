package com.day2.Beanlifecycle;

public class Student {
	
	private int sid;
	private String sname;
	private String scity;
	
	
	public Student() {
		System.out.println("Bean-created");
	}
		public void init() {
			System.out.println("hi iam init");
		}
		public void destroy() {
			System.out.println("hi iam destroy");
		}
		
		
	}


