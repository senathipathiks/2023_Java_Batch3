package com.day24;

class StudentClass {
	private int rollNo;
	private String name;
	
	public StudentClass() {
		System.out.println("This is a Default Constructor");
	}
	
	public StudentClass(int rollNo,String name) {
		this.rollNo = rollNo;
		this.name = name;
		System.out.println("This is a Parameterized Constructor");
	}
	
	public StudentClass(StudentClass obj) {
		rollNo = obj.rollNo;
		name = obj.name;
		System.out.println("This is a Copy Constructor");
	}
	
	@Override
	public String toString() {
		return "Student details \nRoll No  : "+rollNo+"\nName : "+name;
	}
}

public class ClassExample1 {

	public static void main(String[] args) {
		StudentClass s1 = new StudentClass(123,"Sanjay Khanna");
		System.out.println(s1.toString());
		
		System.out.println(new StudentClass().toString());
		
		StudentClass s2 = new StudentClass(s1);
		System.out.println(s2.toString());
		

	}

}
