package com.oops1;

class Employee{
	int eid;
	String ename;
	float esalary;
	//Constructor
	Employee(int id,String name,float salary){
		eid = id;
		ename = name;
		esalary = salary; 
	}
	
	void display() {
		System.out.println("Employee id : " +eid);
		System.out.println("employee name: " + ename);
		System.out.println("employee salary: " +esalary);
	}
}

public class DemoOops {
	public static void main(String args[]) {
		// object creation
		Employee dharshsun = new Employee(101,"Dharshsun",2000);
		dharshsun.display();
		
		Employee chandru = new Employee(102,"Chandru",3000);
		chandru.display();
	}

}
