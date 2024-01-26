package com.dayadv1;

public class Employee {
private int employeeID;
private String name;
private String role;
private int age;
private String gender;

	public Employee(int employeeID, String name, String role, int age, String gender) {
	
	this.employeeID = employeeID;
	this.name = name;
	this.role = role;
	this.age = age;
	this.gender = gender;
}
	void displayDetails()
	{
		System.out.println("Employee Id is " +employeeID);
		System.out.println("Emlpoyee name is " +name);
		System.out.println("The role assigned is " +role);
		System.out.println("Age of the employee is " +age);
		System.out.println("the gender of the employee is " +gender);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj = new Employee(1, "Abi", "Devop",23, "Male");
		obj.displayDetails();
	}

}
