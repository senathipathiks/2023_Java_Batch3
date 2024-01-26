package com.day5;
import java.util.Scanner;

class Employee{
	int eNo;
	String name;
	
	void getdata(int no,String name) {
		this.eNo=no;
		this.name=name;
	}
	
	void display() {
		System.out.println("Employee No:"+ eNo);
		System.out.println("Employee Name:"+ name);
		
	}
}

public class ArrayObject {

	public static void main(String[] args) {
		Employee[] emp=new Employee[10];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			
			emp[i]=new Employee();
			System.out.println("Enter the value:");
			int n=sc.nextInt();
			System.out.println("Enter the Name::");
			String fn=sc.next();
			emp[i].getdata(n, fn);
		}
		
		for(int i=0;i<3;i++) {
			emp[i].display();
		}
		
		

	}

}
