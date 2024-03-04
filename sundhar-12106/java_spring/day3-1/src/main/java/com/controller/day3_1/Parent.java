package com.controller.day3_1;

import org.springframework.stereotype.Component;

@Component
public class Parent {

	private String mName;
	private String fName;

	public Parent() {
		// TODO Auto-generated constructor stub
	}

	public Parent(String mName, String fName) {
		super();
		this.mName = mName;
		this.fName = fName;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	@Override
	public String toString() {
		return "Parent [mName=" + mName + ", fName=" + fName + "]";
	}

}
