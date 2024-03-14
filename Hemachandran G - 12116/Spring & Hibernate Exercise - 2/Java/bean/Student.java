package com.spring.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {
	
	@Id
	private int sID;
	private String sName;
	private String City;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sID, String sName, String city) {
		super();
		this.sID = sID;
		this.sName = sName;
		City = city;
	}
	public int getsID() {
		return sID;
	}
	public void setsID(int sID) {
		this.sID = sID;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	
	@Override
	public String toString() {
		return "Student's ID=" + sID + "\n Student's Name=" + sName + "\n City=" + City ;
	}
	

	
}
