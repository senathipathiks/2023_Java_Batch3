package com.sample.example1;

import java.util.List;

public class Student {
	
	private int stuId;
	private String stuName;
	private List<Address> address;
	public Student() {
		
	}
	public Student(int stuId, String stuName, List<Address> address) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.address = address;
	}
	
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	
	public void display() {
		System.out.println("Student Name : "+stuId+"\nStudent Name : "+stuName);
		address.forEach(x -> System.out.println(x.toString()));
		
	}
	
	
	

}
