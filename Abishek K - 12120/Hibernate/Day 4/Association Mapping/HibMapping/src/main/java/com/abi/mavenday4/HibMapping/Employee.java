package com.abi.mavenday4.HibMapping;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	
		@Id
		private int roll;
		private String name;
		
		@OneToOne(targetEntity = Laptop.class, cascade = CascadeType.ALL)
		@JoinColumn
		private Laptop l1;
		
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Employee(int roll, String name, Laptop l1) {
			super();
			this.roll = roll;
			this.name = name;
			this.l1 = l1;
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
		public Laptop getL1() {
			return l1;
		}
		public void setL1(Laptop l1) {
			this.l1 = l1;
		}
		

}
