package com.day24;

class Employee{
	public Employee() {
		System.out.println("This is Employee class");
	}
}

class Manager extends Employee{
	public Manager() {
		System.out.println("This is Manager class");
	}
}

public class EmployeeMainClass {

	public static void main(String[] args) {
		Employee obj = new Manager(); // UpCasting
		
		@SuppressWarnings("unused")
		Manager obj1 = (Manager) obj; //DownCasting
	}

}
