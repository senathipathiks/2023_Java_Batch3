package com.sms.bean;

public class Student {

	int studId;
	String studName;
	String studCity;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int studId, String studName, String studCity) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studCity = studCity;
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
		return studCity;
	}
	public void setStudCity(String studCity) {
		this.studCity = studCity;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", studCity=" + studCity + "]";
	}
	
	
	
}
