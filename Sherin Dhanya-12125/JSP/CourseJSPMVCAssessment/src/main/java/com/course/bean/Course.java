package com.course.bean;

public class Course {
 private int courseID;
 private String courseName;
 private String courseType;
 private int courseDuration;
 private int courseFee;
/**
 * 
 */
public Course() {
	super();
	// TODO Auto-generated constructor stub
}
/**
 * @param courseID
 * @param courseName
 * @param courseType
 * @param courseDuration
 * @param courseFee
 */
public Course(int courseID, String courseName, String courseType, int courseDuration, int courseFee) {
	super();
	this.courseID = courseID;
	this.courseName = courseName;
	this.courseType = courseType;
	this.courseDuration = courseDuration;
	this.courseFee = courseFee;
}
public int getCourseID() {
	return courseID;
}
public void setCourseID(int courseID) {
	this.courseID = courseID;
}
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
public String getCourseType() {
	return courseType;
}
public void setCourseType(String courseType) {
	this.courseType = courseType;
}
public int getCourseDuration() {
	return courseDuration;
}
public void setCourseDuration(int courseDuration) {
	this.courseDuration = courseDuration;
}
public int getCourseFee() {
	return courseFee;
}
public void setCourseFee(int courseFee) {
	this.courseFee = courseFee;
}
 
}
