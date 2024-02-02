package com.day10;

class Employee{
	double calSalary(double salary) {
		return salary;
		}
	}

class Manager extends Employee{
	double calSalary(double salary) {
		return salary;
		
		}
	}

class Programmer extends Employee{
	double calSalary(double salary) {
		return salary;
		
		}
	}

public class MainClass4 {

	public static void main(String[] args) {
		Employee manager = new Manager();
		System.out.println("Manager Salary : "+manager.calSalary(150000)+"Rs");
		
		Employee programmer = new Manager();
		System.out.println("Programmer Salary : "+programmer.calSalary(100000)+"Rs");

	}

}
