package com.maven.day4.Example3;


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="regularemp103")
@PrimaryKeyJoinColumn(name= "ID")
 
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
