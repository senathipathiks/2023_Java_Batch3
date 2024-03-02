package com.Spring.day3.Annotation;

import org.springframework.stereotype.Component;

@Component
public class Parent {

	private String fname;
	private String mname;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	@Override
	public String toString() {
		return "Parent [fname=" + fname + ", mname=" + mname + "]";
	}

}
