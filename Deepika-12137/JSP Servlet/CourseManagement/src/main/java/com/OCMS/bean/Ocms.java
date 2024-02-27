package com.OCMS.bean;

public class Ocms {
   private int CourseID;
   private String CourseName;
   private String CourseType;
   private int CourseDuration;
   private float CourseFee;
   
public Ocms(int courseID, String courseName, String courseType, int courseDuration, float courseFee) {
	super();
	this.CourseID = courseID;
	this.CourseName = courseName;
	this.CourseType = courseType;
	this.CourseDuration = courseDuration;
	this.CourseFee = courseFee;
}

public Ocms() {
	super();

}

public int getCourseID() {
	return CourseID;
}

public void setCourseID(int courseID) {
	CourseID = courseID;
}

public String getCourseName() {
	return CourseName;
}

public void setCourseName(String courseName) {
	CourseName = courseName;
}

public String getCourseType() {
	return CourseType;
}

public void setCourseType(String courseType) {
	CourseType = courseType;
}

public int getCourseDuration() {
	return CourseDuration;
}

public void setCourseDuration(int courseDuration) {
	CourseDuration = courseDuration;
}

public float getCourseFee() {
	return CourseFee;
}

public void setCourseFee(float courseFee) {
	CourseFee = courseFee;
}

   
   
}
