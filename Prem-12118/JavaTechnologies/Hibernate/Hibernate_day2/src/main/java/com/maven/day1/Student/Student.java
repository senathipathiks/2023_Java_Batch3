package com.maven.day1.Student;

public class Student {
	
	private int studId;
	private String studName;
	private String StudCity;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studId, String studName, String studCity) {
		super();
		this.studId = studId;
		this.studName = studName;
		StudCity = studCity;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getStudCity() {
		return StudCity;
	}

	public void setStudCity(String studCity) {
		StudCity = studCity;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", StudCity=" + StudCity + "]";
	}
	
	
	
	
	

}
