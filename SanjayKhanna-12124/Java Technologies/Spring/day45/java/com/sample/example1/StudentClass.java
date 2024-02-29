package com.sample.example1;

import java.util.List;

public class StudentClass {
	
	private int sid;
	private String sname;
	private List<String> address;
	public StudentClass() {
		// TODO Auto-generated constructor stub
	}
	public StudentClass(int sid, String sname, List<String> address) {
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
	
	public void display() {
		System.out.println("Student Id: "+sid+"\nStudent Name : "+sname);
		address.forEach(x -> System.out.println(x));
	}

}
