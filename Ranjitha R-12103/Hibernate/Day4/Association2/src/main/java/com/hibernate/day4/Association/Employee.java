package com.hibernate.day4.Association;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Emp")
public class Employee {
	@Id
	private int eroll;
	private String name;

	@ManyToOne(targetEntity = Department.class,cascade = CascadeType.REFRESH)
	@JoinColumn(name="deptid")
	private Department d1;

	public Employee() {

	}

	public Employee(int eroll, String name, Department d1) {
		super();
		this.eroll = eroll;
		this.name = name;
		this.d1 = d1;
	}

	public int getEroll() {
		return eroll;
	}

	public void setEroll(int eroll) {
		this.eroll = eroll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getD1() {
		return d1;
	}

	public void setD1(Department d1) {
		this.d1 = d1;
	}

	@Override
	public String toString() {
		return "Employee [eroll=" + eroll + ", name=" + name + ", d1=" + d1 + "]";
	}

}