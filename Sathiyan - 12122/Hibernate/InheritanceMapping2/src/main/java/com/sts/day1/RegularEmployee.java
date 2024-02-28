package com.sts.day1;

import javax.persistence.*;

@Entity
@Table(name = "regularemp2")
@AttributeOverrides({
	@AttributeOverride(name="id",column=@Column(name="id")),
	@AttributeOverride(name="name", column=@Column(name="name"))
})
public class RegularEmployee extends Employee {
	

	@Column(name="salary")
	private float salary;
	
	@Column(name="bonus")
	private int bonus;
	
	public RegularEmployee() {
		super();
	}

	public RegularEmployee(int id, String name,float salary, int bonus) {
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
