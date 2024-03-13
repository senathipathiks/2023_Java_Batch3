package com.ems.bean;

public class Employee {
	private int empId;
	private String empName;
	private int empAge;
	public Employee(int empId, String empName, int empAge) {
		super(); //refers parent class objects
		this.empId = empId; //refers the current variable in constructor
		this.empName = empName;
		this.empAge = empAge;
	}
	// to achieve encapsulation and data hiding.
	//access and manipulate the values of class private fields
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
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
}
