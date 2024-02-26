package com.associate.EmployeeMap;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Emp")
public class Employee {

	@Id

	private int eroll;
	private String ename;
	
	@ManyToOne(targetEntity = Dept.class, cascade = CascadeType.ALL)
	@JoinColumn
	private Dept d1;
	
	@Override
	public String toString() {
		return "Employee [eroll=" + eroll + ", ename=" + ename + "]";
	}
	
	
	

	public Laptop getL1() {
		return l1;
	}




	public void setL1(Laptop l1) {
		this.l1 = l1;
	}




	



	public Employee(int eroll, String ename, Laptop l1) {
		super();
		this.eroll = eroll;
		this.ename = ename;
		this.l1 = l1;
	}




	public Employee() {
		super();
		// TODO Auto-generated constructor stub
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

}
