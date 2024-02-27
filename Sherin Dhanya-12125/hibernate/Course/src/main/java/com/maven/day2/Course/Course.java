package com.maven.day2.Course;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Course")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name = "courseid")
	private int courseId;
	@Column(name = "coursename")
	private String courseName;
	@Column(name = "coursetype")
	private String courseType;
	
public Course()
{
		
}

/**
 * @param courseId
 * @param courseName
 * @param courseType
 */
public Course(int courseId, String courseName, String courseType) {
	this.courseId = courseId;
	this.courseName = courseName;
	this.courseType = courseType;
}

@Override
public String toString() {
	return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseType=" + courseType + "]";
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

public String getCourseType() {
	return courseType;
}

public void setCourseType(String courseType) {
	this.courseType = courseType;
}
	
	
}
