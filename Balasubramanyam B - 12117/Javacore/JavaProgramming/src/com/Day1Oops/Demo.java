 package com.Day1Oops;
class Student1{
	int id;
	String name;
	int age;
	int marks;
	void insertRecords(int i,String n ,int a,int m) {
		id=i;
		name = n;
		age = a;
		marks=m;
	}
	void displayStudent(){
		System.out.println("Student Id: "+id+"\nStudent Name: "+name+"\nAge: "+age+"\nMarks: "+marks+"\n");
	}
}   
public class Demo {

	public static void main(String[] args) {
		Student1 s = new Student1();
		Student1 s1 = new Student1();
		s.insertRecords(101,"Balasubramanyam", 21,325);
		s.displayStudent();
		s1.insertRecords(102,"Lokesh", 24,234);
		s1.displayStudent();
        
	}

}
