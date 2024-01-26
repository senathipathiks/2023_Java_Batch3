package com.day4;

class Employee{
	public Employee() {
		System.out.println("This ia Employee Class");
	}
}

class Manager extends Employee{
	public Manager() {
		System.out.println("This ia Manager Class");
	}
}

public class EmployeeManagerInheritance {

	public static void main(String[] args) {
		Employee emp=new Manager(); // Upcasting
		
		Manager man=(Manager)emp; //Downcasting
	}

}
