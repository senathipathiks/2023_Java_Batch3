package com.sample.bean;

import javax.persistence.*;

@Entity
@DiscriminatorValue("RegularEmployee")
public class RegularEmployee extends Employee {
	
	private float salary;
	private int bonus;
	public RegularEmployee() {
		super();
	}
	public RegularEmployee(int eId, String eName, float salary, int bonus) {
		super(eId, eName);
		this.salary = salary;
		this.bonus = bonus;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	
}
