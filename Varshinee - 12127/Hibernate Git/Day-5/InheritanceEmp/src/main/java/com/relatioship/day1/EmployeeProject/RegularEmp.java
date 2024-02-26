package com.relatioship.day1.EmployeeProject;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "regularemp102")
@AttributeOverrides({
	@AttributeOverride(name="id",column = @Column(name="id")),
	@AttributeOverride(name="name",column = @Column(name="name"))
})
public class RegularEmp extends Employee1 {
	@Column(name = "salary")
	private float salary;

	@Column(name = "bonus")
	private int bonus;

	public RegularEmp() {
		super();

	}

	public RegularEmp(int id, String name, float salary, int bonus) {
		super(id,name);
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

	@Override
	public String toString() {
		return "RegularEmp [salary=" + salary + ", bonus=" + bonus + "]";
	}

	

}
