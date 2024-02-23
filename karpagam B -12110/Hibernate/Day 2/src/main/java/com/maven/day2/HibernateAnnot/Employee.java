package com.maven.day2.HibernateAnnot;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // represent pojo class
@Table(name="Employee_tbl") // to create a table name

public class Employee {
	
	@Id // to set primary key
	@GeneratedValue(strategy=GenerationType.IDENTITY) // subelement of id, if you want generate it automatically we can use it
	
	private int eid;
	@Column(name="ename") // defining the colun name using annotation , if we dont specify it will automatically taken the default name
	private String ename;
	@Column(name="esal")
	private String esal;
	
	public Employee(){
		
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
	}

	public Employee(int eid, String ename, String esal) {
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
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

	public String getEsal() {
		return esal;
	}

	public void setEsal(String esal) {
		this.esal = esal;
	}

	
	
	

}
