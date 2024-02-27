package com.spring.day1.Employee;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Emp")
public class Employee {
@Id
private int eroll;
private String ename;
@ManyToOne(targetEntity = Department.class,cascade = CascadeType.REFRESH)
@JoinColumn
private Department d1;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int eroll, String ename, Department d1) {
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
public Department getD1() {
	return d1;
}
public void setL1(Department l1) {
	this.d1 = d1;
}
@Override
public String toString() {
	return "Employee [eroll=" + eroll + ", ename=" + ename + ", d1=" + d1 + "]";
}


}
