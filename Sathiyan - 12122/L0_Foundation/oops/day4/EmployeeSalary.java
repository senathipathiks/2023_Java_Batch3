package com.oops.day4;

import java.util.Scanner;

class Employee{
	double calculateSalary() {
		System.out.println("Every employee has having a Salary");
		return 0;
	}
}

class Manager extends Employee{
	@SuppressWarnings("resource")
	double calculateSalary() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the monthly salary of manager to know the annual salary: ");
		double sal=sc.nextDouble();
		sal=sal*12;
		return sal;
	}
	
}

class Programmer extends Employee{
	@SuppressWarnings("resource")
	double calculateSalary() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the monthly salary of Programmer to know the annual salary: ");
		double sal=sc.nextDouble();
		sal=sal*12;
		return sal;
	}
}


public class EmployeeSalary {

	public static void main(String[] args) {
		Programmer ref=new Programmer();
		Manager ref2=new Manager();
		System.out.println("Annual Salary of Programmer is :"+ref.calculateSalary()+" LPA");
		System.out.println("Annual Salary of Manager is :"+ref2.calculateSalary()+" LPA");
		
	}

}
