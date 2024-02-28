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
	
	Student(String name, String city){
		this.name=name;
		this.city=city;
	}
	
	@Override
	public String toString() {
		return "Student [ id = "+id +", name = "+name +", City = "+city+ " ]";
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
				try {
					System.out.println("Enter the student Index you want to Update");
					int input=sc.nextInt();
					
					for (Student s : list) {
						if (s.id==id) {
							System.out.println("What you want to update \n1.Name\n2.City");
							int userInput=sc.nextInt();
							switch (userInput) {
							case 1:
								System.out.println("Enter nameyou want to update");
								name=sc.next();
								
								Student st2=new Student(id, name, city);
								list.set(input, st2);						
								input++;
								break;
							
							case 2:
								System.out.println("Enter City you want to update");
								city=sc.next();
								
								Student st3=new Student(id, name, city);
								list.set(input, st3);						
								input++;
								break;

							default:
								System.out.println("Invalid entry");
								break;
							}
//							System.out.println("Enter name and City you want to update");
//							name=sc.next();
//							city=sc.next();
//							
//							Student st2=new Student(id, name, city);
//							list.set(input, st2);						
//							input++;
//							break;
						}
					}
					if (input!=0) {
						System.out.println("Updated Successfully");
					}else {
						System.out.println("Value not updated");
					}
					break;
					
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Value not Updated "+ e);
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
