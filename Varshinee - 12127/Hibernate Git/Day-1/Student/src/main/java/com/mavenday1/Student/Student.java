package com.mavenday1.Student;

public class Student {
	private int studid;
	private String stuname;
	private String city;
	public Student() {
		super();
		
	}
	public Student(int studid, String stuname, String city) {
		super();
		this.studid = studid;
		this.stuname = stuname;
		this.city = city;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [studid=" + studid + ", stuname=" + stuname + ", city=" + city + "]";
	}
	
	

}
