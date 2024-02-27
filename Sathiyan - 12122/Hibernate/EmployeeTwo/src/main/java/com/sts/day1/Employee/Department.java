package com.sts.day1.Employee;

import javax.persistence.*;

@Entity
@Table(name="Department")
public class Department {
	@Id
	private int did;
	private String dname;
	
	public Department() {
		super();
	}
	
	public Department(int did, String dname) {
		super();
		this.did = did;
		this.dname = dname;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}
	
	
	
	
	

}
