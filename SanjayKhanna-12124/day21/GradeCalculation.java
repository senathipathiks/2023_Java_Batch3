package com.day21;

class Student1{
	
	private int rollNo;
	private String studName;
	private double mathMark;
	private double chemistryMark;
	private double physicsMark;
	
	public Student1(int rollNo,String studName,double mathMark,double chemistryMark,double physicsMark) {
		this.rollNo = rollNo;
		this.studName = studName;
		this.mathMark = mathMark;
		this.chemistryMark = chemistryMark;
		this.physicsMark = physicsMark;
	}
	
	void calGrade() {
		double avg = Math.floor((mathMark+chemistryMark+physicsMark)/3);
		System.out.println("Student Name : "+studName);
		System.out.println("Roll No : "+rollNo);
		System.out.println("Maths Mark : "+mathMark);
		System.out.println("Chemistry Mark : "+chemistryMark);
		System.out.println("Physics Mark : "+physicsMark);
		if(avg>80)
			System.out.println("Average Mark : "+avg+"\nA Grade");
		else if(avg>60)
			System.out.println("Average Mark : "+avg+"\nB Grade");
		else if(avg>40)
			System.out.println("Average Mark : "+avg+"\nC Grade");
		else
			System.out.println("Average Mark : "+avg+"\nD Grade");
	}
	
}

public class GradeCalculation {

	public static void main(String[] args) {
		Student1 s1 = new Student1(1212, "Sanjay Khanna", 90, 78, 92);
		s1.calGrade();
	}

}
