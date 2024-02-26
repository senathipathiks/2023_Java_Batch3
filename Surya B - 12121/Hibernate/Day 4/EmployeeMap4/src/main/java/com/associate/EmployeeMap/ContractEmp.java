package com.associate.EmployeeMap;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "contractemp")
@PrimaryKeyJoinColumn(name = "ID")
public class ContractEmp extends Employee{
	
	
	@Column(name= "pay_per_hour")
	private float payperhour;
	
	@Column(name = "contract_duration")
	private String contract_duration;

	public ContractEmp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContractEmp(int eroll, String ename, float payperhour, String contract_duration) {
		super(eroll, ename);
		
		this.payperhour = payperhour;
		this.contract_duration = contract_duration;
	}

	public float getPayperhour() {
		return payperhour;
	}

	public void setPayperhour(float payperhour) {
		this.payperhour = payperhour;
	}

	public String getContract_duration() {
		return contract_duration;
	}

	public void setContract_duration(String contract_duration) {
		this.contract_duration = contract_duration;
	}

	@Override
	public String toString() {
		return "ContractEmp [payperhour=" + payperhour + ", contract_duration=" + contract_duration + "]";
	}
	
	
	
	
}
