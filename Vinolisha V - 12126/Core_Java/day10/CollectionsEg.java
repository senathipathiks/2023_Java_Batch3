package com.day10;
import java.util.Iterator;
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
public class CollectionsEg {
	
	public static void main(String[] args) {
		
		int id=0;
		String name;
		String city;
		int choice;
		boolean flag=false;
		String msg;
		
		Scanner sc=new Scanner(System.in);
		LinkedList<Student> list=new LinkedList<Student>();
		
	do {
		System.out.println("1.Add Student 2.Find Student 3.Update Student 4.Delete Student 5.FindAll 6.Exit");
		choice=sc.nextInt();
		
		switch(choice) {
		 
		case 1:
			System.out.println("Enter Student id, Student Name and Student City");
			id=sc.nextInt();
			name=sc.next();
			city=sc.next();
			Student st1=new Student(id,name,city);
			list.add(st1);
			
			System.out.println("Student Details Inserted Successfully");
			break;
			
		case 2:
			System.out.println("Enter Student id to Find Student details ");
			
			id=sc.nextInt();
			flag=false;
			
			for (Student student : list) {
				if (student.id==id) {
					System.out.println(student.toString());
					flag=true;
					break;
				}
			}
			if(flag=false) {
				System.out.println("Record Not Found");
			}
				
					
		case 3:
			System.out.println("Enter the Sudent id to update the details");
			
			id=sc.nextInt();
			
			System.out.println("Enter student name to update");
			name=sc.next();
			
			System.out.println("Enter student city name to update:");
			city=sc.next();
			Student std2=new Student(id,name,city);
			int index=0;
			flag=false;
			for (Student student : list) {
				if(student.id==id) {
					list.set(index, std2);
					flag=true;
					System.out.println("Updated successfully");
					break;
				}index++;
				if(flag=false) {
					System.out.println("Record not found");
					
				}
			}
			
			
			break;
			
		case 4:
			System.out.println("Enter student id to delete");
			id=sc.nextInt();
			int index1=0;
			flag=false;
		    for (Student student : list) {
				if(student.id==id) {
					list.remove(index1);
					flag=true;
					break;
				}
					index1++;
				}
			    
			    if(flag=false) {
			    	System.out.println("Record not found");
			    }
			    
			    break;
			    
		case 5:
			System.out.println("Enter student id to display all the details");
			id=sc.nextInt();
			for (Student student : list) {
				System.out.println(student.toString());
			}
			break;
			
		case 6:
			System.exit(0);
			break;
		}	
		
		System.out.println("Do you want to continue(Yes/No)");
		msg=sc.next();
	}
	while(msg.equals("yes"));
		if(msg.equals("no"));
		System.out.println("ThankYou.....");
	}
	}

	

	

	


