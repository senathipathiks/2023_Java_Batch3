package com.hibernate.mavenday1.Student;

public class Student {

	private int studid;
	private String studname;
	private String city;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studid, String studname, String city) {
		super();
		this.studid = studid;
		this.studname = studname;
		this.city = city;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [studid=" + studid + ", studname=" + studname + ", city=" + city + "]";
	}
	
	
}
