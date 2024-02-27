package com.day4.bean2;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "ID")
public class ConEmployee extends Employee1{
	
	
	private double pay_per_hour;
	private String duration;

	public ConEmployee() {
		// TODO Auto-generated constructor stub
	}

	public ConEmployee(int id, String name, double pay_per_hour, String duration) {
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
