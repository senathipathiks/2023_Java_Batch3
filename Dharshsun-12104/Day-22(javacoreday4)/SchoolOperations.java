package com.javacoreday4;
import java.util.ArrayList;

class School {
    private ArrayList<String> students;
    private ArrayList<String> teachers;
    private ArrayList<String> classes;

    public School() {
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
        this.classes = new ArrayList<>();
    }

    public void addStudent(String student) {
        this.students.add(student);
        System.out.println(student + " has been added to the school.");
    }

    public void removeStudent(String student) {
        this.students.remove(student);
        System.out.println(student + " has been removed from the school.");
    }

    public void addTeacher(String teacher) {
        this.teachers.add(teacher);
        System.out.println(teacher + " has been added to the school as teacher.");
    }

    public void removeTeacher(String teacher) {
        this.teachers.remove(teacher);
        System.out.println(teacher + " has been removed from the school as teacher.");
    }

    public void createClass(String className) {
        this.classes.add(className);
        System.out.println("A new class " + className + " has been created.");
    }
}

public class SchoolOperations {
    public static void main(String[] args) {
        School school = new School();

        school.addStudent("Chandru");
        school.addStudent("Dharshsun");
        school.addTeacher("Mr.Senathipathi");
        school.addTeacher("Mr.john");
        school.createClass("Math");

        school.removeStudent("John");
        school.removeTeacher("Mr.john");
    }
}
