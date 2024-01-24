package com.javacoreday4;

class Employee {
	String EId="1245";
	String Ename="Dharshsun";
	String Role = "Analyst";

}
class Manager extends Employee{
	String MId= "6575";
	String Mname= "Naveen";
	int age = 30;
}

public class TaskEmployee {
	public static void main(String[] args) {
		System.out.println("****Employee****");
		Employee obj = new Employee();
		System.out.println("Employee ID: "+obj.EId);
		
		Employee obj1 = new Manager();
		System.out.println("Employee Name: "+obj1.Ename);
		System.out.println("Employee Role: "+obj1.Role);
		System.out.println("***Manager***");
		
		Manager obj2 = new Manager();
		System.out.println("Manager Name: "+obj2.Mname);
		System.out.println("Manager ID: "+obj2.MId);
		System.out.println("Manager Age: "+obj2.age);
		
       
       
	}

}
