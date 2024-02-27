package com.day4.bean;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("RegEmp")
public class RegularEmployee extends Employee {

	private double salary;
	private double bonus;

	public RegularEmployee() {
		// TODO Auto-generated constructor stub
	}

	public RegularEmployee(int id, String name, double salary, double bonus) {
		super(id, name);
		this.salary = salary;
		this.bonus = bonus;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "RegularEmployee [salary=" + salary + ", bonus=" + bonus + "]";
	}

}
