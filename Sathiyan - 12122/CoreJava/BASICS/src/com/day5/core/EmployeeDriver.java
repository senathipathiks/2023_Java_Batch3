package com.day5.core;

abstract class Employee1{
	int eno;
	String name;
	int payperday;
	
	void readEmp(int eno,String name,int pay) {
		this.eno=eno;
		this.name=name;
		payperday=pay;
		
	}
	
	void display() {
		System.out.println("Employee no : "+eno+"Name : "+name);
	}
	
	abstract void calculatesalary();
}

class Contract extends Employee1{
	int days;
	
	void read_contract(int eno,String name,int pay,int days) {
		super.readEmp(eno,name,pay);
		this.days=days;
	}
	
	void calculatesalary() {
		System.out.println("Salary is : "+(days*payperday));
	}
}

class FullTime extends Employee1{
	int days;
	void read_fullTime(int eno,String name,int pay,int days) {
		super.readEmp(eno,name,pay);
		this.days=days;
	}
	
	void calculatesalary() {
		System.out.println("Salary is : "+(days*payperday));
	}
}

public class EmployeeDriver {

	public static void main(String[] args) {
		FullTime obj1=new FullTime();
		obj1.read_fullTime(123, "Sathya", 10000, 30);
		obj1.calculatesalary();
		
		Contract obj2=new Contract();
		obj2.read_contract(145, "Deepika", 12000, 40);
		obj2.calculatesalary();

	}

}
