package com.spring.day1.Employee;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="regularemployee")
@AttributeOverrides({
	@AttributeOverride(name="id",column=@Column(name="id")),
	@AttributeOverride(name="name", column=@Column(name="name"))
})




public class RegularEmp extends Employee{
		@Column(name="salary")
		private float salary;
		
		@Column(name="bonus")
		private int bouns;
		
		public RegularEmp() {
			super();
			
		}

		public RegularEmp(int eroll, String ename, float salary, int bouns) {
			super(eroll, ename);
			this.salary = salary;
			this.bouns = bouns;
		}

		public float getSalary() {
			return salary;
		}

		public void setSalary(float salary) {
			this.salary = salary;
		}

		public int getBouns() {
			return bouns;
		}

		public void setBouns(int bouns) {
			this.bouns = bouns;
		}
		
		

}
