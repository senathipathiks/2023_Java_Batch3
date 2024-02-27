package com.hibernate.day4.Association;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="contEmp1")
@AttributeOverrides({
	@AttributeOverride(name="eId",column = @Column(name="eId")),
	@AttributeOverride(name="eName",column = @Column(name="eName"))
})
//@DiscriminatorValue("contractemp")
public class ContractEmp extends Employee{
	@Column(name="pay_per_hr")
	private float pay_per_hr;
	
	@Column(name = "contractDuration")
	private String contractDuration;

	public ContractEmp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContractEmp(int eId, String eName, float pay_per_hr, String contractDuration) {
		super(eId, eName);
		this.pay_per_hr = pay_per_hr;
		this.contractDuration = contractDuration;
	}

	public float getPay_per_hr() {
		return pay_per_hr;
	}

	public void setPay_per_hr(float pay_per_hr) {
		this.pay_per_hr = pay_per_hr;
	}

	public String getContractDuration() {
		return contractDuration;
	}

	public void setContractDuration(String contractDuration) {
		this.contractDuration = contractDuration;
	}

	@Override
	public String toString() {
		return "ContractEmp [pay_per_hr=" + pay_per_hr + ", contractDuration=" + contractDuration + "]";
	}

	
	
	
}
