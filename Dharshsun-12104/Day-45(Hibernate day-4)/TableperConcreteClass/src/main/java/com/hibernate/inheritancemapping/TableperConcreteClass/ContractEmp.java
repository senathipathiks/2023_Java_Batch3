package com.hibernate.inheritancemapping.TableperConcreteClass;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.hibernate.inheritancemapping.TableperConcreteClass.Employee;

@Entity
@Table(name="contractemp102")
@AttributeOverrides({
	@AttributeOverride(name="id",column=@Column(name="id")),
	@AttributeOverride(name="name",column=@Column(name="name"))
})
public class ContractEmp extends Employee {
private float pay_per_hour;
private String contract_duration;

public ContractEmp() {
	super();
}

public ContractEmp(int id, String name, float pay_per_hour, String contract_duration) {
	super(id, name);
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

