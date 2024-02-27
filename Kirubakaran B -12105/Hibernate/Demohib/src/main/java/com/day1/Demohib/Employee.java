package com.day1.Demohib;

public class Employee {

	private int eid;
	private String ename;
	private String esal;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(int eid, String ename, String esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
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


	public String getEsal() {
		return esal;
	}


	public void setEsal(String esal) {
		this.esal = esal;
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
	}
	
	
	
}
