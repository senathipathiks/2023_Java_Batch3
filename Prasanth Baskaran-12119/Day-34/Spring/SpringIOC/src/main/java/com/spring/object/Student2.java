package com.spring.object;

import java.util.List;

public class Student2 {

	 private int sid;
	   private String sname;
	   private String scity;
	   
	   private List<Address> address;
	   
	   public Student2() {
		super();
	}

	public Student2(int sid, String sname, String scity, List<Address> address) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.scity = scity;
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

	
	public void show() {
		
		for (Address address2 : address) {
			System.out.println(address2);
		}
	}
	@Override
	public String toString() {
		return "Student2 [sid=" + sid + ", sname=" + sname + ", scity=" + scity + ", address=" + address + "]";
	}
	
	   
	
}
