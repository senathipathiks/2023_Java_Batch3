package com.day5.ManyToOneMap;

import jakarta.persistence.CascadeType;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

import jakarta.persistence.Table;

@Entity
@Table(name = "EmpManytoone")
public class Employee {

	@Id
	private int eroll;
	private String ename;
	
	@ManyToOne(targetEntity = Department.class, cascade = CascadeType.ALL)
	@JoinColumn

	private Department l1;

	public Employee() {

		// TODO Auto-generated constructor stub

	}

	public Employee(int eroll, String ename, Department l1) {

		super();

		this.eroll = eroll;

		this.ename = ename;

		this.l1 = l1;

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

		return l1;

	}

	public void setL1(Department l1) {

		this.l1 = l1;

	}

	@Override
	public String toString() {
		return "Employee [eroll=" + eroll + ", ename=" + ename + ", l1=" + l1 + "]";
	}

}
