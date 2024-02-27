package com.hql.day1.HQLProgram;

import javax.persistence.NamedQuery;
import javax.persistence.NamedQueries;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//=======================================NAMED QUERY================================================================================
@NamedQueries(
		{
@NamedQuery(
	name="findEmployeeById",
	query="from NamedQueryEx e where e.eid = :eid"
	)
//@NamedQuery(
//		name="findElementByDept",
//		query="from Employee e where e.dept > :dept"
//		),
//@NamedQuery(
//		name="findEmployeeByName",
//		query="from Employee e where e.name = :ename"
//		)


} )
@Entity
@Table(name="EmpDetail1")

public class NamedQueryEx {
	@Id
	private int eid;
	@Column(name="name")
	private String ename;
	@Column(name="dept")
	private int dept;
	public NamedQueryEx() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NamedQueryEx(int eid, String ename, int dept) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.dept = dept;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getDept() {
		return dept;
	}
	public void setDept(int dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "NamedQueryEx [eid=" + eid + ", ename=" + ename + ", dept=" + dept + "]";
	}
	

}
