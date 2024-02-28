package com.spring.day1.Employee;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

	@Entity
	@Table(name="Employee2")
	
	
	public class Employee {
	@Id
		private int eroll;
		private String ename;
	
		@OneToOne(targetEntity =Laptop.class, cascade= CascadeType.ALL)
		@JoinColumn() //what is the column you refering as a foreign key
		private Laptop l1;
		
	

	public Employee() {
		super();
		
	}

	public Employee(int eroll, String ename, Laptop l1) {
		super();
		this.eroll = eroll;
		this.ename = ename;
		this.l1 = l1;
	}

	public int getEid() {
		return eroll;
	}

	public void setEid(int eroll) {
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
		
}
