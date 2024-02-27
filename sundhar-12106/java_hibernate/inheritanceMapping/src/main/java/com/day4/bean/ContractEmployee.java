package com.day4.bean;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("ConEmp")
public class ContractEmployee extends Employee {

	private double pay_per_hour;
	private String duration;

	public ContractEmployee() {
		// TODO Auto-generated constructor stub
	}

	public ContractEmployee(int id, String name, double pay_per_hour, String duration) {
		super(id, name);
		this.pay_per_hour = pay_per_hour;
		this.duration = duration;
	}

	public double getPay_per_hour() {
		return pay_per_hour;
	}

	public void setPay_per_hour(double pay_per_hour) {
		this.pay_per_hour = pay_per_hour;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "ContractEmployee [pay_per_hour=" + pay_per_hour + ", duration=" + duration + "]";
	}

}
