package com.day2.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String gender;
	private String dept;
	private String subject;
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}


	public Student(int id, String name, String gender, String dept, String subject) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.dept = dept;
		this.subject = subject;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", dept=" + dept + ", subject=" + subject
				+ "]";
	}
	
	

}
