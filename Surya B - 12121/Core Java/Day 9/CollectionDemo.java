package com.coreDay9;

import java.util.LinkedList;
import java.util.Scanner;

public class CollectionDemo {

	public static void main(String[] args) {
		// 
		
		int id = 0;
		String name = " ";
		String city = " ";
		int choice;
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		LinkedList<Student> list = new LinkedList<Student>();
		String msg = " ";
		
		do {
			System.out.println("1.Add Student \n2.Find Student \n3.Update Statement \n4.Delete Statement \n5.View All \n6.Exit");
			choice = sc.nextInt();
			
			switch(choice) 
			{
			case 1:
				System.out.println("Enter Student id, Student Name and Student City");
				id = sc.nextInt();
				
				sc.nextLine();
				
				name = sc.next();
				city = sc.next();
				Student st1 = new Student(id, name, city);
				list.add(st1);
				
				System.out.println("Student Details Inserted Successfully");
				break;
			
			case 2 :
				System.out.println("Enter Student ID to find");
				id = sc.nextInt();
				flag = false;
				for(Student s:list) {
					if(s.id == id)
					{
						System.out.println(s.toString());
						flag = true;
						break;
					}
				}
			case 3 : 
				System.out.println("Enter Student ID to Update ");
				id = sc.nextInt();
				
				 flag = false;
				
				int indexi = 0;
				
				for(Student s:list) {
					if(s.id == id)
					{
						System.out.println("Enter the name to Update");
						String uname = sc.next();
						String ucity = sc.next();
//						name = s.name;
						city = s.city;
						flag = true;
						System.out.println("Details Updated Successfully");
						;break;
					}
					indexi++;
					if(flag = false)
					{
						
					}
						System.out.println("Record not Found");
					}
					break;
			
			case 4 :
				System.out.println("Enter Student id to delete");
				id = sc.nextInt();
				int index = 0;
				flag = false;
				for(Student s:list) {
					if(s.id == id)
					{
						list.remove(index);
						flag = true;
						break;
					}
					index++;
					
				}
				if(flag = false)
				{
					System.out.println("Record not Found");
				}
				break;
			case 5 : 
				break;
			case 6 :
				System.exit(0);
			}
			System.out.println("Do you wish to continue (Yes/No)");
			msg = sc.next();
		}
		while(msg.equals("yes"));

	}

}

class Student{
	int id;
	String name;
	String city;
	
	public Student(int id, String name, String city)
	{
		this.id = id;
		this.name = name;
		this.city = city;
		
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	

}