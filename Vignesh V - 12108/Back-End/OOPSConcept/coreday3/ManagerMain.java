package com.coreday3;

class Employee {
	String EId = "12108";
	String Ename = "vignesh";
	String Role = "Developer";

}

class Manager extends Employee {
	String MId = "10";
	String Mname = "vicky";
	int age = 24;
}

public class ManagerMain {
	public static void main(String[] args) {
		System.out.println("****Employee****");
		Employee obj = new Employee();
		System.out.println("Employee ID: " + obj.EId);

		Employee obj1 = new Manager();
		System.out.println("Employee Name: " + obj1.Ename);
		System.out.println("Employee Role: " + obj1.Role);
		System.out.println("***Manager***");

		Manager obj2 = new Manager();
		System.out.println("Manager Name: " + obj2.Mname);
		System.out.println("Manager ID: " + obj2.MId);
		System.out.println("Manager Age: " + obj2.age);

	}

}
