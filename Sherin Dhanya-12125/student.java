package com.day1oops;

public class student {
	private int studId;
	private String studName;
	private String dept;
	private String gender;
	student(){
		
	}
	student(int studId,String studName,String dept,String gender){
		this.studId=studId;
		this.studName=studName;
		this.dept=dept;
		this.gender=gender;
	}
	void displaystudent() {
		System.out.println("Student Id"+" "+studId);
		System.out.println("Student Name"+" "+studName);
		System.out.println("Student department"+" "+dept);
		System.out.println("Student gender"+" "+gender);
	}
	public static void main(String[] args) {
		student s1=new student(121,"Sherin","ECE","Female");
		s1.displaystudent();
		student s2 =new student();
		s2.displaystudent();
		

	}

}
