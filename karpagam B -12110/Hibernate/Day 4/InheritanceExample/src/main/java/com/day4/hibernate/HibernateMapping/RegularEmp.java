package com.day4.hibernate.HibernateMapping;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("regularemp") // in the same table we can differentiate the types ,in simple it is differentiator
public class RegularEmp extends Employee {
	@Column(name="salary")
	private float salary;
	
	@Column(name="bonus")
	private int bonus;
	
	public RegularEmp() {
		super();
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

	@Override
	public String toString() {
		return "RegularEmp [salary=" + salary + ", bonus=" + bonus + "]";
	}
	
	

}
