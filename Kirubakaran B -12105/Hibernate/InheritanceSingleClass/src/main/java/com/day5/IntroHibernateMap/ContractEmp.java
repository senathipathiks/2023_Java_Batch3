package com.day5.IntroHibernateMap;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value="contractemp")
public class ContractEmp extends Employee {

	
	private float pay_hour;
	
	private String time;

	public ContractEmp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContractEmp(int eroll, String ename, float pay_hour, String time) {
		super(eroll, ename);
		this.pay_hour = pay_hour;
		this.time = time;
	}

	public float getPay_hour() {
		return pay_hour;
	}

	public void setPay_hour(float pay_hour) {
		this.pay_hour = pay_hour;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	
	
}
