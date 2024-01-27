package com.day1.core;

public class Student {
	
	private int studentId;
	private String studentName;
	private String dept;
	private String gender;
	
	public Student(int studentId, String studentName, String dept, String gender) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.dept = dept;
		this.gender = gender;
	}
	
	void display() {
		System.out.println("Student id is : " +studentId);
		System.out.println("Student Name is : " +studentName);
		System.out.println("Student Dept is : " +dept);
		System.out.println("Student Gender is : " +gender);
	}

	public static void main(String[] args) {
		Student stud=new Student(123,"Sathya","EEE","Male");
		stud.display();

	}

}
