package com.spring.day1.Employee;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="employee103")
@Inheritance(strategy = InheritanceType.JOINED)

public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "eroll")
private int eroll;
@Column(name = "ename")
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
