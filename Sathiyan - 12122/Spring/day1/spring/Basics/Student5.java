package com.day1.spring.Basics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Student5 {
	

	private int sid;
	private String sname;
	
	private HashMap<String, Address> address;

	public Student5() {
		super();
	}

	public Student5(int sid, String sname, HashMap<String, Address> address) {
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

	public HashMap<String, Address> getAddress() {
		return address;
	}

	public void setAddress(HashMap<String, Address> address) {
		this.address = address;
	}

	void display() {
		System.out.println("Id : "+sid);
		System.out.println("Name : "+sname);
		System.out.println("Address : ");
		Set<Entry<String, Address>> set=address.entrySet();  
	    Iterator<Entry<String, Address>> itr=set.iterator();  
	    while(itr.hasNext()){  
	        Entry<String,Address> entry=itr.next();  
	        System.out.println(entry.getKey()+" : "+entry.getValue());  
	    }   
		
	}

}
