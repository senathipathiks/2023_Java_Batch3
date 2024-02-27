package com.spring.day1.Employee;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Emp")
public class Employee {
@Id
private int eroll;
private String ename;
@OneToOne(targetEntity = Laptop.class,cascade = CascadeType.ALL)
@JoinColumn
private Laptop l1;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int eroll, String ename, Laptop l1) {
	super();
	this.eroll = eroll;
	this.ename = ename;
	this.l1 = l1;
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
public Laptop getL1() {
	return l1;
}
public void setL1(Laptop l1) {
	this.l1 = l1;
}
@Override
public String toString() {
	return "Employee [eroll=" + eroll + ", ename=" + ename + ", l1=" + l1 + "]";
}


}
