package com.maven.day1.Student;

public class Employee {
	private int empID;
	private String empname;
	private int empSal;
	private String address;
	public Employee(int empID, String empname, int empSal, String address) {
		super();
		this.empID = empID;
		this.empname = empname;
		this.empSal = empSal;
		this.address = address;
	}
	
	
	public Employee() {
		super();
		
	}
   


	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpSal() {
		return empSal;
	}
	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
	

}
