package com.webapp.MyDemoProject;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("contract")
public class Contract extends Employee{
	
	@Column(name = "Wages_per_day")
	private float wages;
	
	@Column(name = "No_of_Years")
	private int years;

	public Contract() {
		super();
	}

	public Contract(int empId, String empName, String empDept, float wages, int years) {
		super(empId, empName, empDept);
		this.wages = wages;
		this.years = years;
	}

	public float getWages() {
		return wages;
	}

	public void setWages(float wages) {
		this.wages = wages;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	@Override
	public String toString() {
		return "Contract [wages=" + wages + ", years=" + years + "]";
	}	
}
