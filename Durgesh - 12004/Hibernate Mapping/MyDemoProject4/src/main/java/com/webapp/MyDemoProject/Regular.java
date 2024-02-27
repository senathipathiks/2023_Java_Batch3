package com.webapp.MyDemoProject;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="regularemp")
@AttributeOverrides({@AttributeOverride(name= "empId", column = @Column(name= "empId")),
	@AttributeOverride(name="empName", column = @Column(name= "empName")),
	@AttributeOverride(name="empDept", column = @Column(name= "empDept"))
})
@DiscriminatorValue("regular")

public class Regular extends Employee {
	
	@Column(name="Salary")
	private float salary;
	
	@Column(name="Bonus")
	private int bonus;
	
	
	public Regular() {
		super();
	}


	public Regular(int empId, String empName, String empDept, float salary, int bonus) {
		super(empId, empName, empDept);
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
		return "Regular [salary=" + salary + ", bonus=" + bonus + "]";
	}
}
