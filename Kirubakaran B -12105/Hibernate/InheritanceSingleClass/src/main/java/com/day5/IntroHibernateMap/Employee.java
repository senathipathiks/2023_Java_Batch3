package com.day5.IntroHibernateMap;

import jakarta.persistence.CascadeType;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;


import jakarta.persistence.Table;

@Entity
@Table(name = "EmpInheritance")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type",discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue(value="employee")
public class Employee {

	@Id
	private int eroll;
	private String ename;


	public Employee() {

		// TODO Auto-generated constructor stub

	}

	public Employee(int eroll, String ename) {

		super();

		this.eroll = eroll;

		this.ename = ename;

		

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
