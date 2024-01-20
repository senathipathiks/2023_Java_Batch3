package com.day1;

class Student{
	private int studID;
	private String studName;
	private String dept;
	private String gender;
	Student(){
		System.out.println("Default constructor");
	}
	Student(int studID,String studName,String dept,String gender){
		this.studID=studID;
		this.studName=studName;
		this.dept=dept;
		this.gender=gender;
	}
	void display() {
		System.out.println("Student ID: " + studID);
		System.out.println("Student Name: " + studName);
		System.out.println("Department: " + dept);
		System.out.println("Gender: "+gender);
	}
	
}

public class Stu {

	public static void main(String[] args) {
		Student obj = new Student(12120,"Abishek K","ECE","Male");
		obj.display();
		Student obj1 = new Student();


	}

}
