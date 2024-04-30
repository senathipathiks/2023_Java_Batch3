package com.SpringDay2.Lifecycle;

public class Student {

	 private int sid;
	 private String sname;
	 private String scity;
	 
	 public Student() {
		 System.out.println("Bean class Created");
	 }
	 public void init()
	 {
		 System.out.println("It is by init method");
	 }
	 
	 public void destroy()
	 {
		 System.out.println("It is by destroy method");
	 }
}
