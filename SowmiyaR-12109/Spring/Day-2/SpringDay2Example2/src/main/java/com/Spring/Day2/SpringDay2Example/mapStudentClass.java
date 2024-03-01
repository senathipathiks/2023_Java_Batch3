package com.Spring.Day2.SpringDay2Example;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class mapStudentClass {

	private int sid;
	private String sname;
	private Map<Integer, Address>Address;
	
	public mapStudentClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public mapStudentClass(int sid, String sname, Map<Integer, com.Spring.Day2.SpringDay2Example.Address> address) {
		super();
		this.sid = sid;
		this.sname = sname;
		Address = address;
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

	public Map<Integer, Address> getAddress() {
		return Address;
	}

	public void setAddress(Map<Integer, Address> address) {
		Address = address;
	}
	
	public void display() {
		System.out.println("ID:"+sid);
		System.out.println("Name:"+sname);
		System.out.println("Address");
		Set<Entry<Integer, Address>> set=Address.entrySet();  
	    Iterator<Entry<Integer, Address>> itr=set.iterator();  
	    while(itr.hasNext()){  
	        Entry<Integer,Address> entry=itr.next();  
	        System.out.println(entry.getValue());  
	    }  
	}
	
}
