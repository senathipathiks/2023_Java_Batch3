package com.Day4Oops;
class School1{
	private String students, teachers,classes;
	void add( String students,String teachers) {
		this.students=students;
		this.teachers=teachers;
		System.out.println("\nStudents: "+students+"\nTeachers: "+teachers);
	}
	void remove( String students,String teachers) {
		this.students=students;
		this.teachers=teachers;
		System.out.println("\nStudents: "+students+"\nTeachers: "+teachers);
	}
	void create(String classes) {
		this.classes=classes;
		System.out.println("\nClasses: "+classes);
	}
}
public class School {
	public static void main(String[] args) {
		School1 s=new School1();
		s.add("Student 1", "Teacher 1");
		s.add("Student 2", "Teacher 2");
		s.remove(null, null);
		s.create("class room 1");
		s.create("class room 2");

	}

}
