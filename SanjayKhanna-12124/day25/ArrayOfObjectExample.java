package com.day25;

import java.util.Scanner;

class Employee{
	private int empNo;
	private String empName;
	
	void getData(int empNO,String empName) {
		this.empNo=empNO;
		this.empName=empName;
	}
	
	void display() {
		System.out.println("Employee Number : "+empNo+"\nEmployee Name : "+empName);
	}
}


public class ArrayOfObjectExample {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No of Records");
		int num = sc.nextInt();
		Employee[] employee = new Employee[num];
		for(int i=0;i<num;i++) {
			employee[i] = new Employee();
			System.out.println("Enter the Employee Number and Name : ");
			int no = sc.nextInt();
			String name = sc.next();
			employee[i].getData(no, name);
		}
		
		System.out.println("All Records");
		for(int i=0;i<num;i++) {
			System.out.println("-----------------------------");
			employee[i].display();
			System.out.println("-----------------------------");
		}
		sc.close();
	}

}
