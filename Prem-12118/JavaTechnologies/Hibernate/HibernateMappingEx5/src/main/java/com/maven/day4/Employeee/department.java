package com.maven.day4.Employeee;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Dept")
public class department {
	@Id
	private int dID;
	private String dName;
	
	public department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public department(int dID, String dName) {
		super();
		this.dID = dID;
		this.dName = dName;
	}
	
	public int getdID() {
		return dID;
	}
	public void setdID(int dID) {
		this.dID = dID;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	@Override
	public String toString() {
		return "department [dID=" + dID + ", dName=" + dName + "]";
	}
	
	
	

}
