package com.sts.day1.Employee;

import javax.persistence.*;

@NamedQueries(  
	    {  
	        @NamedQuery(  
	        name = "findEmployeeById",
	        query = "from Employee e where e.eid = :eid"  
	        ),
	        
	        @NamedQuery(
	        name="findElementByDept",
	        query="from Employee e where e.dept > :dept"
	        ),
	        
	        @NamedQuery(
	    	        name="findElementByName",
	    	        query="from Employee e where e.ename = :name"
	        )  
	    }  
	)
@Entity
@Table(name="EmpDetail")
public class Employee {
	@Id
	private int eid;
	@Column(name="name")
	private String ename;
	@Column(name="dept")
	private int dept;
	
	public Employee() {
		super();
	}

	public Employee(int eid, String ename, int dept) {
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
		return "eid=" + eid + ", ename=" + ename + ", dept=" + dept;
	}
	
	

}
