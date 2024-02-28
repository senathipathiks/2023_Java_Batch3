package com.jeeva.spring.SpringTools;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("regularemp")
public class RegularEmp extends InheritEmp {


	private float salary;
	private int bonus;



	public RegularEmp() {
		super();
	}



	public RegularEmp(int eRoll,String eName,float salary, int bonus) {
		super(eRoll,eName);
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
