package com.Day4Oops;
class Student1{
	int rollno;
	String name;
	static int count;
	Student1(){
		
	}
	Student1(int no){
	   rollno=no;
	}
	Student1(int rollno,String name){
		this(rollno); //constructor which is accepting one argument
		this.name=name;
	}
	Student1(Student1 obj){
		rollno=obj.rollno;
		name=obj.name;
	}
	static int increment() {
		return count++;
	}
	void classDisplay() {
		System.out.println("Student class");
	}
	@Override
	public String toString() {
		this.classDisplay();
		return "Student1 [rollno=" + rollno + ", name=" + name + "]";
	}
	
}
public class ConstructorThiskeyword {

	public static void main(String[] args) {
		System.out.println(Student1.increment());
		Student1 a = new Student1(1213,"Balu"); //with parameter
		System.out.println(a.toString());
		System.out.println(Student1.increment());
		System.out.println(new Student1().toString()); //without parameter  or anonymous object
		System.out.println(Student1.increment());
		Student1 b = new Student1(a); //copy constructor
		System.out.println(b.toString());
		

	}

}
