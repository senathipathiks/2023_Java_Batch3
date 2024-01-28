package com.coreday4;

abstract class Employee1 {
	int eno;
	String name;
	int payperday;

	void read_Emp(int eno, String name, int pay) {

		this.eno = eno;
		this.name = name;
		payperday = pay;
	}

	void display() {
		System.out.println("Employee No:" + eno + " " + "Employee Name:" + name);
	}

	abstract void calculateSalary();
}

class Contract extends Employee1 {

	int days;

	void get_contract(int eNo, String Name, int pay, int days) {
		super.read_Emp(eNo, Name, pay);
		this.days = days;

	}

	void calculateSalary() {
		System.out.println("salary based on contract:" +(days*payperday));
	}

}

class FullTime extends Employee1 {
	int days;

	void read_Fulltime(int eno, String name, int pay, int days) {
		super.read_Emp(eno, name, pay);
		this.days = days;
	}

	void calculateSalary() {
		System.out.println("Salary is :" + (days * payperday));
	}
}

public class AbstractExamples2 {

	public static void main(String[] args) {

		FullTime obj1 = new FullTime();
		obj1.read_Fulltime(123, "vicky", 1000, 30);
		obj1.calculateSalary();

		Contract obj2 = new Contract();
		obj2.get_contract(124, "loki", 2220, 30);
		obj2.calculateSalary();

	}

}
