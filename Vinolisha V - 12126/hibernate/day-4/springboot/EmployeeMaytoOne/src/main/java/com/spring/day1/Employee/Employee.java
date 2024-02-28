package com.spring.day1.Employee;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

	@Entity
	@Table(name="Employee1")
	
	
	public class Employee {
	@Id
		private int eroll;
		private String ename;
	
		@OneToOne(targetEntity =Department.class, cascade= CascadeType.ALL)
		@JoinColumn() //what is the column you refering as a foreign key
		private Department d1;
		
	

	public Employee() {
		super();
		
	}

	public Employee(int eroll, String ename, Department d1) {
		super();
		this.eroll = eroll;
		this.ename = ename;
		this.d1 = d1;
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

	public Department getd1() {
		return d1;
	}

	public void setL1(Department d1) {
		this.d1 = d1;
	}
		
}
