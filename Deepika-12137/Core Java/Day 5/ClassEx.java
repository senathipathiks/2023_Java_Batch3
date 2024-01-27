package com.day5;

import java.util.Scanner;
class Employee{
	int eNo;
	String name;
	
	Employee(){
		
		
	}
	Employee(int no,String nam){
		eNo=no;
		name=nam;
	}
	
	void getdata(int no,String nam) {
		eNo=no;
		name=nam;
	}
	
	void display() {
		System.out.println("No :" +eNo);
		System.out.println("Name :" +name);
	}
}
public class ClassEx {
public static void main(String[] args) {
	Employee [] emp= new Employee[10];
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<2;i++) {
		emp[i]=new Employee();
		int n=sc.nextInt();
		String fn=sc.next();
		emp[i].getdata(n,fn);
	}
	for(int i=0;i<2;i++) {
		emp[i].display();
	}
}
}
