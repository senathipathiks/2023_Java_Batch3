package com.coreday1;

public class Employee {
	private int empID;
	private String empName;
	private String dept;
	private int DOJ;
	
	Employee(int empID,String empName,String dept,int DOJ){
		this.empID=empID;
		this.empName=empName;
		this.dept=dept;
		this.DOJ=DOJ;
	}
	void displayEmployee(){
		System.out.println("Employee ID:"+empID);
		System.out.println("Employee name:"+empName);
		System.out.println("Employee department:"+dept);
		System.out.println("Employee DOJ:"+DOJ);
	}
	public static void main(String args[]) {
		Employee e1 = new Employee(1198,"Dharshsun","Development",18/10/23);
		e1.displayEmployee();
	}
	

}
