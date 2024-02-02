package com.emp_db.bean;

public class Employee {

	private int emp_no;
	private String emp_name;
	private String emp_dept;
	private String emp_address;

	public Employee(int emp_no, String emp_name, String emp_dept, String emp_address) {
		super();
		this.emp_no = emp_no;
		this.emp_name = emp_name;
		this.emp_dept = emp_dept;
		this.emp_address = emp_address;
	}

	public int getEmp_no() {
		return emp_no;
	}

	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getEmp_dept() {
		return emp_dept;
	}

	public void setEmp_dept(String emp_dept) {
		this.emp_dept = emp_dept;
	}

	public String getEmp_address() {
		return emp_address;
	}

	public void setEmp_address(String emp_address) {
		this.emp_address = emp_address;
	}

}
