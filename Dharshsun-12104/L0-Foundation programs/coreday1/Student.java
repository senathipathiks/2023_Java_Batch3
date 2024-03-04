package com.coreday1;

public class Student {
	//instance variables
	private int studID;
	private String studName;
	private String dept; 
	private String gender;
	private int year;
	Student()
	{
		
	}
	Student(int studID,String studName,String dept,String gender,int year){
		//local variables
		this.studID=studID;
		this.studName=studName;
		this.dept=dept;
		this.gender=gender;
		this.year=year;
		
	}
	void displayStudent() {
		System.out.println("Student ID:"+studID);
		System.out.println("Student name:"+studName);
		System.out.println("Dept:"+dept);
		System.out.println("Gender:"+gender);
		System.out.println("Year:"+year);
		
	}
	public static void main(String args[]) {
		Student s1= new Student(123,"Dharshsun","CSE","Male",1);
		s1.displayStudent();
		Student s2 = new Student();
		s2.displayStudent();
	}

}
