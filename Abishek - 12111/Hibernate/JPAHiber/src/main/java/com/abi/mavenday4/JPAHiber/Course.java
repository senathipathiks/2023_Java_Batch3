package com.abi.mavenday4.JPAHiber;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Course")
public class Course {
	
	@Id
	private int cId;
	private String cName;
	private String cDeprt;
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int cId, String cName, String cDeprt) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cDeprt = cDeprt;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcDeprt() {
		return cDeprt;
	}
	public void setcDeprt(String cDeprt) {
		this.cDeprt = cDeprt;
	}
	
	

}
