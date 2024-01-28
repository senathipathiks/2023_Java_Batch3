package com.day5;
import java.util.Scanner;
class Employee{
	int eNo;
	String name;
	void getdata(int no,String nam) {
		eNo=no;
		name=nam;
	}
	void display()
	{
		System.out.println("No:"+eNo);
		System.out.println("Name:"+name);
	}
}
public class ArrayOfObject {

	public static void main(String[] args) {
	Employee[] emp=new Employee[10];
	int i;
	Scanner sc =new Scanner(System.in);
	for(i=0;i<3;i++)
	{
		emp[i]=new Employee();
		int n=sc.nextInt();
		String fn=sc.next();
		emp[i].getdata(n, fn);
	}
	for(i=0;i<3;i++) {
		emp[i].display();
	}

	}

}
