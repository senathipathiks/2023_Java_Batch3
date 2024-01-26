package com.day25;

import java.util.Scanner;

interface PersonalInfo{
	void PersonalDetails(String name,int age,String gender);
}

interface CollegeInfo{
	void CollegeDetails(String collegeName,int rollNo,String dept);
}

class Stud implements CollegeInfo,PersonalInfo{
	private String name;
	private int age;
	private String gender;
	private String collegeName;
	private int rollNo;
	private String dept;
	
	@Override
	public void PersonalDetails(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	@Override
	public void CollegeDetails(String collegeName, int rollNo, String dept) {
		this.collegeName = collegeName;
		this.rollNo = rollNo;
		this.dept = dept;
		
	}
	
	void display() {
		System.out.println("-------------------------------------------\nStudent Record: ");
		System.out.println("Student Name : "+name);
		System.out.println("Student Age : "+age);
		System.out.println("Student Gender : "+gender);
		System.out.println("Roll No : "+rollNo);
		System.out.println("Department Name : "+dept);
		System.out.println("College Name : "+collegeName);
		System.out.println("---------------------------------------------");
	}
}

public class MultipleInheritanceExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No of Student Record : ");
		int num = sc.nextInt();
		Stud[] stu = new Stud[num];
		System.out.println("Enter the Details: ");
		int i=-1;
		while(i<num) {
			System.out.println("Enter Student Name");
			String name = sc.next();
			System.out.println("Enter Student Age");
			int age = sc.nextInt();
			System.out.println("Enter Student Gender");
			String gender = sc.next();
			System.out.println("Enter Roll No : ");
			int rollNo = sc.nextInt();
			System.out.println("Enter College Name : ");
			String collegeName = sc.next();
			System.out.println("Enter Department Name : ");
			String dept = sc.next();
			stu[i] = new Stud();
			stu[i].CollegeDetails(collegeName, rollNo, dept);
			stu[i].PersonalDetails(name, age, gender);
		}
		
		System.out.println("Output :");
		for(int j=0;j<num;j++)
			stu[j].display();
		System.out.println("No of Record : "+num+"\n-----------------------------------------------");
		sc.close();	
	}

}
