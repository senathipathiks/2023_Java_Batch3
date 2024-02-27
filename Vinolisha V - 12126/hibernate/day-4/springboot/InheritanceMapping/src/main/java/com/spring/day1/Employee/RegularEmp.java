package com.spring.day1.Employee;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("regularmap")


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
