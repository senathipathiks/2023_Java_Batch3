package com.sample.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private int sid;
	private String sname;
	private String scity;
	
	@Autowired
	private Parent detials;
	
	public Parent getDetials() {
		return detials;
	}
	public void setDetials(Parent detials) {
		this.detials = detials;
	}
	public Student() {
		super();
	}
	public Student(int sid, String sname, String scity) {
		this.sid = sid;
		this.sname = sname;
		this.scity = scity;
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
	public String getScity() {
		return scity;
	}
	public void setScity(String scity) {
		this.scity = scity;
	}
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", scity=" + scity + "]";
	}
	
	
}
