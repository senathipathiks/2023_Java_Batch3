package com.newclass;

public class Student {
	
	
	private int studentId;
	private String studentName;
	private String dept;
	private String genter;
	
	// constructor
	Student(int studentId,String studentName,String dept,String gender){
		this.studentId=studentId;
		this.studentName=studentName;
		this.dept=dept;
		this.genter=gender;
		
	}
	
	void displayStudent() {
		 
		System.out.println("Student ID :"+studentId);
		System.out.println("Student Name :"+studentName);
		System.out.println("Student Department :"+dept);
		System.out.println("Student Gender :"+genter);
		
	}

	public static void main(String[] args) {
		
		
		Student s = new Student(12119, "Prashanth", "Software Engineer", "Male");
		s.displayStudent();
		

	}

}



