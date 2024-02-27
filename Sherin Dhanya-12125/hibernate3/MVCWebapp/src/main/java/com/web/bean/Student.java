package com.web.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "studentName")
	private String studentname;
	@Column(name = "department")
	private String department;
	@Column(name = "place")
	private String place;

	/**
	 * 
	 */
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param studentname
	 * @param department
	 * @param place
	 */
	public Student(int id, String studentname, String department, String place) {
		super();
		this.id = id;
		this.studentname = studentname;
		this.department = department;
		this.place = place;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", studentname=" + studentname + ", department=" + department + ", place=" + place
				+ "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

}
