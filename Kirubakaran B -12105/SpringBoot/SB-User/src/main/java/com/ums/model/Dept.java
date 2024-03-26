package com.ums.model;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Dept {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int deptId;
	private String deptName;
	private String deptBranch;
	
	
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Dept(int deptId, String deptName, String deptBranch) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptBranch = deptBranch;
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


	public String getDeptBranch() {
		return deptBranch;
	}


	public void setDeptBranch(String deptBranch) {
		this.deptBranch = deptBranch;
	}
	
	
}
