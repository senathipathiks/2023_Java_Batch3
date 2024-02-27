package com.mon.jpa.sample2;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="Department")

public class Department{
	
	@Id
	private int deptid;
	private String deptname;
	
	
	public Department() {
		
	}


	public Department(int deptid, String deptname) {
		super();
		this.deptid = deptid;
		this.deptname = deptname;
	}


	public int getDeptid() {
		return deptid;
	}


	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}


	public String getDeptname() {
		return deptname;
	}


	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}


	
	
	
	
	
}
	


