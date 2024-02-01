package com.day30;

import java.util.LinkedList;
import java.util.Scanner;

class Student {
	int rollno;
	String name;
	String city;
	
	public Student(int rollno, String name, String city) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", city=" + city + "]";
	}
	
}

public class CollectionStudentExample {
	
	private static Scanner sc = new Scanner(System.in);
	private static LinkedList<Student> list = new LinkedList<Student>();
	private static final String password = "sanjay@42";

	public static void main(String[] args) {
		
		boolean decision = true;
		
		System.out.println("-----Welcome-----\n");
		do {
			System.out.println("1)Add Student\n2)Delete Student\n3)Delete All\n4)Update Student\n5)Search Student\n6)View All\n7)Quit\nEnter your option");
			int op = sc.nextInt();
			switch(op){
			case 1 :{
				System.out.println("Enter Roll no ,Name and City");
				int rollno = sc.nextInt();
				String name = sc.next();
				String city = sc.next();
				boolean a = list.add(new Student(rollno, name, city));
				if(a)
					System.out.println("Record Added Successfully");
				else
					System.out.println("Record Adding Failure");
				break;
			}
			case 2:{
				System.out.println("Enter Roll no : ");
				int rollno = sc.nextInt();
				boolean flag = false;
				for(Student s : list) {
					if(s.rollno==rollno) {
						flag =list.remove(s);
						break;
					}
				}
				if(flag)
					System.out.println("Record Deleted Successfully");
				else
					System.out.println("Record Deletion Failure");
				break;
			}
			case 3:{
				System.out.println("Are you Sure?\nPlease Enter Password :");
				String pass = sc.next();
				boolean flag = false;
				if(pass.equals(password))
					flag = list.removeAll(list);
				if(flag)
					System.out.println("All Record was Deleted");
				else
					System.out.println("Record Deletion Failure");
				break;
			}
			case 4:{
				System.out.println("Enter Roll no:");
				int rollno = sc.nextInt();
				int index=0;
				boolean flag = false;
				for(Student s : list) {
					if(s.rollno==rollno) {
						System.out.println("Record Found!\nEnter Modified Name\nEnter Modified City");
						String name = sc.next();
						String city = sc.next();
						list.set(index, new Student(rollno, name, city));
						flag = true;
						break;	
					}
					index++;
				}
				if(flag)
					System.out.println("Record Updated SuccessFully");
				else
					System.out.println("Record Updation Failure");
				break;
			}
			case 5:{
				System.out.println("Enter Roll no : ");
				int rollno = sc.nextInt();
				boolean flag = false;
				for(Student s : list) {
					if(s.rollno==rollno) {
						System.out.println("Record Found!\n"+s.toString());
						flag=true;
						break;
					}
				}
				if(!flag)
					System.out.println("Record Not Found!");
				break;
				
			}
			case 6:{
				if(list.size()>0) {
					System.out.println("Total No of Record : "+list.size());
					for(Student s : list) {
						System.out.println(s.toString());
					}
				}
				else
					System.out.println("No Record Found!");
				break;
			}
			case 7:{
				System.out.println("Are you Confirm Quiting ? [y/n]");
				char c = sc.next().charAt(0);
				if(c=='y')
					decision = false;
				else
					System.out.println("Quiting Cancelled");
				break;
			}
			default : System.out.println("Invalid Option \nPlease Enter 1-7 only");
			}
			System.out.println("\n---------------------------------------------------------\n");
		}while(decision);
		
		System.out.println("Thank you for using");
	}

}
