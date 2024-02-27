package com.tue.jpa.example1;

import javax.persistence.*;

@Entity
@Table
public class Employee {
	@Id
	int empId;
	String empName;
	float salary;
	public Employee(int empId, String empName, float salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
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
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
	}
	
	

}
