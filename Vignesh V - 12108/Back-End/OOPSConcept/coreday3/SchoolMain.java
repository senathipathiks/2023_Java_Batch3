package com.coreday3;

import java.util.ArrayList;

class School {
	ArrayList<String> students;
	ArrayList<String> teacher;
	ArrayList<String> classes;

	School() {
		this.students = new ArrayList<String>();
		this.teacher = new ArrayList<String>();
		this.classes = new ArrayList<String>();

	}

	void addStudent() {
		System.out.println("Student Names are Added to the List: ");
		students.add("vicky");
		students.add("vishnu");
		students.add("sanjai");
		students.add("modi ji");
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

public class SchoolMain {
	public static void main(String[] args) {
		School obj = new School();
		obj.addStudent();
		obj.addTeacher();
		obj.removeStudent();
		obj.removeTeacher();
		obj.createClasses();

	}

}
