package com.relatioship.day1.EmployeeProject;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Emp")
public class Employee {
	@Id
	private int eid;
	private String ename;

	@OneToOne(targetEntity = Laptop.class, cascade = CascadeType.ALL)
	@JoinColumn
	private Laptop l1;

	public Employee() {
		super();
	}

	public Employee(int eid, String ename, Laptop l1) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.l1 = l1;
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

	public Laptop getL1() {
		return l1;
	}

	public void setL1(Laptop l1) {
		this.l1 = l1;
	}

	public static void main(String[] args) {

	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", l1=" + l1 + "]";
	}
    
}
