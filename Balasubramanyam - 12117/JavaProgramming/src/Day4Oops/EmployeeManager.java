package com.Day4Oops;
class Employee{
	Employee(){
		System.out.println("Employee");
	}
}
class Manager extends Employee{
	Manager(){
		System.out.println("Manager");
	}
}
public class EmployeeManager {

	public static void main(String[] args) {
		Manager m = new Manager();

	}

}
