package com.day4.bean1;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
@AttributeOverrides({
	@AttributeOverride(name = "id", column = @Column(name="id")),
	@AttributeOverride(name = "name", column = @Column(name="name"))
})
public class RegEmployee extends Employee1{

	private double salary;
	private double bonus;

	public RegEmployee() {
		// TODO Auto-generated constructor stub
	}

	public RegEmployee(int id, String name, double salary, double bonus) {
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
