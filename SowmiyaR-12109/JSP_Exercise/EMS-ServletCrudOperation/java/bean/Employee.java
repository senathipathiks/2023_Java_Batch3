package com.Ems.bean;

public class Employee {

	private int id;
	private String name;
	private String city;
	private int deptid;
	private String deptname;
	private String phno;
	public Employee() {
		super();
		
	}
	public Employee(int id, String name, String city, int deptid, String deptname, String phno) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.deptid = deptid;
		this.deptname = deptname;
		this.phno = phno;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
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
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	
	
	

}
