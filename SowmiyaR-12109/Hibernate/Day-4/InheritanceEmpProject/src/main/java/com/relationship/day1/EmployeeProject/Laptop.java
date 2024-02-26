package com.relationship.day1.EmployeeProject;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Laptop")
public class Laptop {
@Id
	private int lid;
	private String lname;
	
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Laptop(int lid, String lname) {
		super();
		this.lid = lid;
		this.lname = lname;
	}

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lname=" + lname + "]";
	}
	
	
	

}
