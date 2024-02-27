package com.Student.bean;

import javax.persistence.*;

@Entity
@Table (name="Student")

public class Student {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	private int sid;
@Column(name="name")
	private String sname;
@Column(name="department")
	private String dept;
	
	public Student(int sid, String sname, String dept) 
	{
		super();
		this.sid = sid;
		this.sname = sname;
		this.dept = dept;
	}
	public Student() {
		super();
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}	
}
