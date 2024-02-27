package com.day4.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Deptartment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String dept_name;
//	private String dept_name;
//	private List<Employee> emp_id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

//	public List<Employee> getEmp_id() {
//		return emp_id;
//	}
//
//	public void setEmp_id(List<Employee> emp_id) {
//		this.emp_id = emp_id;
//	}

	@Override
	public String toString() {
		return "Deptartment [id=" + id + ", dept_name=" + dept_name + "]";
	}

}
