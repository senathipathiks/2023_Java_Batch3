package com.day24;

class StudentExample{
	
	private int rollNo;
	private String name;
	
	public StudentExample() {
		this(10);
		System.out.println("This is a Default Construtor");
	}
	
	public StudentExample(int rollNo) {
		this(20,"Sanjay");
		this.rollNo = rollNo;
		System.out.println("This is a Parameterized Constructor with one parameter");		
	}
	public StudentExample(int rollNo,String name) {
		this.rollNo=rollNo;
		this.name=name;
		System.out.println("This is a parameterized constructor with two parameter");
	}
	public StudentExample(StudentExample obj) {
		rollNo = obj.rollNo;
		name = obj.name;
		System.out.println("This is a Copy Constructor");
	}
	
	@Override
	public String toString() {
		return "Student details \nRoll No  : "+rollNo+"\nName : "+name;
	}
}

public class ThisKeywordExample {

	public static void main(String[] args) {
		StudentExample obj = new StudentExample();
		StudentExample obj1 = new StudentExample(obj);
		System.out.println(obj1.toString());
	}

}
