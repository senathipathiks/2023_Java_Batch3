package com.ems.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Employee {

	@Id
	@Column(name = "eid")
	private int eid;
	@Column(name = "ename")
	private String ename;
	@Column(name = "esalary")
	private String esalary;
	
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
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
	}
	public Employee(int eid, String ename, String esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
