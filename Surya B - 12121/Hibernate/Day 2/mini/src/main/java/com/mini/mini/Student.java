package com.mini.mini;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student")

public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sid;
	
	@Column(name = "name")
	private String sname;
	@Column(name = "city")
	private String scity;
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", scity=" + scity + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getScity() {
		return scity;
	}
	public void setScity(String scity) {
		this.scity = scity;
	}
	
	
	
	
}
