package com.jeeva.spring.SpringTools;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="regularemployee102")
@AttributeOverrides({
	@AttributeOverride(name="id",column=@Column(name="id")),
	@AttributeOverride(name="name",column=@Column(name="name"))
})
//Inthe Above 14 & 15 explians in the class we dont have id & name but we are 
//inheriting from the inheritEmp
public class RegularEmp extends InheritEmp {

	@Column(name="Salary")
	private float salary;
	
	@Column(name="Bonus")
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
