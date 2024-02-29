package com.abi.blife;

import java.util.List;

public class Student2 {
	
	private int sid;
	private String sname;
	private List<Address> address;
	
	public Student2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student2(int sid, String sname, List<Address> address) {
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
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student2 [sid=" + sid + ", sname=" + sname + ", address=" + address + "]";
	}
	
	void display() {
		System.out.println("ID: "+sid);
		System.out.println("Name: "+sname);
		System.out.println("Address:");
		
		for(Address s : address) {
			System.out.println(s);
		}
	}
	
	

}
