package com.day5;

abstract class Employee1{
	int empno;
	String name;
	int pay;
	
	void read_emp(int empno, String name, int ppd) {
		this.empno = empno;
		this.name = name;
		pay = ppd;
		
	}
	void display() {
		System.out.println("Employee Number: "+empno);
		System.out.println("Employee Name: "+name);
	}
}

class Contract extends Employee1{
	int days;
	void read_con(int empno, String name, int pay, int days) {
		super.read_emp(empno, name, pay);
		this.days = days;
	}
	void calsal() {
		System.out.println("Salary: "+(days*pay));
	}
}
class Fulltime extends Employee1{
	int days;
	void read_full(int empno, String name, int pay, int days) {
		super.read_emp(empno, name, pay);
		this.days = days;
	}
	void calsal() {
		System.out.println("Salary: "+(days*pay));
	}
}

public class AbstratctEx2 {

	public static void main(String[] args) {
		Contract emp1 = new Contract();
		emp1.read_con(123, "John", 1700, 30);
		emp1.display();
		emp1.calsal();
	}

}
