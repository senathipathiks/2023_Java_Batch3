package com.day1;
class Employee{
//	variables
	int id;
	String name;
	float salary;
//	constructor
	Employee(int i,String n,float s){
		id=i;
		name =n;
		salary=s;
	}
//	method
	void display() {
		System.out.println("\nEmployee id: "+id);
		System.out.println("Employee name: "+name);
		System.out.println("Employee salary: "+salary);
	}
}
public class ObjectAndClass {
    
	public static void main(String[] args) {
		Employee balu = new Employee(101,"Bala",5000.0f);
		Employee loki = new Employee(102,"Lokesh",7000.0f);
		balu.display();
		loki.display();

	}

}
