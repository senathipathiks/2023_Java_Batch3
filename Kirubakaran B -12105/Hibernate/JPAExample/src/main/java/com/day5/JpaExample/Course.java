package com.day5.JpaExample;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="course")
public class Course {
    
	@Id
	private int courseId;
	private String courseName;
	private String deptId;
	
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Course(int courseId, String courseName, String deptId) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.deptId = deptId;
	}
	public int getcourseId() {
		return courseId;
	}
	public void setcourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getdeptId() {
		return deptId;
	}
	public void setdeptId(String deptId) {
		this.deptId = deptId;
	}
	
	
	
}
