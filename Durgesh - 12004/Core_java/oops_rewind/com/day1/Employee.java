package com.day1;

public class Employee {
	private int empID;
	private String empName;
	private String empDept;
	private String empPosition;
	private int empSalary;
	
	Employee(int empID, String empName, String empDept, String empPosition, int empSalary) {
		this.empID=empID;
		this.empName=empName;
		this.empDept=empDept;
		this.empPosition=empPosition;
		this.empSalary=empSalary;
	}
	
	void displayEmployee() {
		System.out.println("Employee ID: "+empID);
		System.out.println("Employee Name: "+empName);
		System.out.println("Department: "+empDept);
		System.out.println("Position: "+empPosition);
		System.out.println("Salary: "+empSalary);

	}
	public static void main(String[] args) {
		Employee e1 = new Employee(12004, "Durgesh", "Developing", "Full Stack Developer", 2500);
		e1.displayEmployee();
	}

}


