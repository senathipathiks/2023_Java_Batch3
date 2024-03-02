package com.scope.day_1.ScopesEx;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Student5 {
	private int sid;
	private String sname;
	private Map<Integer, Address> address;
	public Student5() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student5(int sid, String sname, Map<Integer, Address> address) {
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
	public Map<Integer, Address> getAddress() {
		return address;
	}
	public void setAddress(Map<Integer, Address> address) {
		this.address = address;
	}
	void display() {
		System.out.println("ID: " + sid);
		System.out.println("Name" + sname);
		System.out.print("Address:");
		Set<Entry<Integer,Address>> set=Address.entrySet();
		Iterator<Entry<Integer,Address>> itr=set.iterator();
		while(itr.hasNext()) {
			Entry<Integer,Address> entry=itr.next();
			System.out.println(entry.getValue());
		}

}
}
