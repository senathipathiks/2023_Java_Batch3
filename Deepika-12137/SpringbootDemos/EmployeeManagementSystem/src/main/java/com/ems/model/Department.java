package com.ems.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dept")
public class Department {

	@Id
	private int id;
	
	@Column(name = "Dept_name")
	private String deptName;
	
	@Column(name = "HOD_name")
	private String deptHod;

	
	public Department(int id, String deptName, String deptHod) {
		super();
		this.id = id;
		this.deptName = deptName;
		this.deptHod = deptHod;
	}


	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDeptName() {
		return deptName;
	}


	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}


	public String getDeptHod() {
		return deptHod;
	}


	public void setDeptHod(String deptHod) {
		this.deptHod = deptHod;
	}
	
	
	

}
