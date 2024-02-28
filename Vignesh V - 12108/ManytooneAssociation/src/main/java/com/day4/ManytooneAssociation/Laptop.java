package com.day4.ManytooneAssociation;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Laptop {

	@Id
	private int lid;
	private String lname;
	
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lname=" + lname + "]";
	}
	
	


	public Laptop(int lid, String lname) {
		super();
		this.lid = lid;
		this.lname = lname;
	}




	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
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
	
	
	
}
