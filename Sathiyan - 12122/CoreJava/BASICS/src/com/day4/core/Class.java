package com.day4.core;

import java.util.ArrayList;

class School {

	private ArrayList<Student> students;
	private ArrayList<Teacher> teachers;
	private ArrayList<Class> classes;


	public School() {
		 students = new ArrayList<Student>();
		 teachers = new ArrayList<Teacher>();
		 classes = new ArrayList<Class>();
	}

	
	public void addStudent(Student student) {
		students.add(student);
	}
	
	public void removeStudent(Student student) {
		students.remove(student);
	}

	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}

	public void removeTeacher(Teacher teacher) {
		teachers.remove(teacher);
	}


	public void createClass(String name, Teacher teacher, ArrayList<Student> students) {
		Class newClass = new Class(name, teacher, students);
		classes.add(newClass);
	}


	public void display() {
		System.out.println("School Information:");
		System.out.println("Number of students: " + students.size());
		System.out.println("Number of teachers: " + teachers.size());
		System.out.println("Number of classes: " + classes.size());
		System.out.println("Students:");
		 
		for (Student student : students) {
			student.display();
		}
		
		System.out.println("Teachers:");
		for (Teacher teacher : teachers) {
			teacher.display();
		}
		
		System.out.println("Classes:");
		for (Class class1 : classes) {
			class1.display();
		}
	}
}


class Student {

	private String name;
	private int grade;

	public Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}


	public void display() {
		System.out.println("Name: " + name + ", Grade: " + grade);
	}
}

class Teacher {

	private String name;
	private String subject;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Teacher(String name, String subject) {
		this.name = name;
		this.subject = subject;
	}

	public void display() {
		System.out.println("Name: " + name + ", Subject: " + subject);
	}
}


public class Class {


	private String name;
	private Teacher teacher;
	private ArrayList<Student> students;
	
	
	public Class(String name, Teacher teacher, ArrayList<Student> students) {
		 this.name = name;
		 this.teacher = teacher;
		 this.students = students;
	}
	
	
	public void display() {
		 System.out.println("Name: " + name + ", Teacher: " + teacher.getName() + ", Subject: " + teacher.getSubject());
		 System.out.println("Students:");
		 
		 for (Student student : students) {
			 student.display();
		 }
	}

	public static void main(String[] args) {

		School school = new School();


		Student s1 = new Student("Alice", 10);
		Student s2 = new Student("Bob", 9);
		Student s3 = new Student("Charlie", 11);
		Student s4 = new Student("David", 10);
		Student s5 = new Student("Eve", 9);
		
		Teacher t1 = new Teacher("John", "Math");
		Teacher t2 = new Teacher("Mary", "Science");
		Teacher t3 = new Teacher("Peter", "English");
		
		school.addStudent(s1);
		school.addStudent(s2);
		school.addStudent(s3);
		school.addStudent(s4);
		school.addStudent(s5);
		school.addTeacher(t1);
		school.addTeacher(t2);
		school.addTeacher(t3);
		
		ArrayList<Student> mathStudents = new ArrayList<Student>();
		mathStudents.add(s1);
		mathStudents.add(s2);
		mathStudents.add(s3);
		
		ArrayList<Student> scienceStudents = new ArrayList<Student>();
		scienceStudents.add(s2);
		scienceStudents.add(s4);
		scienceStudents.add(s5);
		
		ArrayList<Student> englishStudents = new ArrayList<Student>();
		englishStudents.add(s1);
		englishStudents.add(s3);
		englishStudents.add(s4);
		englishStudents.add(s5);
		
		
		school.createClass("Math 101", t1, mathStudents);
		school.createClass("Science 101", t2, scienceStudents);
		school.createClass("English 101", t3, englishStudents);
		
		school.display();
	}
}


