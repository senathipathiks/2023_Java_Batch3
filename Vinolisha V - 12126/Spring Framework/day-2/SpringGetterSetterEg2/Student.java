package com.day7.SpringGetterSetterEg2;

import java.util.List;

public class Student {
	
	private int sid;
	private String sname;
	private String scity;
	private List<Address> address;
	
	public Student() {
		super();
		
	}
	public Student(int sid, String sname, String scity,List<Address> address) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.scity = scity;
		this.address= address;
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
	
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	
	
	void display() {
		System.out.println("Id:" + sid);
		System.out.println("Name:" + sname);
		System.out.println("Address:"+scity);
		
		for (Address str : address) {
			System.out.println(str);
		}
	}
	
}
