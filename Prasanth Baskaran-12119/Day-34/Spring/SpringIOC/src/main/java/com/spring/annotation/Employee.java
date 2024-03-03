package com.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
private int empid;
private String ename;

@Autowired
private Company company;

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

public Employee(Company c)
{
	this.company=c;
}
public Employee(int empid, String ename,Company company) {
	super();
	this.empid = empid;
	this.ename = ename;
	this.company = company;
}

public int getEmpid() {
	return empid;
}

public void setEmpid(int empid) {
	this.empid = empid;
}

public String getEname() {
	return ename;
}

public void setEname(String ename) {
	this.ename = ename;
}

public Company getCompany() {
	return company;
}

public void setCompany(Company company) {
	this.company = company;
}

@Override
public String toString() {
	return "Employee [empid=" + empid + ", ename=" + ename + ", company=" + company + "]";
}




}
