package com.sms.model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity

public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	private String name;
	private String phnno;
	private String email;
	
	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "id")
	private Department department; 
	
	
	
	
	public Student() {
	}
	
	
	public Student(int sid, String name, String phnno, String email, Department department) {
		this.sid = sid;
		this.name = name;
		this.phnno = phnno;
		this.email = email;
		this.department = department;
	}


	public int getSid() {
		return sid;
	}


	public void setSid(int sid) {
		this.sid = sid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhnno() {
		return phnno;
	}


	public void setPhnno(String phnno) {
		this.phnno = phnno;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
	


}
