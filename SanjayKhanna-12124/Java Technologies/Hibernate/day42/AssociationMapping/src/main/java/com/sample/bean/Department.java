package com.sample.bean;

import javax.persistence.*;

@Entity
@Table
public class Department {
	
	@Id
	private int deptId;
	private String deptName;
	
	public Department() {
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
