package com.sms.bean;

 public class Student {
	private int sid;
	private String sname;

	public Student() {
		super();
	}

	public Student(int id, String name) {
		super();
		this.sid = id;
		this.sname = name;
		
	}

	public int getId() {
		return sid;
	}

	public void setId(int id) {
		this.sid = id;
	}

	public String getName() {
		return sname;
	}

	public void setName(String name) {
		this.sname = name;
	}
	

}
