package com.day1.spring.Basics;

import java.util.Set;

public class Student4 {
	

	private int sid;
	private String sname;
	
	private Set<Address> address;
	
	
	public Student4() {
		super();
	}


	public Student4(int sid, String sname, Set<Address> address) {
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


	public Set<Address> getAddress() {
		return address;
	}


	public void setAddress(Set<Address> address) {
		this.address = address;
	}


	void display() {
		System.out.println("Id : "+sid);
		System.out.println("Name : "+sname);
		System.out.println("Address : ");
		for (Address add : address) {
			System.out.println(add);	
		}
	}

}
