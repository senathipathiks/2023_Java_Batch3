package com.oops.day1;

//Object class

class Employee{
	//Variables
	int eId;
	String eName;
	float salary;
	
	public Employee() {
		//Load instruction
		
	}

	//Constructor
	Employee(int eId,String eName,float salary){
		this.eId=eId;
		this.eName=eName;
		this.salary=salary;
	
	}
	
	//Methods
	void display() {
		System.out.println("Employee id : "+eId);
		System.out.println("Employee Name : "+eName);
		System.out.println("Employee Salary : "+salary);
	
	}
	
}

//Main Class

public class Class1 {

	public static void main(String[] args) {
		//object Creation
		Employee emp=new Employee(12122,"Sathya",14800);
		emp.display();

	}

}
