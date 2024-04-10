package com.day3.Annotations.SpringAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	
	private int sid;
	private String sname;
	private String sCity;
	
	@Autowired
	private Parent Details;
	
	public Student() {
		super();
		
	}

	public Student(int sid, String sname, String sCity) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sCity = sCity;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getsCity() {
		return sCity;
	}

	public void setsCity(String sCity) {
		this.sCity = sCity;
	}
	

	public Parent getDetails() {
		return Details;
	}

	public void setDetails(Parent details) {
		Details = details;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sCity=" + sCity + "]";
	}
	
	
	
	
}
