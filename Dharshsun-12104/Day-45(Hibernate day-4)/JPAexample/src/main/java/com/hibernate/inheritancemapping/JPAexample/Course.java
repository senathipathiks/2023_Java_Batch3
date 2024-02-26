package com.hibernate.inheritancemapping.JPAexample;

import javax.persistence.*;

@Entity
@Table
public class Course {
	@Id
private int courseID;
private String courseName;
private String courseDept;

public Course() {
	super();
}
public Course(int courseID, String courseName, String courseDept) {
	super();
	this.courseID = courseID;
	this.courseName = courseName;
	this.courseDept = courseDept;
}

}
