package com.hib.day2.AnnotationHib;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="emp")
public class Employee1 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;
	@Column(name="empname")
	private String ename;
	private String esal;
	
	
	public Employee1() {
		super();
	
	}


	public Employee1(int eid, String ename, String esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}


	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public String getEsal() {
		return esal;
	}


	public void setEsal(String esal) {
		this.esal = esal;
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
	}
	
	
	

	
	
}
