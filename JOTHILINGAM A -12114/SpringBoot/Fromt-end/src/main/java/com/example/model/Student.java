package com.example.model;

import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

public class Student {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String dept;
	private Long mblnumber;
	private String address;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, String dept, Long mblnumber, String address) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.mblnumber = mblnumber;
		this.address = address;
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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Long getMblnumber() {
		return mblnumber;
	}

	public void setMblnumber(Long mblnumber) {
		this.mblnumber = mblnumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dept=" + dept + ", mblnumber=" + mblnumber + ", address="
				+ address + "]";
	}
	
	
	

}
