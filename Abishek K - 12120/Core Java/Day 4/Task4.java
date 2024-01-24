//Write a Java program to create a class called "School" with attributes for students, teachers, and classes, and methods to add and remove students and teachers, and to create classes.

package com.day4;

import java.util.ArrayList;

class School{
	ArrayList<String> students;
	ArrayList<String> teacher;
	ArrayList<String> classes;
	
	School(){
		this.students= new ArrayList<String>();
		this.teacher= new ArrayList<String>();
		this.classes= new ArrayList<String>();
		
	}
	
	void addStudent() {
		System.out.println("Student Names are Added to the List: ");
		students.add("Abishek");
		students.add("Vishnu");
		students.add("prem");
		students.add("Ajith");
		System.out.println(students);
	}
	
	void addTeacher() {
		System.out.println("Teachers Names are Added to the List: ");
		teacher.add("Vikram");
		teacher.add("Simbu");
		teacher.add("Alex");
		teacher.add("Vijay");
		System.out.println(teacher);
	}
	void removeStudent() {
		System.out.println("Students Removed List: ");
	     students.remove(0);
		System.out.println(students);
	}
	void removeTeacher() {
		System.out.println("Teacher Removed List: ");
		teacher.remove(1);
		System.out.println(teacher);
	}
	void createClasses() {
		System.out.println("Classes are Created: ");
		classes.add("I");
		classes.add("II");
		classes.add("III");
		classes.add("IV");
		System.out.println(classes);
	}
	
	
}

public class Task4 {

	public static void main(String[] args) {
		School obj = new School();
		obj.addStudent();
		obj.addTeacher();
		obj.removeStudent();
		obj.removeTeacher();
		obj.createClasses();
		

	}

}
