package com.oops.day5;

abstract class Employeee{
	abstract void calculateSalary();
	abstract void displayInfo();
}

class Manager extends Employeee{
	
	String name="Sathya";
	double salary=25000;
	double lpa=salary*12;
	
	void calculateSalary() {
		System.out.println("Manager monthly salary is : "+salary+" and LPA of "+lpa);
	}
	
	void displayInfo() {
		System.out.println("The role of the employee is Manager");
		System.out.println("Manager monthly salary is "+salary);
		System.out.println("Name of the employee is "+name);
		
	}
}

class Programmer extends Employeee{
	
	String name="Tamizh";
	double salary=30000;
	double lpa=salary*12;
	
	void calculateSalary() {
		System.out.println("Manager monthly salary is : "+salary+" and LPA of "+lpa);
	}
	
	void displayInfo() {
		System.out.println("The role of the employee is Programmer");
		System.out.println("Manager monthly salary is "+salary);
		System.out.println("Name of the employee is "+name);
	}

}

public class Employee {

	public static void main(String[] args) {
		
		Employeee e1=new Manager();
		Employeee e2=new Programmer();
		
		e1.calculateSalary();
		e1.displayInfo();
		
		System.out.println("*********************************");
		
		e2.calculateSalary();
		e2.displayInfo();
	}

}
