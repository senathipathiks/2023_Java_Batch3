package com.example.model;

import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity

public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;

	private Long mblnumber;
	private String address;

	@ManyToOne(targetEntity = Department.class, cascade = CascadeType.REFRESH)
	@JoinColumn(name = "deptid")
	private Department dept;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, Long mblnumber, String address, Department dept) {
		super();
		this.id = id;
		this.name = name;
		this.mblnumber = mblnumber;
		this.address = address;
		this.dept = dept;
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

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mblnumber=" + mblnumber + ", address=" + address + ", dept="
				+ dept + "]";
	}

}
