package com.mavenday1.Student;

public class Employee {
	private int empid;
	private String empname;
	private String dept;
	public Employee() {
		super();
		
	}
	public Employee(int empid, String empname, String dept) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.dept = dept;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", dept=" + dept + "]";
	}
	
	
}
