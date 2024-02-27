package com.web.application;


import javax.persistence.*;;

@Entity
@Table(name="Employee")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	  private int empid;
	@Column(name="name")
	  private String empname;
	@Column(name="mail")
	  private String empmail;
	
	public User() {
		super();
	}

	public User(int empid, String empname, String empmail) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empmail = empmail;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmpmail() {
		return empmail;
	}

	public void setEmpmail(String empmail) {
		this.empmail = empmail;
	}

	@Override
	public String toString() {
		return "User [empid=" + empid + ", empname=" + empname + ", empmail=" + empmail + "]";
	}
	
}
