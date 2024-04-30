package com.demo.dto;

import jakarta.persistence.Column;

public class EmployeeDTO {

	private int employeeId;

	private String employeeName;

	private String address;

	private int mobile;

	public EmployeeDTO(int employeeId, String employeeName, String address, int mobile) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.address = address;
		this.mobile = mobile;
	}

	public EmployeeDTO() {
	}

	@Override
	public String toString() {
		return "EmployeeDTO [employeeId=" + employeeId + ", employeeName=" + employeeName + ", address=" + address
				+ ", mobile=" + mobile + "]";
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

	
	
	

}
