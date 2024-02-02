package com.day8adv;

import java.util.LinkedList;
import java.util.Scanner;

class Student 
{
	int id;
	String name;
	String city;
	
	public Student(int id, String name, String city)
	{
		this.id=id;
		this.name=name;
		this.city=city;
		
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	
}
public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id=0;
		String name=" ";
		String city=" ";
		int choice;
		boolean flag= false;
		Scanner sc=new Scanner(System.in);
		LinkedList<Student> list = new LinkedList<Student>();
		String msg = " ";
		
		do {
			System.out.println("1. Add Student   2.Find Student    3.Update Student     4 Delete Student     5.View all      6.Exit");
			choice = sc.nextInt();
			
			
			switch(choice)
			{
			case 1:
				System.out.println("enter Student id, Student Name and Student city");
				id=sc.nextInt();
				name=sc.next();
				city=sc.next();
				Student st1=new Student(id, name, city);
				list.add(st1);
				
				System.out.println("Student details Inserted Successfully");
				break;
			case 2:
				System.out.println("enter student id to find");
				id=sc.nextInt();
				flag=false;
				for(Student s:list)
				{
					if(s.id==id)
					{
						System.out.print(s.toString());
						flag=true;
						break;
						
					}
				}
				if(flag=false)
				{
					System.out.println("Record Not found");
				}
				break;
				
			case 3:
			    System.out.println("Enter Student id to update");
			    id = sc.nextInt();
			    int index1 = 0;
			    flag = false;
			    for(Student s : list) {
			        if(s.id == id) {
			            System.out.println("Enter new Student Name and Student city");
			            name = sc.next();
			            city = sc.next();
			            s.name = name;
			            s.city = city;
			            flag = true;
			            System.out.println("Student details Updated Successfully");
			            break;
			        }
			        index1++;
			    }
			    if(flag == false) {
			        System.out.println("Record not found");
			    }
			    break;

				
				
			case 4:
				System.out.println("Enter Student id to delete");
				id=sc.nextInt();
				int index=0;
				flag = false;
				for(Student s:list)
				{
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
				break;
				
				
			case 5:
				System.out.println("All Students:");
			    for(Student s : list) {
			        System.out.println(s.toString());
			    }
				break;
				
				
				
			}
			System.out.println("Do you wish to continue Yes/No");
			msg=sc.next();
		}
		while(msg.equals("yes"));
		
		
		
		
		
		
	}

}
