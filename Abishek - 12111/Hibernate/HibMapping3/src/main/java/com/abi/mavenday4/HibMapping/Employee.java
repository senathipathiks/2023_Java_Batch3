package com.abi.mavenday4.HibMapping;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	
		@Id
		private int roll;
		private String name;
		
		@ManyToOne(targetEntity = Department.class, cascade = CascadeType.ALL)
		@JoinColumn(referencedColumnName = "deptname")
		private Department d1;

		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Employee(int roll, String name, Department d1) {
			super();
			this.roll = roll;
			this.name = name;
			this.d1 = d1;
		}

		public int getRoll() {
			return roll;
		}

		public void setRoll(int roll) {
			this.roll = roll;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Department getD1() {
			return d1;
		}

		public void setD1(Department d1) {
			this.d1 = d1;
		}
		
		

}
