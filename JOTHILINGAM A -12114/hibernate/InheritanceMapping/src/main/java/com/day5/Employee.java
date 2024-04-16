package com.day5;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name = "Emppppp")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eroll;

	private String ename;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int eroll, String ename) {
		super();
		this.eroll = eroll;
		this.ename = ename;
	}

	public int getEroll() {
		return eroll;
	}

	public void setEroll(int eroll) {
		this.eroll = eroll;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Employee [eroll=" + eroll + ", ename=" + ename + "]";
	}

}
