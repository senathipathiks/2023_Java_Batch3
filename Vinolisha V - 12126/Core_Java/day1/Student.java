package com.day1;
import java.util.Scanner;
//static variable are called as class variable 

public class Student {
	
	Scanner sc= new Scanner(System.in);

	private int studId;
	private String studName;
	private String dept;
	private String gender;
	
	private double mark1;
	private double mark2;
	private double mark3;
	private double mark4;
	
	public Student(){
		
	}
	Student(int studId,String studName,String dept,String gender){
		this.studId=studId;
		this.studName=studName;
		this.dept=dept;
		this.gender=gender;
		
	}
		 void displayStudent() {
			System.out.println("Student Id:" + studId);
			System.out.println("Student Name:" + studName);
			System.out.println("Student Department:" + dept);
			System.out.println("Student Gender:" + gender);
		}
		
		public char gradeCalculate() {
			System.out.println("Enter Java Marks:");
			mark1=sc.nextDouble();
			System.out.println("Enter SQL Marks:");
			mark2=sc.nextDouble();
			System.out.println("Enter HTML Marks:");
			mark3=sc.nextDouble();
			System.out.println("Enter CoreJava Marks:");
			mark4=sc.nextDouble();
			
			double grade=(mark1+mark2+mark3+mark4)/4;
			
			if (grade>90 && grade<100) {
				return 'A';
			}
			if (grade>80 && grade<90) {
				return 'B';
			}
			if (grade>60 && grade<80) {
				return 'C';
			}
			if (grade>35 && grade<60) {
				return 'D';
			}
			else return 'E';
			
			
		}
		public static void main(String arg[]) {
			Student s1= new Student(12126,"Vinolisha","MCA","Female");
			s1.displayStudent();
			System.out.println("Your Grade is:" + s1.gradeCalculate());
			
			
			
			Student s3=new Student();
			s3.displayStudent();
		
}
}
