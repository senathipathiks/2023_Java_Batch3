package com.day9.collectionapi;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Student{
	
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
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	

}



public class CollectionsCrud {

	public static void main(String[] args) {
		
		int id=0;
		String name="";
	    String city="";
	    int choice;
	    boolean flag = false;
	    
		
		Scanner sc = new Scanner(System.in);
		
		List<Student>list = new LinkedList<>();
		
		String msg="";		
		
		do {
			
			System.out.println("1.Add Student \n2.Find Student \n3.Update Student \n4.Delete Student"
					+ "\n5.Display All \n6.Exit");
			
			choice = sc.nextInt();
			
			switch (choice) {
			
		
			case 1:{
				
				System.out.println("Enter Student Id, Student Name and Student City");
				
				id=sc.nextInt();
				sc.nextLine();
				name=sc.nextLine();
				
				city=sc.nextLine();
				
				Student s1 = new Student(id,name,city);
				
				list.add(s1);
				
				System.out.println("Student Details Inserted Successfully !!!");
				
			}
				
				break;
				
			case 2:{
				
				System.out.println("Enter the Student id :");
				
				id=sc.nextInt();
				
				flag = false;
				
				for (Student s: list) {
					
					if(s.id==id) {
						
						System.out.println(s.toString());
						flag=true;
						break;
					}
					
				}
				
				if(flag=false) {
					System.out.println("Record Not Found");
				}
				
				
				
			}
			break;
			
			case 3 :{
				
				System.out.println("Enter the Student id , Name and City");
				
				
				id=sc.nextInt();
				sc.nextLine();
				name = sc.nextLine();
				
				city = sc.nextLine();
				flag=false;
				
				int index=0;
				
				for (Student s: list) {
					if(s.id==id) {
						
						Student s1 = new Student(id,name,city);
						
						list.set(index, s1);
						flag=true;
						
						System.out.println("Record Update Successfully");
						break;
						
					}
					index++;
				}
				
				if(flag=false) {
					
					System.out.println("Record Not Found");
				}
				
			}
			break;
			case 4:{
				
				System.out.println("Enter the student id to delete :");
				id=sc.nextInt();
				int index=0;
				flag=false;
				for (Student s : list) {
					
					if(s.id==id) {
						
						list.remove(index);
						flag=true;
						
						System.out.println("Delete the Record Successfully");
						break;
					}
					index++;
				}
				
				if(flag=false) {
					
					System.out.println("Record Not Found");
				}
				
				
			}
			break;
			
			case 5 :{
				
				for (Student s: list) {
					
					System.out.println(s +" ");
					
				}
				
				break;
			}
			
			case 6:{
				System.exit(0);
				
				break;
			}

			default:
				break;
			}
			
             System.out.println("Do you wish to continue the App ?? yes or no");
			
			msg = sc.next();
			
			
		}while(msg.equals("yes"));
		
		
		

	}

}
