package com.ems.bean;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

//bean, model, pojo class are the same

@Entity
@Table(name="tbl_EmpMap")
public class Employee {
	
	@Id
	@Column(name="EmpID")
	private int empId;
	@Column(name="Name")
	private String empName;
	@Column(name="Salary")
	private float empSalary;
	@Column(name="Department")
	private String empDeprt;
	@Column(name="Domain")
	private String empDomain;
	@Column(name="MobileNo")
	private String empPh;
	@Column(name="BloodGroup")
	private String empBlood;
	
	@ManyToOne(targetEntity = Department.class, cascade = CascadeType.DETACH)
	@JoinColumn(name="dptId")
	private Department dprt;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String empName, float empSalary, String empDeprt, String empDomain, String empPh,
			String empBlood, Department dprt) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empDeprt = empDeprt;
		this.empDomain = empDomain;
		this.empPh = empPh;
		this.empBlood = empBlood;
		this.dprt = dprt;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpDeprt() {
		return empDeprt;
	}

	public void setEmpDeprt(String empDeprt) {
		this.empDeprt = empDeprt;
	}

	public String getEmpDomain() {
		return empDomain;
	}

	public void setEmpDomain(String empDomain) {
		this.empDomain = empDomain;
	}

	public String getEmpPh() {
		return empPh;
	}

	public void setEmpPh(String empPh) {
		this.empPh = empPh;
	}

	public String getEmpBlood() {
		return empBlood;
	}

	public void setEmpBlood(String empBlood) {
		this.empBlood = empBlood;
	}

	public Department getDprt() {
		return dprt;
	}

	public void setDprt(Department dprt) {
		this.dprt = dprt;
	}

	
	
	
	
	
	
	

}
