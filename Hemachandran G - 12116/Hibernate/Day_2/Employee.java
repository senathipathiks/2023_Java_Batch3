package com.sampleofsat.mavenday2;

import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int empId;
	@Column(name="empName")
	String empName;
	@Column(name="empPhnNo")
	String empPhnNo;
	@Column(name="empAddress")
	String empAddress;
	@Column(name="empsalary")
	float empSalary;
	
	
	
	public Employee() {
		
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String empName, String empPhnNo, String empAddress, float empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empPhnNo = empPhnNo;
		this.empAddress = empAddress;
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
	public String getEmpPhnNo() {
		return empPhnNo;
	}
	public void setEmpPhnNo(String empPhnNo) {
		this.empPhnNo = empPhnNo;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public float getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empPhnNo=" + empPhnNo + ", empAddress="
				+ empAddress + ", empSalary=" + empSalary + ", getEmpId()=" + getEmpId() + ", getEmpName()="
				+ getEmpName() + ", getEmpPhnNo()=" + getEmpPhnNo() + ", getEmpAddress()=" + getEmpAddress()
				+ ", getEmpSalary()=" + getEmpSalary() + "]";
	}
	
	

}
