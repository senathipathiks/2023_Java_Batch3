package com.solidprinciples.comparator;

public class Employee {

	private int empId;
	private String firstName;
	private String lastName;

	public Employee() {
		super();
	}

	public Employee(int empId, String firstName, String lastName) {
		super();
		this.empId = empId;
		this.setFirstName(firstName);
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + getFirstName() + ", lastName=" + lastName + "]";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

}
