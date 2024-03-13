package com.spring.day3;

import org.springframework.stereotype.Component;

@Component
public class Parent {
	private String Fname;
	private String Mname;
	
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getMname() {
		return Mname;
	}
	public void setMname(String mname) {
		Mname = mname;
	}
	@Override
	public String toString() {
		return "Parent [Fname=" + Fname + ", Mname=" + Mname + "]";
	}
	
}
