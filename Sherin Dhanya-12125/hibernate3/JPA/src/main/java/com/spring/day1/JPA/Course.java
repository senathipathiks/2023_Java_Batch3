package com.spring.day1.JPA;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="course")
public class Course {
@Id
private int courseId;
@Column(name = "courseName")
private String courseName;
@Column(name = "dep")
private String department;
public Course() {
	super();
	// TODO Auto-generated constructor stub
}
public Course(int courseId, String courseName, String department) {
	super();
	this.courseId = courseId;
	this.courseName = courseName;
	this.department = department;
}
public int getCourseId() {
	return courseId;
}
public void setCourseId(int courseId) {
	this.courseId = courseId;
}
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
@Override
public String toString() {
	return "Course [courseId=" + courseId + ", courseName=" + courseName + ", department=" + department + "]";
}


}
