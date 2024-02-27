package com.maven.day1.Student;

public class Employee {
	
	private int eid;
	private  String ename;
	private String role;
	private String location;
	
	public Employee() {
		super();
	}

	public Employee(int eid, String ename, String role, String location) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.role = role;
		this.location = location;
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", role=" + role + ", location=" + location + "]";
	}

}
