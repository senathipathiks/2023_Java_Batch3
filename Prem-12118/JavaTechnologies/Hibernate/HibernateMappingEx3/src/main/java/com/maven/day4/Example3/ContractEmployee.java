package com.maven.day4.Example3;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="ContractEmp103")

@PrimaryKeyJoinColumn(name= "ID")

public class ContractEmployee extends Employee {

	 private float pay_per_hour;
	 
	 private String contract_duration;

	
	 public ContractEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ContractEmployee(int empID, String empname, float pay_per_hour, String contract_duration) {
		super(empID, empname);
		this.pay_per_hour = pay_per_hour;
		this.contract_duration = contract_duration;
	}


	public float getPay_per_hour() {
		return pay_per_hour;
	}


	public void setPay_per_hour(float pay_per_hour) {
		this.pay_per_hour = pay_per_hour;
	}


	public String getContract_duration() {
		return contract_duration;
	}


	public void setContract_duration(String contract_duration) {
		this.contract_duration = contract_duration;
	}
	 
	

	 
	 
	 
}
