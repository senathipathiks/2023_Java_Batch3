package com.sts.day1.Employee;

import javax.persistence.*;

@Entity
@Table(name="EmpDetail")
public class Employee {
	@Id
	private int eid;
	private String ename;
	
	@ManyToOne(targetEntity =Department.class,cascade= CascadeType.ALL)
	@JoinColumn
	private Department d1;

	public Employee() {
		super();
	}

	public Employee(int eid, String ename, Department d1) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.d1 = d1;
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

	public Department getD1() {
		return d1;
	}

	public void setD1(Department d1) {
		this.d1 = d1;
	}

	

}
