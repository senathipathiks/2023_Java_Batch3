package com.day1.Inheritance.Employees;
import javax.persistence.*;
@Entity
@Table(name="regularemp3")
@PrimaryKeyJoinColumn(name="ID")
public class RegularEmp extends EmployeeData {
	@Column(name="salary")
	private float salary;
	
	@Column(name="bonus")
	private int bonus;
	
	public RegularEmp() {
		super();
	}	

	public RegularEmp(int id, String name,float salary, int bonus) {
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
