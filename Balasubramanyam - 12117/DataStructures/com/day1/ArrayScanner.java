package com.day1;
import java.util.*;
public class ArrayScanner{

	public static void main(String[] args) {
		//System.out.println("welcom to java");
		int empId;
		String empName;
		float empSalary;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the emplee id ,name,salary:");
		empId=sc.nextInt();
		empName=sc.next();
		empSalary=sc.nextFloat();
		System.out.println("emplee id:"+ empId);
		System.out.println("emplee name:"+empName);
		System.out.println("emplee salary:"+empSalary);
		sc.close();
		

	}

}
