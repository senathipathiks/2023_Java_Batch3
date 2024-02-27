package com.mon.jpa.sample6;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.CascadeType;



@Entity
@Table(name="Course")

public class Course {

	@Id
	
	private int courseId;
	private String courseName;
	private String dept;
	
	
	
	
	
	public Course() {
		
	}
	
	
	


	public Course(int courseId, String courseName, String dept) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.dept = dept;
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





	public String getDept() {
		return dept;
	}





	public void setDept(String dept) {
		this.dept = dept;
	}


	
	
}	
	
	