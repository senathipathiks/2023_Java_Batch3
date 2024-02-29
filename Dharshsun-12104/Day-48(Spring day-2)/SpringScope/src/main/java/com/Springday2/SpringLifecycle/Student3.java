package com.Springday2.SpringLifecycle;

//constructor objects program

import java.util.List;

public class Student3 {
private int sid;
private String sname;
//private String scity;
private List<Address> address;
public Student3(int sid, String sname, List<Address> address) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.address = address;
}
public Student3() {
	super();
	// TODO Auto-generated constructor stub
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
public List<Address> getAddress() {
	return address;
}
public void setAddress(List<Address> address) {
	this.address = address;
}
@Override
public String toString() {
	return "Student3 [sid=" + sid + ", sname=" + sname + ", address=" + address + "]";
}

void display(){
	
		   System.out.println("ID:"+sid);
		   System.out.println("Name:"+sname);
//		   System.out.println("City:"+city);
		   System.out.println("Address:");
		   for(Address address:address) {
			   System.out.println(address);
		   }
}

}