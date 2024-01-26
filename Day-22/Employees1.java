package com.Day4;

abstract class Emp{
	
	int eno;
	String name;
	int payperday;
	void red_Emp (int eno,String name,int pay) {
		
		this.eno=eno;
		this.name=name;
		this.payperday=pay;
		
	}
	
	void display() {
		System.out.println("Emp No :"+eno+" "+"Employee Name :"+name);
	}
	
	abstract void calculateSalary();
}

class Contract extends Emp{

	
	int days;
	
	void red_Contract(int eno , String name, int pay, int days) {
		super.red_Emp(eno, name, pay);
		
		this.days=days;
	}
	@Override
	void calculateSalary() {
		
		System.out.println("Salary is :"+(days* payperday));
		
	}
	
}

class FullTime extends Emp{
	
	int days;
	
	void red_FullTime(int eno , String name , int pay, int days) {
		
		super.red_Emp(eno, name, pay);
		this.days=days;
	}

	@Override
	void calculateSalary() {
		
		System.out.println("Salary is :"+(days*payperday));
	}
	
}

public class Employees1 {

	public static void main(String[] args) {
	
		FullTime f = new FullTime();
		f.red_FullTime(123, "Jeeva",1000, 30);
		f.calculateSalary();
		
		Contract c = new Contract();
		c.red_Contract(121, "Surya", 1000, 30);
		c.calculateSalary();
		

	}

}
