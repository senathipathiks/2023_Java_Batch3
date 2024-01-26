package com.day4;

class Student{
	int rollno;
	String name;
	Student(){
		System.out.println("Vinolisha");
	}
	Student(int no){
		rollno=no;
	}
	Student(int rollno,String name){
		this.rollno=rollno;//constructor which is accepting one arg
		//this(rollno);
		this.name=name;
	}
	Student(Student e){
		rollno=e.rollno;
		name=e.name;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	
	
	}


public class Constructor {

	public static void main(String[] args) {
		Student obj=new Student(122,"Vinolisha"); // output from object//parameterized constructor
		System.out.println(obj.toString());
		
		System.out.println(new Student().toString());//default constructor will be 
		
		System.out.println(new Student(123,"Vino").toString());//output from annonyms object
		
		Student obj1=new Student(obj); //copy constructor
		System.out.println(obj1.toString());
		
		}

}
