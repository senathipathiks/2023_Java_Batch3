package com.hibernet.day1.HybernetDemo;

public class Employee {
private int eid;
private String ename;
private String city;

 Employee() {
	
}

public Employee(int eid, String ename, String city) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.city = city;
}

public int getEid() {
	return eid;
}

public void setEid(int eid) {
	this.eid = eid;
}

public String getEname() {
	return ename;
}

public void setEname(String ename) {
	this.ename = ename;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", city=" + city + "]";
}
 
}
