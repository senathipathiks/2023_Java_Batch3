package com.day1;

import java.util.*;
public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int empId;
		String name;
		float salary;
		
		System.out.println("Enter the ID,Name,Salary");
		Scanner sc=new Scanner(System.in);
		
		empId=sc.nextInt();
		name=sc.next();
		salary=sc.nextFloat();
		
		System.out.println("Employee Id : " +empId);
		System.out.println("Employee Name : " +name);
		System.out.println("Employee Salary : " +salary);
		sc.close();
	}

}
