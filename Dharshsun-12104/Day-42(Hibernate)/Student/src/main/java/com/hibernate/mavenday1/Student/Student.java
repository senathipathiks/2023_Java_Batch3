package com.hibernate.mavenday1.Student;

public class Student {
private int studId;
private String studName;
private String city;

public Student() {
	super();
}

public Student(int studId, String studName, String city) {
	super();
	this.studId = studId;
	this.studName = studName;
	this.city = city;
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
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}

@Override
public String toString() {
	return "Student [studId=" + studId + ", studName=" + studName + ", city=" + city + "]";
}


}
