package com.hibernate.mavenday1.Student;

public class Employee {
	public int empid;
	public String empname;
	public String empdept;
	
	public Employee() {
		super();
	}
	public Employee(int empid, String empname, String empdept) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empdept = empdept;
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
	public String getEmpdept() {
		return empdept;
	}
	public void setEmpdept(String empdept) {
		this.empdept = empdept;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empdept=" + empdept + "]";
	}
	
	
}
