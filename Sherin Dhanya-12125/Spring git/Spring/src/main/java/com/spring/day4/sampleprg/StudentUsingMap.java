package com.spring.day4.sampleprg;

import java.util.*;

public class StudentUsingMap {
	private int sid;
	private String sname;
	private String scity;
	private Map<Integer,String> address;
	public StudentUsingMap() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentUsingMap(int sid, String sname, String scity, Map<Integer, String> address) {
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
	public Map<Integer, String> getAddress() {
		return address;
	}
	public void setAddress(Map<Integer, String> address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "StudentUsingMap [sid=" + sid + ", sname=" + sname + ", scity=" + scity + ", address=" + address + "]";
	}
	
	void display() {
		System.out.println("ID: "+sid);
		System.out.println("Name: "+sname);
		System.out.println("Address:"+address);
		for (Map.Entry<Integer, String> entry : address.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			
		}
	}
}
