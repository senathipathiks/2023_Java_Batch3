package com.hibernate.relationshipmappingday4.Employee1manytoone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Employee4")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eroll;
	private String ename;
	
	
	@ManyToOne(targetEntity = Department.class,cascade=CascadeType.ALL)
	@JoinColumn()
	private Department d1; //relationship is unidirectional and laptopid is foreign key
	
	public Employee() {
		super();
	}

	public Employee(int eroll, String ename,Department d1) {
		super();
		this.eroll = eroll;
		this.ename = ename;
		this.d1 = d1;
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

	public Department getd1() {
		return d1;
	}

	public void setL1(Department d1) {
		this.d1 = d1;
	}

	
}
