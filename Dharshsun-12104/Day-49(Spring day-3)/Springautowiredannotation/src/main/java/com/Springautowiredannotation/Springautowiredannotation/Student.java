package com.Springautowiredannotation.Springautowiredannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
private int sid;
private String sName;
private String sCity;

@Autowired
private Parent Details;


public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int sid, String sName, String sCity) {
	super();
	this.sid = sid;
	this.sName = sName;
	this.sCity = sCity;
//	Details = details;
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getsName() {
	return sName;
}
public void setsName(String sName) {
	this.sName = sName;
}
public String getsCity() {
	return sCity;
}
public void setsCity(String sCity) {
	this.sCity = sCity;
}
public Parent getDetails() {
	return Details;
}
public void setDetails(Parent details) {
	Details = details;
}

@Override
public String toString() {
	return "Student [sid=" + sid + ", sName=" + sName + ", sCity=" + sCity + "]";
}
}
