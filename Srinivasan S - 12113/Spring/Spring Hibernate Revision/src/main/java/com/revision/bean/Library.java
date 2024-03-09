package com.revision.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Library {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int lid;
	private String lname;
	private String lauthor;
	
	
	public Library() {
		super();
	}


	public Library(int lid, String lname, String lauthor) {
		super();
		this.lid = lid;
		this.lname = lname;
		this.lauthor = lauthor;
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


	public String getLauthor() {
		return lauthor;
	}


	public void setLauthor(String lauthor) {
		this.lauthor = lauthor;
	}


	@Override
	public String toString() {
		return "Library [lid=" + lid + ", lname=" + lname + ", lauthor=" + lauthor + "]";
	}
	
	
}
