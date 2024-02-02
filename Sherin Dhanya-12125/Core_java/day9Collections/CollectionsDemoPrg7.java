package com.day9Collections;

import java.util.LinkedList;
import java.util.Scanner;

class Student
{
	int id;
	String name;
	String city;
	
	public Student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
}
public class CollectionsDemoPrg7 {

	public static void main(String[] args) {
int id=0;
String name=" ";
String city=" ";
int choice;
boolean flag=false;
Scanner sc=new Scanner(System.in);
LinkedList<Student> list=new LinkedList<Student>();
String msg="";

do {
	System.out.println("1.Add Student  2.Find Student  3.Update Student  4.Delete student  5.Display all 6.Exit");
	choice=sc.nextInt();
	
	switch(choice)
	{
	case 1:
	System.out.println("Enter Student id,Student name and Student city");
	id=sc.nextInt();
	name= sc.next();
	city=sc.next();
	Student st1=new Student(id,name,city);
	list.add(st1);
	System.out.println("Student Details Inserted successfully");
	break;
	
	case 2:
		System.out.println("Enter Student id to find");
		id=sc.nextInt();
		flag=false;
		for(Student s:list) {
			if(s.id==id)
			{
				System.out.println(s.toString());
				flag=true;
				break;
			}
		}
		if(flag=false)
		{
			System.out.println("Record not found");
		}
	
		break;
		
	case 3:
		break;
	case 4:
		System.out.println("Enter Student id to delete");
		id=sc.nextInt();
		int index=0;
		flag=false;
		for(Student s:list) {
			if(s.id==id)
			{
				list.remove(index);
				flag=true;
				break;
			}
			index++;
		}
		if(flag=false)
		{
			System.out.println("Record not found");
		}
	case 5:
		break;
	case 6:
		System.out.println(choice);
	
	}
	System.out.println("Do you want to continue ? (y/n)");
	msg=sc.next();
	}
while(msg.equals("y"+ ""));
}
}
