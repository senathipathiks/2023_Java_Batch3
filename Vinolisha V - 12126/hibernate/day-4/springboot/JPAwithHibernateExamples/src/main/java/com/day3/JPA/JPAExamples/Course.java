package com.day3.JPA.JPAExamples;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Course")
public class Course {
@Id
private int courseID;
private String courseName;
private String  courseDept;



public Course() {
	super();
	// TODO Auto-generated constructor stub
}

public Course(int courseID, String courseName, String courseDept) {
	super();
	this.courseID = courseID;
	this.courseName = courseName;
	this.courseDept = courseDept;
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

public String getCourseDept() {
	return courseDept;
}

public void setCourseDept(String courseDept) {
	this.courseDept = courseDept;
}




}
