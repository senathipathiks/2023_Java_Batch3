package com.java1;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Welcome to java");
       int empId;
       String empName;
       float empSalary;
       Scanner sc = new Scanner(System.in);
       System.out.println("enter emp id ,name and salary");
       empId = sc.nextInt();
       empName = sc.next();
       empSalary = sc.nextFloat();
       System.out.println("Employee id: "+ empId);
       System.out.println("Employee name: " + empName);
       System.out.println("Employee salary:" + empSalary);
       
	}
}
