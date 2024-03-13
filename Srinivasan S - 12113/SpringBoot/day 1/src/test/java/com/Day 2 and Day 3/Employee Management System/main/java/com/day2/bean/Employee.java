package com.day2.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;
	private String ename;
	private String edesig;
	private String ecity;
	private String esal;
	
	public Employee() {
		super();
		
	}

	public Employee(int eid, String ename, String edesig, String ecity, String esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.edesig = edesig;
		this.ecity = ecity;
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

	public String getEdesig() {
		return edesig;
	}

	public void setEdesig(String edesig) {
		this.edesig = edesig;
	}

	public String getEcity() {
		return ecity;
	}

	public void setEcity(String ecity) {
		this.ecity = ecity;
	}

	public String getEsal() {
		return esal;
	}

	public void setEsal(String esal) {
		this.esal = esal;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", edesig=" + edesig + ", ecity=" + ecity + ", esal="
				+ esal + "]";
	}
	
	
}
