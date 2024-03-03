package com.spring.init;

public class Student {

	
	 private int sid;
	   private String sname;
	   private String scity;
	   
	   public Student() {
		System.out.println("Bean is Created");
	}
	   
	   public void init() {
		   
		   System.out.println("I am in init() method is invoking");
	   }
	   
      public void destroy() {
		   
		   System.out.println("I am in destroy() method is invoking");
	   }
}
