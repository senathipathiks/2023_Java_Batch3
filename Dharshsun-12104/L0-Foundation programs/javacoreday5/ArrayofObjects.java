package com.javacoreday5;

import java.util.Scanner;

class Employee{
	int eNo;
	String name;
	void getdata(int no,String nam) {
		eNo=no;
		name=nam;
	}
	void display() {
		System.out.println("No:"+eNo);
		System.out.println("Name:"+name);
	}
}

public class ArrayofObjects {
	public static void main(String args[]) {
		Employee[] emp = new Employee[3];
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			emp[i]=new Employee(); //initialize the object
			System.out.println("Enter the employee number");
			int n=sc.nextInt();
			System.out.println("Enter the employee name");
			String fn=sc.next();
			emp[i].getdata(n,fn); //object type
			
		}
		for(int i=0;i<3;i++) {
			emp[i].display();
		}
	}
}
