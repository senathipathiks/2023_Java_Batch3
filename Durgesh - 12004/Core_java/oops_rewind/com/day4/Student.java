package com.day4;

class StudentDetails {
	int rollno;
	String name;
	
	StudentDetails(){
		
	}
	
//	this keyword to rep --> current class object
//	StudentDetails(int rollno , String name){
//		this.rollno = rollno;
//		this.name = name;
//	}
	
//	single parameter constructor
	StudentDetails(int no){
		rollno = no;
	}
//	
//	Constructor accepting one argument
	StudentDetails(int rollno, String name){
		this(rollno);
		this.name = name;
		
	}
	
//	StudentDetails(int rno, String n){
//		rollno=rno;
//		name = n;
//	}
	
	StudentDetails(StudentDetails e){
		rollno = e.rollno;
		name = e.name;		
	}
	
	@Override
	public String toString () {
		return "Student[Rollno: " +rollno+ " , Name: " +name+ "]";
	}
}

public class Student {

	public static void main(String[] args) {
		System.out.println(new StudentDetails().toString());
		
		StudentDetails obj = new StudentDetails(123, "Logesh");
		System.out.println(obj.toString());
		
		System.out.println(new StudentDetails(124,"Durgesh").toString());
		
		StudentDetails obj1 = new StudentDetails(obj);
		System.out.println(obj1.toString());

	}

}
