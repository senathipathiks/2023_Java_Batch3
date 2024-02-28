package com.maven.day4.Employeee;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="emp1")
public class Employee {

	@Id
	private int eroll;
	private String ename;
	
	@OneToOne( targetEntity =department.class, cascade=CascadeType.ALL)
	@JoinColumn
	private department d1;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eroll, String ename, department d1) {
		super();
		this.eroll = eroll;
		this.ename = ename;
		this.d1 = d1;
	}

	public int getEroll() {
		return eroll;
	}

	public void setEroll(int eroll) {
		this.eroll = eroll;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public department getd1() {
		return d1;
	}

	public void setL1(department d1) {
		this.d1 = d1;
	}

	@Override
	public String toString() {
		return "Employee [eroll=" + eroll + ", ename=" + ename + "]";
	}
	
	
	 

	 

}
