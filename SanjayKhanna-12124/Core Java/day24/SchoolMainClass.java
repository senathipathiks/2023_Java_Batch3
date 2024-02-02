package com.day24;

import java.util.ArrayList;

class School {
private ArrayList < Student > students;
private ArrayList < Teacher > teachers;
private ArrayList < SchoolClass > classes;

public School() {
 this.students = new ArrayList < Student > ();
 this.teachers = new ArrayList < Teacher > ();
 this.classes = new ArrayList < SchoolClass > ();
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

public void addClass(SchoolClass schoolClass) {
 classes.add(schoolClass);
}

public void removeClass(SchoolClass schoolClass) {
 classes.remove(schoolClass);
}

public ArrayList < Student > getStudents() {
 return students;
}

public ArrayList < Teacher > getTeachers() {
 return teachers;
}

public ArrayList < SchoolClass > getClasses() {
 return classes;
}
}
class Student {
	  private String name;
	  private int age;

	  public Student(String name, int age) {
	    this.name = name;
	    this.age = age;
	  }

	  public String getName() {
	    return name;
	  }

	  public void setName(String name) {
	    this.name = name;
	  }

	  public int getAge() {
	    return age;
	  }

	  public void setAge(int age) {
	    this.age = age;
	  }
	}
class Teacher {
private String name;
private String subject;
public Teacher(String name, String subject) {
    this.name = name;
    this.subject = subject;
}

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
}

class SchoolClass {
private String className;
private Teacher teacher;
private ArrayList<Student> students;

public SchoolClass(String className, Teacher teacher) {
    this.className = className;
    this.teacher = teacher;
    this.students = new ArrayList<Student>();
}

public String getClassName() {
    return className;
}

public void setClassName(String className) {
    this.className = className;
}

public Teacher getTeacher() {
    return teacher;
}

public void setTeacher(Teacher teacher) {
    this.teacher = teacher;
}

public ArrayList<Student> getStudents() {
    return students;
}

public void addStudent(Student student) {
    students.add(student);
}

public void removeStudent(Student student) {
    students.remove(student);
}
}

public class SchoolMainClass {

	public static void main(String[] args) {
		School school = new School();
	    Student student1 = new Student("Mats Yatzil", 15);
	    Student student2 = new Student("Karolina Ralf", 16);
		Student student3 = new Student("Felicie Anuschka", 16);
		Student student4 = new Student("Norbert Micha", 15);
		
	    school.addStudent(student1);
	    school.addStudent(student2);
		school.addStudent(student3);
		school.addStudent(student4);
		
	    Teacher teacher1 = new Teacher("Jens Amalia", "Math");
	    Teacher teacher2 = new Teacher("Elise Giiwedin", "English");
		Teacher teacher3 = new Teacher("Angelika Lotta", "Science");
		
	    school.addTeacher(teacher1);
	    school.addTeacher(teacher2);
		school.addTeacher(teacher3);

	    SchoolClass mathClass = new SchoolClass("Mathematics", teacher1);
	    mathClass.addStudent(student1);
	    mathClass.addStudent(student2);
		mathClass.addStudent(student3);
		mathClass.addStudent(student4);

	    SchoolClass englishClass = new SchoolClass("English", teacher2);
	    englishClass.addStudent(student1);
		englishClass.addStudent(student2);
		englishClass.addStudent(student3);

	    SchoolClass scienceClass = new SchoolClass("Science", teacher3);
	    scienceClass.addStudent(student1);
		scienceClass.addStudent(student2);
		scienceClass.addStudent(student3);
		scienceClass.addStudent(student4);

	    school.addClass(mathClass);
	    school.addClass(englishClass);
		school.addClass(scienceClass);

	    System.out.println("School information:");
	    System.out.println("Number of students: " + school.getStudents().size());
	    System.out.println("Number of teachers: " + school.getTeachers().size());
	    System.out.println("Number of classes: " + school.getClasses().size());
	    System.out.println();

	    System.out.println("Math class information:");
	    System.out.println("Class name: " + mathClass.getClassName());
	    System.out.println("Teacher: " + mathClass.getTeacher().getName());
	    System.out.println("Number of students: " + mathClass.getStudents().size());
	    System.out.println();

	    System.out.println("English class information:");
	    System.out.println("Class name: " + englishClass.getClassName());
	    System.out.println("Teacher: " + englishClass.getTeacher().getName());
	    System.out.println("Number of students: " + englishClass.getStudents().size());
	    System.out.println();
		
		System.out.println("Science class information:");
	    System.out.println("Class name: " + scienceClass.getClassName());
	    System.out.println("Teacher: " + scienceClass.getTeacher().getName());
	    System.out.println("Number of students: " + scienceClass.getStudents().size());
	    System.out.println();

	    school.removeStudent(student1);
	    school.removeTeacher(teacher2);
	    school.removeClass(mathClass);

	    System.out.println("School information after removing one student, teacher and Class:");
	    System.out.println("Number of students: " + school.getStudents().size());
	    System.out.println("Number of teachers: " + school.getTeachers().size());
	    System.out.println("Number of classes: " + school.getClasses().size());
	 }
	}