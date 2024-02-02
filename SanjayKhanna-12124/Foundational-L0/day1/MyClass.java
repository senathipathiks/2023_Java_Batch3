package com.day1;
import java.util.Scanner;
public class MyClass {

	public static void main(String[] args) {
//		System.out.println("Welcome to Java");
		int empId;
		String empName;
		float empSalary;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee id,name,salary");
		empId=sc.nextInt();
		empName=sc.next();
		empSalary=sc.nextFloat();
		System.out.println("Employee ID : "+empId);
		System.out.println("Employee Name : "+empName);
		System.out.println("Employee Salary : "+empSalary);
		sc.close();

	}

}
