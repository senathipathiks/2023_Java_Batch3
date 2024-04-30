package com.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@Column(name="employee_id", length =  45)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int employeeId;
	
	@Column(name="employee_name", length = 45)
	private String employeeName;
	
	@Column(name="address", length = 255)
	private String address;
	
	@Column(name="mobile", length = 40)
	private int mobile;

	public Employee(int employeeId, String employeeName, String address, int mobile) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.address = address;
		this.mobile = mobile;
	}

	public Employee() {
		super();
		 
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", address=" + address
				+ ", mobile=" + mobile + "]";
	}
	
	
	

	 

}
