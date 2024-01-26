package com.day4;

class Student{
	int rollno;
	String name;
	//default constructor
	Student(){
		
	}
	Student(int no){
		rollno=no;
	}
	//arguments constructor
	Student(int no,String n){
		this(no); //call constructor with one args
		rollno=no;
		name=n;
	}
	
	//Student(int rollno,String name){  //this keyword used for the same name uased for both variable name and args name
	//this.rollno=rollno;
	//this.name=name;
//}
	
	//copy constructor
	Student(Student e){
		rollno = e.rollno;
		name = e.name;
	}
	void classDisplay() {
		System.out.println("class display method");
	}
	@Override
	public String toString() {
		this.classDisplay();
		return "Student [rollno="+rollno+",name="+name+"]";
		
	}
	
}

public class Class1 {

	public static void main(String[] args) {
		
		Student obj = new Student(123,"abi"); // call args constructor
		System.out.println(obj.toString());
		
		System.out.println(new Student(124,"abishek").toString()); //anonmonys obj creation - call arg constructor
		
		System.out.println(new Student().toString());//call default constructor
		
		Student obj1 = new Student(obj); //copy constructor
		System.out.println(obj1.toString());

	}

}
