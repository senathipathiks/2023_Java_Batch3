package com.Oops;

public class Student {
    private int stuId;
    private String stuName;
    private String dept;
    private String gender;
    Student(){
    	
    }
    Student(int stuId,String stuName,String dept,String gender){
    	this.stuId=stuId;
    	this.stuName=stuName;
    	this.dept=dept;
    	this.gender=gender;
    }
    void displayStudent() {
    	System.out.println("Student Id: "+stuId+"\nStudent name: "+stuName+"\nStudent dep: "+dept+"\nStudent gender: "+gender);
    	System.out.println();
    }
	public static void main(String[] args) {
		Student s1 = new Student(123,"Balu","EEE","Male");
		s1.displayStudent();
		Student s2 = new Student();
		s2.displayStudent();
     
	}

}
