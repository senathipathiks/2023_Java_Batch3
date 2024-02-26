package com.hibernate.relationshipmappingday4.Employee;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Employee2")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eroll;
	private String ename;
	
	
	@OneToOne(targetEntity = Laptop.class,cascade=CascadeType.ALL)
	@JoinColumn()
	private Laptop l1; //relationship is unidirectional and laptopid is foreign key
	
	public Employee() {
		super();
	}

	public Employee(int eroll, String ename, Laptop l1) {
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

	public Laptop getL1() {
		return l1;
	}

	public void setL1(Laptop l1) {
		this.l1 = l1;
	}

	@Override
	public String toString() {
		return "Employee [eroll=" + eroll + ", ename=" + ename + ", l1=" + l1 + "]";
	}

	
}
