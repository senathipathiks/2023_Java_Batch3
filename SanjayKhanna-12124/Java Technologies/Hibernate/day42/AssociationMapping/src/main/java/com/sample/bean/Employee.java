package com.sample.bean;

import javax.persistence.*;

@Entity
@Table
public class Employee {
	
	@Id
	private int empId;
	private String empName;
	
	@OneToOne(targetEntity = Laptop.class,cascade = CascadeType.ALL)
	private Laptop l;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String empName, Laptop l) {
		this.empId = empId;
		this.empName = empName;
		this.l = l;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Laptop getL() {
		return l;
	}

	public void setL(Laptop l) {
		this.l = l;
	}
	
	
}
