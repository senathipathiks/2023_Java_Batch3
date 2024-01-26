package com.day5;

abstract class Employee1{
	int empNo;
	String empName;
	int payPerDay;
	
	void read_Emp(int empNo,String empName,int payment) {
		this.empNo=empNo;
		this.empName=empName;
		this.payPerDay=payment;
	}
	void display() {
		System.out.println("EmployeeNo:" + empNo + " EmployeeName: " + empName );
	}
	
	abstract void calculateSalary();
}

class Contract extends Employee1{
	int days;
	void read_Emp(int empNo, String empName,int payment, int days) {
		super.read_Emp(empNo, empName, payment);
		this.days=days;
		
	}
	
	void calculateSalary() {
		System.out.println("Contract TIme Salary is:"+ (days*payPerDay));
	}
}

class FullTime extends Employee1{
	int days;
	void read_Emp(int empNo, String empName,int payment,int days) {
		super.read_Emp(empNo,empName,payment);
		this.days=days;
	}
	void calculateSalary() {
		System.out.println("Full Time Salary is:" + (days*payPerDay));
	}
}

public class AbstractclassMethodEg1 {

	public static void main(String[] args) {
		
		FullTime obj1=new FullTime();
		
		obj1.read_Emp(111,"Sherin",5000,30);
		obj1.calculateSalary();
		obj1.display();
		System.out.println();
		
		Contract obj2=new Contract();
		obj2.read_Emp(122, "kaviya", 4000,31);
		obj2.calculateSalary();
		obj2.display();
		System.out.println();
		
	}

}
