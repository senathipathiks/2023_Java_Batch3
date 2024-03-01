package com.day3.autodemo;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
int pid;
String name;
@Autowired
public Person() {
	super();
	// TODO Auto-generated constructor stub
}
public Person(int pid, String name) {
	super();
	this.pid = pid;
	this.name = name;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Person [pid=" + pid + ", name=" + name + "]";
}


}
