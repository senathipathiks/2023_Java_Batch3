package com.sms.bean;

public class Student {
	//in bean use getter method and setter method
	
	private int id;
	private String name;
	private String no;
	private String city;
	
	
	
	public Student() {
		super();
	}
	
	public Student(int id, String name, String no, String city) {
		super();
		this.id=id;
		this.name=name;
		this.no=no;
		this.city=city;
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public static void main(String[] args) {
	

	}

	

}
