package com.sample.bean;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	private int empId;
	private String empName;
	
	private Parent deatials;

	public Employee() {
		super();
	}

	public Employee(int empId, String empName, Parent deatials) {
		this.empId = empId;
		this.empName = empName;
		this.deatials = deatials;
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

	public Parent getDeatials() {
		return deatials;
	}

	public void setDeatials(Parent deatials) {
		this.deatials = deatials;
	}
	
	public void display() {
		System.out.println("Employee Id : "+empId+"\nEmployee Name : "+empName);
		System.out.println("Father Name : "+deatials.getfName()+"\nMother Name : "+deatials.getmName());
	}
}
