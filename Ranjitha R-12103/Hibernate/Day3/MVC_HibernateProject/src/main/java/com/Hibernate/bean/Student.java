package com.Hibernate.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Studenttbl")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	@Column(name = "Studname")
	private String sname;
	@Column(name = "StudDept")
	private String sdept;
	@Column(name = "Studaddress")
	private String address;

	public Student() {
		super();
	}

	public Student( int sid,String sname, String sdept, String address) {
		super();
		this.sid=sid;
		this.sname = sname;
		this.sdept = sdept;
		this.address = address;
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

	public String getSdept() {
		return sdept;
	}

	public void setSdept(String sdept) {
		this.sdept = sdept;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sdept=" + sdept + ", address=" + address + "]";
	}

}
