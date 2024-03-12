package com.ems.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "emp_spring")
public class Employee {
	@Id
	@Column(name="empId")
private int empId;
	@Column(name="EmpName")
private String empName;
	@Column(name="EmpSalary")
private int empSalary;

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

public Employee(int empId, String empName, int empSalary) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.empSalary = empSalary;
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
public int getEmpSalary() {
	return empSalary;
}
public void setEmpSalary(int empSalary) {
	this.empSalary = empSalary;
}

}
