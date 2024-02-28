package com.day1.core;

public class Employee {
	
	private int empId;
	private String empName;
	private String location;
	private String gender;
	private int age;
	
	

	public Employee(int empId, String empName, String location, String gender, int age) {
		this.empId = empId;
		this.empName = empName;
		this.location = location;
		this.gender = gender;
		this.age = age;
	}
	
	void displayEmployee() {
		System.err.println();
		System.out.println("Employee id is : "+empId);
		System.out.println("Employee name is : "+empName);
		System.out.println("Employee Locaton is : "+location);
		System.out.println("Gender of the employee is : "+gender);
		System.out.println("Age of the employee is : "+age);
	}



	public static void main(String[] args) {
		Employee emp=new Employee(123,"Tamizh","Chennai","Male",26);
		emp.displayEmployee();
		
	}

}
