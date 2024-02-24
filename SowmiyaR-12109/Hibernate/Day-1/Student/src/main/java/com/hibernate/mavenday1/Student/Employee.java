package com.hibernate.mavenday1.Student;

public class Employee {
     private int eid;
     private String ename;
     private String ecity;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eid, String ename, String ecity) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.ecity = ecity;
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
	public String getEcity() {
		return ecity;
	}
	public void setEcity(String ecity) {
		this.ecity = ecity;
	}
     
     
}
