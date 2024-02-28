package com.day4.OnetooneAssociation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

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

