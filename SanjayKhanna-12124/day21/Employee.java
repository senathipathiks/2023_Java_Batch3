package com.day21;

public class Employee {
	
	private int empId;
	private String empName;
	private String empGender;
	private int empAge;
	
	public Employee(int empId,String empName,String empGender,int empAge) {
	this.empAge = empAge;
	this.empGender = empGender;
	this.empName = empName;
	this.empId = empId;
	}
	
	void display() {
		System.out.println("Employee Id : "+empId);
		System.out.println("Employee Name : "+empName);
		System.out.println("Employee Gender : "+empGender);
		System.out.println("Employee Age: "+empAge);
		
	}
	

	public static void main(String[] args) {
		Employee obj1 = new Employee(12124,"Sanjay khanna" ,"Male", 23);
		obj1.display();

	}

}
