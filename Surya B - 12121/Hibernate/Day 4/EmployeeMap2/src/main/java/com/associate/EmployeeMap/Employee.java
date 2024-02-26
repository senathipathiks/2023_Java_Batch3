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
@Table(name = "Emp_tbl")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue(value = "employee")
public class Employee {

	@Id

	private int eroll;
	private String ename;
	
	@ManyToOne(targetEntity = Dept.class, cascade= CascadeType.ALL)

	@JoinColumn
	private Dept d1;

	@Override
	public String toString() {
		return "Employee [eroll=" + eroll + ", ename=" + ename + "]";
	}

	public Dept getD1() {
		return d1;
	}

	public void setD1(Dept d1) {
		this.d1 = d1;
	}


	public Employee(int eroll, String ename, Dept d1) {
		super();
		this.eroll = eroll;
		this.ename = ename;
		this.d1 = d1;
	}

	public Employee() {
		super();
		
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
