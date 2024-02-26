package com.associate.EmployeeMap;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "RegEmp")
@PrimaryKeyJoinColumn(name = "ID")

public class RegularEmp extends Employee {
	
	@Column(name = "salary")
	private float salary;
	
	@Column(name = "bonus")
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

	@Override
	public String toString() {
		return "RegularEmp [salary=" + salary + ", bonus=" + bonus + "]";
	}
	
	
	
}
