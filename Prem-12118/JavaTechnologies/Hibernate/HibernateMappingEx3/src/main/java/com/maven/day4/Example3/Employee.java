package com.maven.day4.Example3;

 
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="empnew2")
@Inheritance(strategy=InheritanceType.JOINED)
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name="id")
	private int empID;
	
	@Column(name="name")
	private String empname;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empID, String empname) {
		super();
		this.empID = empID;
		this.empname = empname;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empname=" + empname + "]";
	}
	
	
	 
	
	
	 
	
	
	
	 

	 

}
