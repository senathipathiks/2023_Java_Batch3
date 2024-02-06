package com.day24;

class Student1{

	private int rollNo;
	private String name;
	
	public Student1(int rollNo,String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student details \nRoll NO  : "+rollNo+"\nName : "+name;
	}
}

public class StudentDemo {
	public static void main(String[] args) {
	Student1 s1 = new Student1(111, "Sanjay Khanna");
	System.out.println(s1.toString());
	System.out.println("Using Anonymous object");
	System.out.println(new Student1(112, "Vishnu").toString());

	}

}
