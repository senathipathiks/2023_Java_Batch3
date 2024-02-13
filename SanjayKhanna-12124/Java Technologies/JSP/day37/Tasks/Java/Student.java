package com.day2;

public class Student {
	
	private int stuId;
	private String StuName;
	private String StuCity;
	
	
	
	public Student() {
		super();
	}



	public Student(int stuId, String stuName, String stuCity) {
		super();
		this.stuId = stuId;
		StuName = stuName;
		StuCity = stuCity;
	}



	public int getStuId() {
		return stuId;
	}



	public void setStuId(int stuId) {
		this.stuId = stuId;
	}



	public String getStuName() {
		return StuName;
	}



	public void setStuName(String stuName) {
		StuName = stuName;
	}



	public String getStuCity() {
		return StuCity;
	}



	public void setStuCity(String stuCity) {
		StuCity = stuCity;
	}
	
	
	
	
}
