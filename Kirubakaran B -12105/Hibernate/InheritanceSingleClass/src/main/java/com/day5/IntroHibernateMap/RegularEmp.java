package com.day5.IntroHibernateMap;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value="regularemp")
public class RegularEmp extends Employee {
	
	private float salary;
	
	private int bonus;

	public RegularEmp() {
		super();
		// TODO Auto-generated constructor stub
	}

   

	public RegularEmp(int eroll, String ename,float salary, int bonus) {
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
