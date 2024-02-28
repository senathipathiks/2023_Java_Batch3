package com.jeeva.spring.SpringTools;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="ContractEmploye")
@AttributeOverrides({
	@AttributeOverride(name="id",column=@Column(name="id")),
	@AttributeOverride(name="name",column=@Column(name="name"))
})
// Inthe Above 14 & 15 explians in the class we dont have id & name but we are 
// inheriting from the inheritEmp
public class ContractEmp extends InheritEmp  {
	@Column(name="pay_per_hour")
	private float pay_per_hour;
	@Column(name="contract_duration")
	private String contract_duration;
	
	public ContractEmp() {
		super();
	}

	public ContractEmp(int eId,String eName,float pay_per_hour, String contract_duration) {
		super(eId,eName);
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
