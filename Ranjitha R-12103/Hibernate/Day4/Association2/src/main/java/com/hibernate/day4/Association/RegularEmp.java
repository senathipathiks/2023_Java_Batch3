package com.hibernate.day4.Association;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("regularemp")
public class RegularEmp extends Employees {

	@Column(name = "salary")
	private float salary;

	@Column(name = "bonus")
	private int bonus;

	public RegularEmp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RegularEmp(int id, String name, float salary, int bonus) {
		super(id, name);
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
