package com.jpa.day1.JPAExample;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Course")
public class Course {
@Id
private int courseID;
private String courseName;
private String dept;
public Course() {
	super();
	// TODO Auto-generated constructor stub
}
public Course(int courseID, String courseName, String dept) {
	super();
	this.courseID = courseID;
	this.courseName = courseName;
	this.dept = dept;
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
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
@Override
public String toString() {
	return "Course [courseID=" + courseID + ", courseName=" + courseName + ", dept=" + dept + "]";
}

}
