package com.relationship.day1.EmployeeProject;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="emptable")
public class Employee {
     @Id
     
     private int eroll;
     private String ename;
     
     @ManyToOne(targetEntity = Department.class, cascade=CascadeType.ALL)
     @JoinColumn(name="deptid")
     private Department id;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eroll, String ename, Department id) {
		super();
		this.eroll = eroll;
		this.ename = ename;
		this.id = id;
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

	public Department getId() {
		return id;
	}

	public void setId(Department id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [eroll=" + eroll + ", ename=" + ename + ", id=" + id + "]";
	}

	
     
    
     
     
     
}
