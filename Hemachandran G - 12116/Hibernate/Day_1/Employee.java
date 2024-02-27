package com.sampleofsat.mavenday1;

public class Employee {
	
	int empId;
	String empName;
	int empAge;
	String empAddress;

	

	public Employee(int empId, String empName, int empAge, String empAddress) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empAddress = empAddress;
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





	public int getEmpAge() {
		return empAge;
	}





	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}





	public String getEmpAddress() {
		return empAddress;
	}





	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}







}
