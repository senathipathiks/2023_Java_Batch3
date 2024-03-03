package com.spring.annot2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Staff {

	private int sid;
	private String sname;
	
	@Autowired
	private Office office;
	
	
	
	public void display() {
		System.out.println("The Staff values are :" +office);
	}
	
	public Staff() {
		// TODO Auto-generated constructor stub
	}

	public Staff(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
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

	@Override
	public String toString() {
		return "Staff [sid=" + sid + ", sname=" + sname + "]";
	}
	
	
}
