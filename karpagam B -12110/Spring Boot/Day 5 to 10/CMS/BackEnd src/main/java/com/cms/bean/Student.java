package com.cms.bean;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="student_tbl")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int studentId;
	private String studentName;
	private String studentQualification;
	private int studentAge;
	private String studentCity;
	
	@ManyToOne(targetEntity =Course.class, cascade=CascadeType.MERGE)
	private Course course;
	
	public Student() {
		
	}
	
	public Student(int studentId, String studentName, String studentQualification, int studentAge, String studentCity,
			Course course) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentQualification = studentQualification;
		this.studentAge = studentAge;
		this.studentCity = studentCity;
		this.course = course;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentQualification() {
		return studentQualification;
	}

	public void setStudentQualification(String studentQualification) {
		this.studentQualification = studentQualification;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
	
	
	
	
	
	
	
	

}
