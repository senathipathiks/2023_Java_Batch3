package com.lms.bean;

import jakarta.persistence.*;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int departmentId;

	private String departmentName;
	private String departmentCategory;

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	
	public String getDepartmentCategory() {
		return departmentCategory;
	}

	public void setDepartmentCategory(String departmentCategory) {
		this.departmentCategory = departmentCategory;
	}

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName
				+ ", departmentCategory=" + departmentCategory + "]";
	}

	public Department(int departmentId, String departmentName, String departmentCategory) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.departmentCategory = departmentCategory;
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
