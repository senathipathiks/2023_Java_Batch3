package com.day11;

abstract class Employee{
	public Employee(int a) {
		System.out.println("This is Employee class constructor "+a);
	}
	
	double salary = 0;
	abstract double calSalary(double salary);
}

class Manager extends Employee{

	public Manager() {
		super(0);
		System.out.println("This is Manager class constructor");
	}
	
	double calSalary(double salary) {
		
		return salary;
	}
	
}
public class AbstractClassSample3 {

	public static void main(String[] args) {
		Employee sanjay = new Manager();
		System.out.println("Sanjay's salary : "+sanjay.calSalary(14999)+"Rs");
	}

}
