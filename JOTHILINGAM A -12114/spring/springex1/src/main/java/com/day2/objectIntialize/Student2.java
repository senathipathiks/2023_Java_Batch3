package com.day2.objectIntialize;

import java.util.List;

public class Student2 {

	private int sid;
	private String sname;
	private List<Address> scity;

	public Student2() {
		super();
	}

	public Student2(int sid, String sname, List<Address> scity) {
		super();
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

	public List<Address> getScity() {
		return scity;
	}

	public void setScity(List<Address> scity) {
		this.scity = scity;
	}

	void display() {
		System.out.println("ID :" + sid);
		System.out.println("Name : " + sname);
		System.out.println("Address");
		for(Address add: scity) {
			
			System.out.println(add);
			
		}

	}

}
