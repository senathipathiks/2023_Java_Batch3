package com.sms.bean;

public class Student {
	
	private int studid;
	private String studname;
	private String studaddress;
	private int studphoneno;
	private int deptid;
	
	public Student() {
		super();
	}
	
	
	public Student(int studid, String studname, String studaddress, int studphoneno, int deptid) {
		super();
		this.studid = studid;
		this.studname = studname;
		this.studaddress = studaddress;
		this.studphoneno = studphoneno;
		this.deptid = deptid;
	}


	public int getStudid() {
		return studid;
	}
	public void setStudid(int studid) {
		this.studid = studid;
	}
	public String getStudname() {
		return studname;
	}
	public void setStudname(String studname) {
		this.studname = studname;
	}
	public String getStudaddress() {
		return studaddress;
	}
	public void setStudaddress(String studaddress) {
		this.studaddress = studaddress;
	}
	public int getStudphoneno() {
		return studphoneno;
	}
	public void setStudphoneno(int studphoneno) {
		this.studphoneno = studphoneno;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	
	}
