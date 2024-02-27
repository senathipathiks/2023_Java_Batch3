package com.cms.bean;

public class Course {

	int courseID;
	String courseName;
	String courseType;
	int courseDuration;
	float courseFee;
	public Course(int courseID, String courseName, String courseType, int courseDuration, float courseFee) {
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
	public float getCourseFee() {
		return courseFee;
	}
	public void setCourseFee(float courseFee) {
		this.courseFee = courseFee;
	}
	
	
	
	
	
}
