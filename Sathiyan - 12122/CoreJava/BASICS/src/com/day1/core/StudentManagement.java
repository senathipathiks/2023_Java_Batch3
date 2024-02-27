package com.day1.core;

public class StudentManagement {
	private int studentId;
	private String studentName;
	private String dept;
	private String gender;
	private int engMark;
	private int tamMark;
	private int matMark;
	private int sciMark;
	private int socMark;
	

	public StudentManagement(int studentId, String studentName, String dept, String gender,int engMark, int tamMark, int matMark, int sciMark, int socMark) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.dept = dept;
		this.gender = gender;
		this.engMark = engMark;
		this.tamMark = tamMark;
		this.matMark = matMark;
		this.sciMark = sciMark;
		this.socMark = socMark;
	}
	
	void grade() {
		
		double total=engMark+tamMark+matMark+sciMark+socMark;
		double avg=total/5;
		System.out.println("Marks in total: "+total);
		
		if (avg<100 && avg > 90) {
			System.out.println("Grade O");
		}
		else if (avg<90  && avg>80) {
			System.out.println("Grade A*");
		}
		else if (avg<80 && avg>70) {
			System.out.println("Grade A");
		}
		else if (avg<70 && avg>60) {
			System.out.println("Grade B*");
		}
		else if (avg<60 && avg>50) {
			System.out.println("Grade B");
		}
		else {
			System.out.println("Fail");
		}
	}
	

	void display() {
		System.out.println("Student id is : " +studentId);
		System.out.println("Student Name is : " +studentName);
		System.out.println("Student Dept is : " +dept);
		System.out.println("Student Gender is : " +gender);
		System.out.println("Marks in tamil: "+tamMark);
		System.out.println("Marks in English: "+engMark);
		System.out.println("Marks in Maths: "+matMark);
		System.out.println("Marks in Science: "+sciMark);
		System.out.println("Marks in Social: "+socMark);
		
	}



	public static void main(String[] args) {
		
		StudentManagement ref=new StudentManagement(123, "Sathya", "EEE", "Male", 80, 95, 38, 92, 83);
		ref.display();
		ref.grade();
			
	}

}
