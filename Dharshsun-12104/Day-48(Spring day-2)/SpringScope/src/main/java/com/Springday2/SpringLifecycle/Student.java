package com.Springday2.SpringLifecycle;

public class Student {
private int sid;
private String sname;
private String scity;
public Student() {
	System.out.println("Bean created");
	// TODO Auto-generated constructor stub
}

public void init() {
	System.out.println("I am a init() method");
}
public void destroy() {
	System.out.println("I am a destroy() method");
}
}
