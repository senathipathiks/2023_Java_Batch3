package com.cms.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="course_tbl")
public class Course {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int  id;
	private String courseName;
	private String couresDuration;
	private String courseType;
	private String courseStartDate;
	private String courseEndDate;
	private String courseLecturer;
	
	public Course() {
	}

	public Course(int id, String courseName, String couresDuration, String courseType, String courseStartDate,
			String courseEndDate, String courseLecturer) {
		this.id = id;
		this.courseName = courseName;
		this.couresDuration = couresDuration;
		this.courseType = courseType;
		this.courseStartDate = courseStartDate;
		this.courseEndDate = courseEndDate;
		this.courseLecturer = courseLecturer;
	}

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCouresDuration() {
		return couresDuration;
	}

	public void setCouresDuration(String couresDuration) {
		this.couresDuration = couresDuration;
	}

	public String getCourseType() {
		return courseType;
	}

	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}

	public String getCourseStartDate() {
		return courseStartDate;
	}

	public void setCourseStartDate(String courseStartDate) {
		this.courseStartDate = courseStartDate;
	}

	public String getCourseEndDate() {
		return courseEndDate;
	}

	public void setCourseEndDate(String courseEndDate) {
		this.courseEndDate = courseEndDate;
	}

	public String getCourseLecturer() {
		return courseLecturer;
	}

	public void setCourseLecturer(String courseLecturer) {
		this.courseLecturer = courseLecturer;
	}
}
