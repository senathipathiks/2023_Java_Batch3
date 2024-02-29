package com.Springday2.SpringLifecycle;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Employee {
private int eid;
private String ename;
private Map<Integer,String> dept;

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

public Employee(int eid, String ename, Map<Integer, String> dept) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.dept = dept;
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

public Map<Integer, String> getDept() {
	return dept;
}

public void setDept(Map<Integer, String> dept) {
	this.dept = dept;
}

void display() {
	System.out.println("Employee id:"+eid+"Employee name:"+ename);
	
	
	for (Entry<Integer, String> entry : dept.entrySet()) 
        System.out.println(entry.getKey() + ": " + entry.getValue()); 
	}
	
}

