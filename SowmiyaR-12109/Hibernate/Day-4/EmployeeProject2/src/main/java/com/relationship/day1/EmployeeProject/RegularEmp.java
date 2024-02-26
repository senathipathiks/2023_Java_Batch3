package com.relationship.day1.EmployeeProject;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("regular")
public class RegularEmp extends Employee1{
        @Column(name="salary")
        private float salary;
        
        @Column(name="bonus")
        private int bonus;

		public RegularEmp() {
			super();
			// TODO Auto-generated constructor stub
		}

		public RegularEmp(int id,String name,float salary, int bonus) {
			super(id,name);
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
