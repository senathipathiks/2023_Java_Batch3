package com.sample.example2;

public class Department {
	
	public int deptId;
	public String deptName;
	public Department() {
		super();
	}
	public Department(int deptId, String deptName) {
		this.deptId = deptId;
		this.deptName = deptName;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
}
