package com.day7;

class Employee{
	//variables
	int eId;
	String eName;
	float salary;
	
	//Constructor
	
	public Employee(int id,String name,float sal) {
		eId=id;
		eName=name;
		salary = sal;
	}
	
	//method
	void display() {
		System.out.println("---------------------------------");
		System.out.println("Employee id : "+eId);
		System.out.println("Employee Name : "+eName);
		System.out.println("Salary : "+salary+" Rs");
		System.out.println("---------------------------------");
	}
}

public class ClassObjectSample1 {

	public static void main(String[] args) {
		//object creation
		Employee emp = new Employee(12124, "SanjayKhanna", 6080.86f);
		emp.display();
	}

}
