package com.spring.day1.Employee;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "regularemployee103")
@PrimaryKeyJoinColumn(name ="ID")
public class RegularEmp extends Employee {
	@Column(name = "salary")
	private float salary;
	@Column(name="bonus")
	private int bonus;
	public RegularEmp() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public RegularEmp(int eroll, String ename, float salary, int bonus) {
		super(eroll, ename);
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
