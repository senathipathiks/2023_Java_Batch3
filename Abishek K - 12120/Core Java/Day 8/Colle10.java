package com.day8;

import java.util.LinkedList;
import java.util.Scanner;

class Student{
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

public class Colle10 {

	public static void main(String[] args) {
		
		int id=0;
		String name=" ";
		String city=" ";
		int choice;
		boolean flag=false;
		
		Scanner sc = new Scanner(System.in);
		
		LinkedList<Student> list = new LinkedList<Student>();
		String msg= " ";
		
		do {
			System.out.println("1.Add Student 2.Find Student 3.Update Student 4.Delete Student 5.View Student 6.Exit");
			choice=sc.nextInt();
			
			switch(choice) {
			
			case 1:
				System.out.println("Enter Student ID, Student Name and Student City");
				
				id=sc.nextInt();
				name=sc.next();
				city=sc.next();
				Student st1= new Student(id, name, city);
				list.add(st1);
				
				System.out.println("Student Details Inserted Successfully");
				break;
				
			case 2:
				System.out.println("Enter Student ID to find");
				
				id=sc.nextInt();
				flag=false;
				
				for(Student s : list) {
					if(s.id==id) {
						System.out.print(s.toString());
						flag=true;
						break;
					}
					
			}
				if(flag=false) {
					System.out.println("Record Not Found");
				}
				break;
			
			
			case 3:
				System.out.println("Enter the Student ID to update");
				id=sc.nextInt();
				int indx=0;
				flag= false;
				System.out.println("Enter Student Name");
				name=sc.next();
				System.out.println("Enter Student City");
				city=sc.next();
				
				for(Student s : list) {
					if(id==s.id) {
						Student st2 = new Student(id, name, city);
						list.set(indx, st2);
						System.out.println("Update Successfully");
						flag=true;
						break;
					}
					indx++;
				}
				if(flag==false) {
					System.out.println("Record not found");
				}
				break;
				
			case 4:
				System.out.println("Enter Student ID to delete");
				id=sc.nextInt();
				int index=0;
				flag=false;
				
				for(Student s: list) {
					if(s.id==id) {
						list.remove(index);
						flag=true;
						break;
					}
					index++;
				}
				if(flag=false) {
					System.out.println("Record Not Found");
				}
				break;
				
			case 5:
				System.out.println("To Display the Data in the List");
				
				for(Student i : list) {
					System.out.println(i);
				}
				
				
		
		
			}
			System.out.println("Do you want to continue yes/no");
			msg=sc.next();
	}
		
	while(msg.equals("yes"));
		
		
	

}
}
