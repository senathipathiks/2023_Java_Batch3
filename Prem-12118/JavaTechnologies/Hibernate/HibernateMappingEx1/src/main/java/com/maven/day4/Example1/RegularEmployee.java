package com.maven.day4.Example1;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("regularemp")
public class RegularEmployee extends  Employee{
	
	private float salary;
	
	private int bonus;

	public RegularEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RegularEmployee(int empID, String empname, float salary, int bonus) {
		super(empID, empname);
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
