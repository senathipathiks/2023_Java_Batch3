package com.sample.bean;

import org.springframework.stereotype.Component;

@Component
public class Parent {
	
	private String fName;
	private String mName;
	public Parent() {
		super();
	}
	public Parent(String fName, String mName) {
		this.fName = fName;
		this.mName = mName;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	@Override
	public String toString() {
		return "Parent [fName=" + fName + ", mName=" + mName + "]";
	}	
}
