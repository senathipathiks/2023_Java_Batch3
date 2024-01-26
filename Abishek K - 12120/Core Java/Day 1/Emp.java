package com.day1;

class Employee{
	int empID;
	String name;
	String domain;
	String role;
	String gender;
	int age;
	Employee(int empID,String name,String domain,String role,String gender){
		this.empID=empID;
		this.name=name;
		this.domain=domain;
		this.role=role;
		this.gender=gender;
		
	}
	
	void display() {
		System.out.println("Employee ID: " + empID);
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Domain: " + domain);
		System.out.println("Employee Role: " + role);
		System.out.println("Employee Gender: " + gender);
	}
}

class Book{
	int bookID;
	String bName;
	String bAuthor;
	int bPrice;
	Book(int bookID,String bName,String bAuthor, int bPrice){
		this.bookID=bookID;
		this.bName=bName;
		this.bAuthor=bAuthor;
		this.bPrice=bPrice;
	}
	
	void display1 () {
		System.out.println("Book ID: "+ bookID);
		System.out.println("Book Name: "+ bName);
		System.out.println("Book Author: "+ bAuthor);
		System.out.println("Book Price: "+ bPrice);
	}
}

public class Emp {

	public static void main(String[] args) {
	Employee obj = new Employee(12120, "Abishek K","Java","Developer", "Male");
	obj.display();
	Book obj1 = new Book(45,"Agni Siragugal", "Abdul Kalam", 1200);
	obj1.display1();

	}

}
