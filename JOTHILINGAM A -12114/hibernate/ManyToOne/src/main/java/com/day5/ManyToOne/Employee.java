package com.day5.ManyToOne;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.Table;

@Entity
@Table(name = "Emp1")
public class Employee {
	@Id
	private int eroll;

	private String ename;

	@ManyToOne(targetEntity = Department.class, cascade = CascadeType.ALL)
	@JoinColumn
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

	public Department getL1() {
		return d1;
	}

	public void setL1(Department d1) {
		this.d1 = d1;
	}

	@Override
	public String toString() {
		return "Employee [eroll=" + eroll + ", ename=" + ename + ", l1=" + d1 + "]";
	}

}
