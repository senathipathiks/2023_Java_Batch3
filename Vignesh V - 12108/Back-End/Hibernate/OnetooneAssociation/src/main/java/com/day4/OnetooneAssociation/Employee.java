package com.day4.OnetooneAssociation;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name ="Emp_tb")
@Inheritance(strategy =InheritanceType.JOINED)
public class Employee {

@Id
private int eroll;
private String ename;



public Employee(int eroll, String ename) {
	super();
	this.eroll = eroll;
	this.ename = ename;
}

@Override
public String toString() {
	return "Employee [eroll=" + eroll + ", ename=" + ename + "]";
}

public Employee() {
	super();
	// TODO Auto-generated constructor stub
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