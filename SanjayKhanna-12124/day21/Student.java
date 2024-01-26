package com.day21;

public class Student {
	
	private int studId;
	private String studName;
	private String dept;
	private String gender;
	
	public Student(int studId,String studName,String dept,String gender) {
		this.studId = studId;
		this.studName = studName;
		this.dept = dept;
		this.gender = gender;
		
	}
	
	void displayStudent(){
		System.out.println("Student ID : "+studId);
		System.out.println("Student Name : "+studName);
		System.out.println("Department : "+dept);
		System.out.println("Gender : "+gender);
	}

	public static void main(String[] args) {
		Student s1 = new Student(001,"SanjayKhanna","CSE","Male");
		s1.displayStudent();

	}

}
