package com.maven.day1.Employee;

public class Employee1 {
	
	private int empId;
	private String empname;
	private String designation;
	private double salary ;
	private long phnno;
	private String email;
	
	public Employee1() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee1(int empId, String empname, String designation, double salary, long phnno, String email) {
		super();
		this.empId = empId;
		this.empname = empname;
		this.designation = designation;
		this.salary = salary;
		this.phnno = phnno;
		this.email = email;
		
		
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public long getPhnno() {
		return phnno;
	}

	public void setPhnno(long phnno) {
		this.phnno = phnno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee1 [empId=" + empId + ", empname=" + empname + ", designation=" + designation + ", salary="
				+ salary + ", phnno=" + phnno + ", email=" + email + "]";
	}
	
	
	
	
	

}
