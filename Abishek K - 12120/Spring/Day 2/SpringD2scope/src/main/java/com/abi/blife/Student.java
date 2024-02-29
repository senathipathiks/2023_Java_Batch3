package com.abi.blife;

import java.util.List;

public class Student {
	
	private int sid;
	private String sname;
	private List<String> address;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String sname, List<String> address) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.address = address;
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
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", address=" + address + "]";
	}
	
	void display() {
		System.out.println("ID: "+sid);
		System.out.println("Name: "+sname);
		System.out.println("Address:");
		
		for(String s : address) {
			System.out.println(s);
		}
	}

}
