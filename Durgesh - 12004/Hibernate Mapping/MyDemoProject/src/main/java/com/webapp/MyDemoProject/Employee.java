package com.webapp.MyDemoProject;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name= "Employee")

public class Employee {
	
	@Id
	private int empId;
	@Column(name= "Employee_Name")
	private String empName;
	@Column(name= "Employee_Dept")
	private String empDept;
	
	@OneToOne(targetEntity = Laptop.class, cascade = CascadeType.ALL)
	@JoinColumn
	private Laptop l1;

	public Employee() {
		super();
	}

	public Employee(int empId, String empName, String empDept, Laptop l1) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
		this.l1 = l1;
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

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public Laptop getL1() {
		return l1;
	}

	public void setL1(Laptop l1) {
		this.l1 = l1;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDept=" + empDept + ", l1=" + l1 + "]";
	}	

}
