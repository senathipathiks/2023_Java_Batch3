package com.annotation.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private int sid;
	private String sname;
	private String scity;
	
	@Autowired
	private Parent details;

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

	public String getScity() {
		return scity;
	}

	public void setScity(String scity) {
		this.scity = scity;
	}

	public Parent getDetails() {
		return details;
	}

	public void setDetails(Parent details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", scity=" + scity + "]";
	}

	public Student(int sid, String sname, String scity) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.scity = scity;
	}
	
	
	
	
}
