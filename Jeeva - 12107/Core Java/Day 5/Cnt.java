package com.coreDay5;

public class Cnt{

	public static void main(String[] args) {
		
		FullTime f = new FullTime();
		f.read_Fulltime(123, "Vignesh", 1000, 30);
		f.calculateSalary();
		
		
		Contract c = new Contract();
		
		c.read_Contract(123, "Vignesh", 1000, 30);
		c.calculateSalary();
	}

}

abstract class Employee1{
	int eno;
	String name;
	int payperday;
	
	void read_Emp(int eno, String name, int pay) {
		this.eno = eno;
		this.name = name;
		this.payperday = pay;
	}
	
	void display() {
		System.out.println("Employee No : " + eno + "Employee Name : " + name);
	}
	
	abstract void calculateSalary();
}

class Contract extends Employee1{
	int days;
	
	void read_Contract(int eno, String name, int pay, int days) {
		super.read_Emp(eno, name, pay);
		this.days = days;
	}
	
	void calculateSalary() {
		System.out.println("Salary is " + (days * payperday));
	}
}

class FullTime extends Employee1{
	
	int days;
	void read_Fulltime(int eno, String name, int pay, int days) {
		super.read_Emp(eno, name, pay);
		this.days = days;
		
	}
	
	void calculateSalary() {
		System.out.println("Salary is " + (days * payperday));
	}
}
