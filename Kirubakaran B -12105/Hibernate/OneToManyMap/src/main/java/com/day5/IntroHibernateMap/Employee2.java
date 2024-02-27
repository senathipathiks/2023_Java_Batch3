package com.day5.IntroHibernateMap;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "EmpOneToMany")
public class Employee2 {

	@Id
	private int empid;
	private String empname;

	@ManyToOne(targetEntity = Department2.class, cascade = CascadeType.ALL)
	private Department2 l1;

	public Employee2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee2(int empid, String empname, Department2 l1) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.l1 = l1;
	}

	public int getempid() {
		return empid;
	}

	public void setempid(int empid) {
		this.empid = empid;
	}

	public String getempname() {
		return empname;
	}

	public void setempname(String empname) {
		this.empname = empname;
	}

	public Department2 getL1() {
		return l1;
	}

	public void setL1(Department2 l1) {
		this.l1 = l1;
	}

	
}
