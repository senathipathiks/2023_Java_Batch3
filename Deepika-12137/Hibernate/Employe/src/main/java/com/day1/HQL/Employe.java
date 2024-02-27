package com.day1.HQL;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employe")
public class Employe {
@Id
@Column(name="Eid")
private int Eid;
@Column(name="Ename")
private String Ename;
@Column(name="dept")
private int dept;

public Employe() {
	super();
	// TODO Auto-generated constructor stub
}
public Employe(int eid, String ename, int dept) {
	super();
	Eid = eid;
	this.Ename = ename;
	this.dept = dept;
}
public int getEid() {
	return Eid;
}
public void setEid(int eid) {
	Eid = eid;
}
public String getEname() {
	return Ename;
}
public void setEname(String ename) {
	this.Ename = ename;
}
public int getDept() {
	return dept;
}
public void setDept(int dept) {
	this.dept = dept;
}
@Override
public String toString() {
	return "Employe [Eid=" + Eid + ", ename=" + Ename + ", dept=" + dept + "]";
}


}
