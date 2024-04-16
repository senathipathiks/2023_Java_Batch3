package com.day5;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@AttributeOverrides({
	@AttributeOverride(name = "id",column = @Column(name="eroll")),
	@AttributeOverride(name = "name",column = @Column(name="ename"))
})
@Table(name = "ContractEmp")
public class ContractEmp extends Employee {
	
	@Column(name ="pay_per_hour" )
	private float pay_per_hour;
	@Column(name = "contract_duration")
	private String contract_duration;
	
	public ContractEmp() {
		
	}

	public ContractEmp(int eroll, String ename, float pay_per_hour, String contract_duration) {
		super(eroll, ename);
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

	@Override
	public String toString() {
		return "ContractEmp [pay_per_hour=" + pay_per_hour + ", contract_duration=" + contract_duration + "]";
	}

}
