package com.Day4;

class Student{
	
	int rollno;
	String name;
	static int count;  // class var
	
	public Student(int no) {
		this.rollno=no;
	}
	public Student(int rollno,String name) {
		
		this(rollno); // calling 1 args constructor
		this.rollno=rollno;
		this.name=name;
		
	}
	
	public Student(Student s1) { // copy Constructor
		
		      rollno = s1.rollno;
		      name = s1.name;
	}
	
	
	void displayClass() {
		System.out.println("Display method invoked");
	}
	
	static int increment() {
		
		return ++count;
	}

	
	
   @Override
public String toString() { // override to string from obj class
	   
	   this.displayClass(); // method invoking
	
	return "Student [rollno="+rollno+ ",name="+name +"]";
}
}

public class StudentDemo {

	public static void main(String[] args) {
		
		Student arr[]=new Student[10];
		
		Student s = new Student(123, "Prasanth"); // NOrmal obj
		
		System.out.println(s.toString());
		
		System.out.println("***********************************************");
		
		System.out.println(new Student(121,"Surya").toString()); //Anonymous obj
		
		System.out.println("***********************************************");
		
		Student s3 = new Student(s); // invoke copy constructor
		
		System.out.println(s3.toString());
		
		System.out.println("***********************************************");
		
		System.out.println(Student.increment());
		
	}

}
