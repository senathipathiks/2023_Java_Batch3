package com.day11;

abstract class Employees{
	abstract void calSalary(double salary);
	abstract void displayInfo();
}
class Managers extends Employees{
	void calSalary(double salary) {
		System.out.println("Salary : "+salary+"Rs");
	}
	void displayInfo() {
		System.out.println("Designation as a Manager");
	}
}

class Programmer extends Employees{
	void calSalary(double salary) {
		System.out.println("Salary : "+salary+"Rs");
	}
	void displayInfo() {
		System.out.println("Designation as a Programmer");
	}
}

public class AbstractEmployeeClass {

	public static void main(String[] args) {
	Employees manager = new Managers();
	manager.displayInfo();
	manager.calSalary(150000);
	System.out.println("--------------------------------------");
	Employees programmer = new Programmer();
	programmer.displayInfo();
	programmer.calSalary(100000);
	System.out.println("--------------------------------------");

	}

}
