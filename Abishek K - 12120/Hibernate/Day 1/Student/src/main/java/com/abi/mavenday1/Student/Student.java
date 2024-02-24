package com.abi.mavenday1.Student;

public class Student {
	
	private int studid;
	private String stuname;
	private  String stucity;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studid, String stuname, String stucity) {
		super();
		this.studid = studid;
		this.stuname = stuname;
		this.stucity = stucity;
	}
	
	
	
	
	public int getStudid() {
		return studid;
	}
	public void setStudid(int studid) {
		this.studid = studid;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public String getStucity() {
		return stucity;
	}
	public void setStucity(String stucity) {
		this.stucity = stucity;
	}
	
	@Override
	public String toString() {
		return "Student [studid=" + studid + ", stuname=" + stuname + ", stucity=" + stucity + "]";
	}
	
	
	

}
