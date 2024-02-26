package com.associate.EmployeeMap;



import jakarta.persistence.CascadeType;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Emp_tb1")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue(value = "employee")
public class Employee {

	@Id

	private int eroll;
	private String ename;
	
	
	
	public Employee(int eroll, String ename) {
		super();
		this.eroll = eroll;
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Employee [eroll=" + eroll + ", ename=" + ename + "]";
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
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

}
