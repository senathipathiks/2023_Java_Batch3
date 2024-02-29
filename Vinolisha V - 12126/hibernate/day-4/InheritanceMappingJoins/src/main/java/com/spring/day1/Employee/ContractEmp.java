package com.spring.day1.Employee;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="ContractEmp1")
@PrimaryKeyJoinColumn(name="ID")
public class ContractEmp extends Employee {
	
	@Column(name="pay_per_hour")
	private float par_per_hour;
	
	@Column(name="contract_duration")
	private String contract_duration;
	
	public ContractEmp() {
		super();
	}

	public ContractEmp(int eroll, String ename, float par_per_hour, String contract_duration) {
		super(eroll, ename);
		this.par_per_hour = par_per_hour;
		this.contract_duration = contract_duration;
	}

	public float getPar_per_hour() {
		return par_per_hour;
	}

	public void setPar_per_hour(float par_per_hour) {
		this.par_per_hour = par_per_hour;
	}

	public String getContract_duration() {
		return contract_duration;
	}

	public void setContract_duration(String contract_duration) {
		this.contract_duration = contract_duration;
	}

	@Override
	public String toString() {
		return "ContractEmp [par_per_hour=" + par_per_hour + ", contract_duration=" + contract_duration + "]";
	}
	
	
	
}
