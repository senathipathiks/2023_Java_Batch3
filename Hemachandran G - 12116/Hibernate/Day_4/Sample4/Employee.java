package com.mon.jpa.sample4;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;



@Entity
@Table(name="Employee100")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type",discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue(value="employee")

public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name="id")
	
	private int empId;
	
	@Column(name="name")
	private String empName;
	

	
	public Employee() {
		
	}
	
	
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;

	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}









	
}	
	
	