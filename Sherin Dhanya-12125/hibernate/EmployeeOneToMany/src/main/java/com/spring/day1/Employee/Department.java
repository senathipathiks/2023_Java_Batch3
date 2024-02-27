package com.spring.day1.Employee;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Department")

public class Department {
@Id
private int deptid;
private String deptname;
@OneToMany(targetEntity = Employee.class,cascade = CascadeType.REFRESH)
@JoinColumn
private Employee e1;
public Department() {
	super();
	// TODO Auto-generated constructor stub
}
public Department(int deptid, String deptname, Employee e1) {
	super();
	this.deptid = deptid;
	this.deptname = deptname;
	this.e1 = e1;
}
public int getDeptid() {
	return deptid;
}
public void setDeptid(int deptid) {
	this.deptid = deptid;
}
public String getDeptname() {
	return deptname;
}
public void setDeptname(String deptname) {
	this.deptname = deptname;
}
public Employee getE1() {
	return e1;
}
public void setE1(Employee e1) {
	this.e1 = e1;
}

}
