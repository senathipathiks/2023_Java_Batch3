package com.sms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stuId;
	private String stuName;
	private String stuGender;
	private int stuAge;
	
	@ManyToOne
	private Department department;
	
	

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Student(int stuId, String stuName, String stuGender, int stuAge, Department department) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuGender = stuGender;
		this.stuAge = stuAge;
		this.department = department;
	}



	public int getStuId() {
		return stuId;
	}



	public void setStuId(int stuId) {
		this.stuId = stuId;
	}



	public String getStuName() {
		return stuName;
	}



	public void setStuName(String stuName) {
		this.stuName = stuName;
	}



	public String getStuGender() {
		return stuGender;
	}



	public void setStuGender(String stuGender) {
		this.stuGender = stuGender;
	}



	public int getStuAge() {
		return stuAge;
	}



	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}



	public Department getDepartment() {
		return department;
	}



	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
	

}
