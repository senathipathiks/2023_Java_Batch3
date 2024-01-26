package com.day5;

interface Student{
	void display();
}
class PersonalInfo implements Student{
	public void display() {
		String Sname = "Abishek";
		String loc = "Mohanur";
		String gen = "Male";
		int age = 24;
		System.out.println("****Personal Info*****");
		System.out.println("Student Name: "+Sname);
		System.out.println("Student Location: "+loc);
		System.out.println("Student Gender: "+gen);
		System.out.println("Student Age: "+age);
	}
}
class CollegeInfo implements Student{
	public void display() {
		String Sname = "Abishek";
		String loc = "Mohanur";
		String gen = "Male";
		int age = 24;
		String deprt="ECE";
		String clge = "Anna University";
		float cgpa = 8.47f;
		
		System.out.println("****College Info*****");
		System.out.println("Student Name: "+Sname);
		System.out.println("Student Location: "+loc);
		System.out.println("Student Gender: "+gen);
		System.out.println("Student Age: "+age);
		System.out.println("Student Department: "+deprt);
		System.out.println("College: "+clge);
		System.out.println("Student CGPA: "+cgpa);
		
	}
}
public class Task4 {

	public static void main(String[] args) {
		Student obj = new PersonalInfo();
		obj.display();
		Student obj1 = new CollegeInfo();
		obj1.display();

	}

}
