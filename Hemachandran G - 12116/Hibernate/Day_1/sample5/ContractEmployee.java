package com.mon.jpa.sample5;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@DiscriminatorValue("contractemployee102")
@PrimaryKeyJoinColumn(name = "ID")

public class ContractEmployee extends Employee {

	@Column(name="pay_per_hour")
	private float pay_per_hour;
	
	@Column(name="contract_duration")
	private String contract_duration;

	public ContractEmployee() {
		super();
		
	}

	

	public ContractEmployee(int empId, String empName, float pay_per_hour, String contract_duration) {
		super(empId, empName);
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
