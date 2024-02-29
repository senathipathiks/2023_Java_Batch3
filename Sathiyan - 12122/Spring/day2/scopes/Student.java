package com.day2.scopes;

public class Student {
	private int id;
	private String sname;
	private String scity;
	
	public Student() {
		super();
	}

	public Student(int id, String sname, String scity) {
		super();
		this.id = id;
		this.sname = sname;
		this.scity = scity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getScity() {
		return scity;
	}

	public void setScity(String scity) {
		this.scity = scity;
	}

	@Override
	public String toString() {
		return "id=" + id + ", sname=" + sname + ", scity=" + scity;
	}
	
	
	
	

}
