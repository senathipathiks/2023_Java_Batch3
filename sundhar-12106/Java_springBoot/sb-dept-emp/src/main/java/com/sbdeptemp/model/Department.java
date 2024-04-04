package com.sbdeptemp.model;

import java.util.List;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Department {

	@Id
//	@GenericGenerator(name = "deptCutomId", type = com.sbdeptemp.generator.DepartmentIdGenerator.class)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int deptId;
	private String deptName;
	private String location;
	
	

	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(int deptId, String deptName, String location, List<Employee> employee) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.location = location;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}


	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", location=" + location +"]";
	}

}
