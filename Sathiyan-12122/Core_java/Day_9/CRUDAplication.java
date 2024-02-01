package com.Day_9;

import java.util.*;

class Student {
	int id;
	String name;
	String city;
	
	public Student(int id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Student [id = "+id +", name = "+name +", City = "+city;
	}
}

public class CRUDAplication {

	public static void main(String[] args) {
		
		int id=0;
		String name=" ";
		String city=" ";
		int choice;
		boolean flag=true;
		
		Scanner sc=new Scanner(System.in);
		LinkedList<Student> list=new LinkedList<Student>();
		String msg=" ";
		
		do {
			System.out.println("1.Add Student  2.Find Student  3.Update Student  4.Delete student  5.View All  6.Exit");
			choice=sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("Enter Student id, Studet Name and Student city");
				id=sc.nextInt();
				name=sc.next();
				city=sc.next();
				
				Student st1=new Student(id, name, city);
				list.add(st1);
				
				System.out.println("Values entered Successfully");
				break;
				
			case 2:
				System.out.println("Enter the Student ID to find");
				id=sc.nextInt();
				int val=0;
				for (Student s : list) {
					if (s.id==id) {
						System.out.println(s.toString());
						val++;
						break;
					}
				}
				if (val==0) {
					System.out.println("Record Not found");
				}
				break;
				
			case 3:
				System.out.println("Eter the student ID you want to Update");
				id=sc.nextInt();
				int input=0;
				for (Student s : list) {
					if (s.id==id) {
						System.out.println("Enter the name and City you want to update");
												
						input++;
					}
				}
				if (input!=0) {
					System.out.println("Updated Successfully");
				}
				break;
				
			case 4:
				System.out.println("Enter the student id to Delete");
				id=sc.nextInt();
				int index=0;
				int value=0;
				
				for (Student s : list) {
					if (s.id==id) {
						list.remove(index);
						value++;
						break;
					}
					index++;
				}
				if (value==0) {
					System.out.println("Record Not Found");
				}
				break;
				
			case 5:
				for (Student student : list) {
					System.out.println(student);
				}
				
				break;
				
			case 6:
				System.out.println("Exit");
				flag=false;
				break;				
			default:
				System.out.println("Invalid input");
				break;
			}
			
		} while (flag);
	}

}
