package com.day2.Beanlifecycle;

import java.util.List;

public class Student2 {
	
	private int sid;
	private String sname;
	private List <String> address;
	public Student2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student2(int sid, String sname, List<String> address) {
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
	
	void display()
	{
		System.out.println("ID: "+sid);
		System.out.println("Name "+sname);
		System.out.println("Address:");
		for (String add : address) {
			System.out.println("add");
			
		}
	}
	
	

}
