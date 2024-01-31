package com.day1;

import java.util.Scanner;

class Student {
	
	Scanner sc = new Scanner(System.in);
	
	private int studID;
	private String studName;
	private String gender;
	
	private double tamilMark;
	private double englishMark;
	private double mathsMark;
	private double sciMark;
	private double ssMark;
	
	Student(int studID, String studName, String gender) {
		this.studID=studID;
		this.studName=studName;
		this.gender=gender;
	}
	
	void display() {
		System.out.println("Student ID: "+studID);
		System.out.println("Student Name: "+studName);
		System.out.println("Gender: "+gender);

	}
	
	public double gradeMarks() {
		System.out.println("Enter Tamil mark: ");
		tamilMark=sc.nextDouble();
		System.out.println("Enter English mark: ");
		englishMark=sc.nextDouble();
		System.out.println("Enter Maths mark: ");
		mathsMark=sc.nextDouble();
		System.out.println("Enter Science mark: ");
		sciMark=sc.nextDouble();
		System.out.println("Enter Social mark: ");
		ssMark=sc.nextDouble();
		
		double total = (tamilMark+englishMark+mathsMark+sciMark+ssMark)/5;
		
		if(total>=90) {
			return 'O';
		}
		else if(total<90 && total>=75) {
			return 'A';
		}
		else if (total <75 && total>=50) {
			return 'B';
		}
		else if(total <50 && total >=35) {
			return 'C';
		}
		else {
			return 'D';	
			}
	}
}


public class StudentMarks{
       public static void main(String[] args) {
		Student s1 = new Student(180106, "Durgesh", "Female");
		s1.display();
		System.out.println("Your Grade: " +s1.gradeMarks());
		
	}
	
}
	


