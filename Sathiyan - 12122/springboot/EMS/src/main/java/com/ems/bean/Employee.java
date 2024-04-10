package com.ems.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_employee")
public class Employee {
		
	@Id
	@Column(name="id")
	private int eid;
	
	@Column(name="name")
	private String ename;
	
	@Column(name="salary")
	private String esalary;
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
	}

	public Employee() {
		super();
	}
	
	public Employee(int eid, String ename, String esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}
	
	public int getEid() {
		return eid;
	}
	
	public void setEid(int eid) {
		this.eid = eid;
	}
	
	public String getEname() {
		return ename;
	}
	
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public String getEsalary() {
		return esalary;
	}
	
	public void setEsalary(String esalary) {
		this.esalary = esalary;
	}
	
}
