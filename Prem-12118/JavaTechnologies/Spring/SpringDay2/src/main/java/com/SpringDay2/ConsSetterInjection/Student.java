package com.SpringDay2.ConsSetterInjection;

import java.util.List;

public class Student {

	private int sid;
	private String sname;
	private String scity;
	private List<Address>address;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int sid, String sname, String scity, List<Address> address) {
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
	
   void display() {
	   System.out.println("ID:"+sid);
	   System.out.println("Name:"+sname);
	   System.out.println("City:"+scity+"\n");
	   System.out.println("Address:");
	   for(Address address:address) {
		   System.out.println("\nAddress");
		   System.out.println("DoorNo:"+address.getdNo());
		   System.out.println("Street Name:"+address.getsName());
		   System.out.println("PinCode:"+address.getPincode());    

	   }
   }
	

}
