package com.day5.ManyToOneMap;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Dept")
public class Department {

	
	
	@Id
	private int deptid;
	private String deptname;
	
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Department(int deptid, String deptname) {
		super();
		this.deptid = deptid;
		this.deptname = deptname;
	}


	public int getdeptid() {
		return deptid;
	}


	public void setdeptid(int deptid) {
		this.deptid = deptid;
	}


	public String getdeptname() {
		return deptname;
	}


	public void setdeptname(String deptname) {
		this.deptname = deptname;
	}


	@Override
	public String toString() {
		return "Laptop [deptid=" + deptid + ", deptname=" + deptname + "]";
	}
	
	
	
}
