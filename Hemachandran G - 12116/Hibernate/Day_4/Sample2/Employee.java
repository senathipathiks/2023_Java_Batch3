package com.mon.jpa.sample2;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.CascadeType;



@Entity
@Table(name="Emp")

public class Employee {

	@Id
	
	private int eroll;
	private String ename;
	
	@ManyToOne(targetEntity = Department.class, cascade= CascadeType.ALL)
	@JoinColumn( name = "deptid")
	
	private Department d1;
	
	public Employee() {
		
	}
	
	
	public Employee(int eroll, String ename, Department d1) {
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


	public Department getD1() {
		return d1;
	}


	public void setD1(Department d1) {
		this.d1 = d1;
	}
	
}	
	
	