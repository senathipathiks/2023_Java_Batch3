package com.day5;

import java.util.Scanner;

class Employee {
	int empNo;
	String empName;
	
	Employee(){
		
	}
	
	void getdata(int no, String name) {
		empNo = no;
		empName = name;
	}
	void display() {
		System.out.println("Employee Number: "+empNo);
		System.out.println("Employee Name: "+empName);
	}
}

public class ArrayofObject {

	public static void main(String[] args) {
		Employee[] emp = new Employee[10];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			emp[i] = new Employee();
			int no = sc.nextInt();
			String name = sc.next();
			emp[i].getdata(no, name);
			}
		for(int i=0; i<3; i++) {
			emp[i].display();
		}
	}

}
