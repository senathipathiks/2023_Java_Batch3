package com.sms.mavenday1.Student;

public class Student {
	
	private int stuId;
	private String stuName;
	private String city;
	
	
	
	public Student() {
		super();
	}


	public Student(int stuId, String stuName, String city) {
		this.stuId = stuId;
		this.stuName = stuName;
		this.city = city;
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


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", city=" + city + "]";
	}
	
	
	

}
