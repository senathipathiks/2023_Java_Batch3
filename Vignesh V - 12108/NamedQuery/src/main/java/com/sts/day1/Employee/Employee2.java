package com.sts.day1.Employee;


public class Employee2 {
	
	private int eid;
	private String ename;
	private int dept;
	
	public Employee2() {
		super();
	}
	
	public Employee2(int eid, String ename, int dept) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.dept = dept;
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
	public int getDept() {
		return dept;
	}
	public void setDept(int dept) {
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return "Employee2 [eid=" + eid + ", ename=" + ename + ", dept=" + dept + "]";
	}
	
	

}
