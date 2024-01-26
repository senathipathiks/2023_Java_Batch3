package com.javacoreday5;

abstract class Employee1{
	int eNo;
	String name;
	int payperday;

void emp_read(int eno,String name,int pay) {
	this.eNo=eno;
	this.name=name;
	payperday=pay;
	
}
void display() {
	System.out.println("employee no:"+eNo+ " "+"Employee name:"+name);
}
abstract void calculateSalary();
}
class Contract extends Employee1{
	int days;
	void read_contact(int eno,String name,int pay,int days) {
		super.emp_read(eno, name, pay);
		this.days=days;
	}
	void calculateSalary() {
		System.out.println("salary is:"+(days*payperday));
	}
}
 class FullTime extends Employee1{
	int days;
	void read_FullTime(int eno,String name,int pay,int days) {
		super.emp_read(eno, name, pay);
		this.days=days;
}
	void calculateSalary() {
		System.out.println("salary is:"+(days*payperday));
	}
 }
public class AbstractEmployee {
	public static void main(String[] args) {
		FullTime obj1=new FullTime();
		obj1.read_FullTime(123, "Dharshsun", 500, 30);
		obj1.calculateSalary();
		obj1.display();
		
		Contract obj2=new Contract();
		obj2.read_contact(123, "Dharshsun", 500, 30);
	}
}
	

