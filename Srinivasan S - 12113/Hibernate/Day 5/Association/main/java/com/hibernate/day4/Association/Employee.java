package com.hibernate.day4.Association;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Emp")
public class Employee {
	@Id
	private int eroll;
	private String name;
	
	@OneToOne(targetEntity = Laptop.class, cascade= CascadeType.ALL)
	@JoinColumn
	private Laptop l;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eroll, String name, Laptop l) {
		super();
		this.eroll = eroll;
		this.name = name;
		this.l = l;
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

	public Laptop getL() {
		return l;
	}

	public void setL(Laptop l) {
		this.l = l;
	}

	@Override
	public String toString() {
		return "Employee [eroll=" + eroll + ", name=" + name + "]";
	}
	
	
}
