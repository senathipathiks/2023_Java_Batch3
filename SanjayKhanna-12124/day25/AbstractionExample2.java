package com.day25;

abstract class Emp{
	private int empNo;
	private String empName;
	protected double payPerDay ; 
	
	void getData(int empNO,String empName,double payPerDay) {
		this.empNo=empNO;
		this.empName=empName;
		this.payPerDay = payPerDay;
	}
	
	void display() {
		System.out.println("Employee Number : "+empNo+"\nEmployee Name : "+empName);
	}
	abstract void calculateSalary();
	
}

class Contract extends Emp{
	
	int day;
	
	void getContract(int empNo,String empName,double pay,int day) {
		super.getData(empNo, empName, pay);
		this.day = day;
	}
	
	@Override
	void calculateSalary() {
		System.out.println("Salary : "+(day*payPerDay));	
	}
}

class FullTime extends Emp{
	
	int day;
	
	void getFullTime(int empNo,String empName,double pay,int day) {
		super.getData(empNo, empName, pay);
		this.day = day;
	}
	
	@Override
	void calculateSalary() {
		System.out.println("Salary : "+(day*payPerDay));	
	}
}

public class AbstractionExample2 {

	public static void main(String[] args) {
		
		Contract con = new Contract();
		con.getContract(111, "Sanjay", 800, 31);
		con.display();
		con.calculateSalary();;
		System.out.println("\n---------------------------\n");
		FullTime full = new FullTime();
		full.getFullTime(112, "Loki", 450, 30);
		full.display();
		full.calculateSalary();;
		}

}
