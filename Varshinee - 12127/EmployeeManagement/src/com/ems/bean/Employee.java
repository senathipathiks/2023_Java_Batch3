package com.ems.bean;

public class Employee {
	private int id;
	private String name;
	private int deptid;
	private String deptname;
	
	public Employee() {
		super();
	}
	
	public Employee(int id,String name,int deptid,String deptname) {
		super();
		this.id=id;
		this.name=name;
		this.deptid=deptid;
		this.deptname=deptname;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", deptid=" + deptid + ", deptname=" + deptname + "]";
	}

	public static void main(String[] args) {
		
	}

}
