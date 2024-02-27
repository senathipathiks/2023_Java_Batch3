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
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int eroll, String ename) {
	super();
	this.eroll = eroll;
	this.ename = ename;
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
