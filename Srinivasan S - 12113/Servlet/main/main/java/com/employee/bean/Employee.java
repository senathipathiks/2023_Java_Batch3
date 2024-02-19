package com.employee.bean;

public class Employee {

	private int empId;
	private String empName;
	private String email;
	private String city;	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String empName, String email, String city) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.email = email;
		this.city = city;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	
	


}
