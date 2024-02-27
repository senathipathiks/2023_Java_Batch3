package com.hibernate.day4.Association;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="emp")
public class Employee {
	@Id
	private int eroll;
	private String name;
	
	@ManyToOne(targetEntity = Department.class, cascade= CascadeType.REFRESH)
	@JoinColumn
	private Department d;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eroll, String name, Department d) {
		super();
		this.eroll = eroll;
		this.name = name;
		this.d = d;
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

	public Department getL() {
		return d;
	}

	public void setL(Department d) {
		this.d = d;
	}

	@Override
	public String toString() {
		return "Employee [eroll=" + eroll + ", name=" + name + "]";
	}
	
	
}
