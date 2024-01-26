package com.day4;

class Student{
	int rollno;
	String name;
	static int count;
	
	Student(){
	
	}
	Student(Student s) 
	{
		rollno = s.rollno;
		name = s.name;
	}
	
	Student (int number){
		rollno=number;
	}
	
	
	Student(int rollno, String name) 
	{
		this(rollno);
		this.rollno = rollno;
		this.name = name;
	}
	
	void classDisplay()
	{
	  System.out.println("Student Class");	
	}
	
	static int increment() {
		return ++count;
		
	}
	public String toString() {
		this.classDisplay();
		return "Student [rollno = " +rollno + ", name = " + name + "]";
	}
	
}
public class StudentEx {
public static void main(String[] args) {
	Student obj =new Student(123,"Arjun");
	System.out.println(obj.toString());
	System.out.println(Student.increment());
	
	System.out.println(new Students().toString());
	
	Student obj1 =new Student(obj);
	System.out.println(obj1.toString());
}
}
