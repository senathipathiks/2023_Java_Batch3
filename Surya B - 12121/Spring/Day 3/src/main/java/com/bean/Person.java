package com.bean;

public class Person {
	
	int pid;
	String name;
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + "]";
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
	public Person(int pid, String name) {
		super();
		this.pid = pid;
		this.name = name;
	}
	
	
}
