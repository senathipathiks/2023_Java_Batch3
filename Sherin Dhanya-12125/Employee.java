package com.day1oops;

public class Employee {
	private int empId;
	private String empName;
	private String empGender;
	private String empLocation;
	Employee(int empId,String empName,String empGender,String empLocation){
		this.empId=empId;
		this.empName=empName;
		this.empGender=empGender;
		this.empLocation=empLocation;
	}
	void displayEmployee() {
		System.out.println("Employee Id"+"  "+empId);
		System.out.println("Employee Name"+"  "+empName);
		System.out.println("Employee Gender"+"  "+empGender);
		System.out.println("Employee Location"+"  "+empLocation);
	}

	public static void main(String[] args) {
		Employee e1=new Employee(232,"Sherin","Female","Nagercoil");
		e1.displayEmployee();

	}

}
