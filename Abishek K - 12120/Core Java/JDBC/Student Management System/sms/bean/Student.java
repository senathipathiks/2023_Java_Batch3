package com.sms.bean;

//It is Modal Part

public class Student{
	
	private int id;
	private String name;
	private String age;
	private String gender;
	private String location;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Student(int id, String name, String age, String gender, String location) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.location = location;
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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
	
}

