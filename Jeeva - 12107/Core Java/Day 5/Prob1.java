package com.coreDay5;

import java.util.Scanner;

public class Prob1 {
	
	public static void main(String[] args) {
		// 
		
		Employee[] emp = new Employee[10];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<3; i++) {
			emp[i] = new Employee();
			
			System.out.println("Enter the Employee ID :");
			int n = sc.nextInt();
			System.out.println("Enter the Employee Name :");
			String fn = sc.next();
			emp[i].getdata(n, fn);
		}
		
		for(int i = 0; i<3; i++) {
			emp[i].display();
		}
		
	}

}

class Employee {
	
	int eNo;
	String name;
	
	Employee() {
	
	}
	
	
	void getdata(int no, String nam) {
		eNo = no;
		name = nam;
	}
	
	void display() {
		System.out.println("No: " + eNo);
		System.out.println("Name: " + name );
	}
}

