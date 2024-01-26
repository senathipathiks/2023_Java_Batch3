package com.day1;

class Student1{
	int stdID;
	String name;
	String gender;
	String cls;
	int tamil;
	int english;
	int maths;
	int science;
	int social;
	
	Student1(int stdID,String name,String gender,String cls,int tamil,int english,int maths,int science,int social){
		this.stdID=stdID;
		this.name=name;
		this.gender=gender;
		this.cls=cls;
		this.tamil=tamil;
		this.english=english;
		this.maths=maths;
		this.science=science;
		this.social=social;
		
		
	}
	void disp() {
		System.out.println("Student ID: "+ stdID);
		System.out.println("Student Name: "+ name);
		System.out.println("Student Gender: "+ gender);
		System.out.println("Student Class: "+ cls);
		System.out.println("Tamil Mark: " + tamil);
		System.out.println("English Mark: " + english);
		System.out.println("Maths Mark: " + maths);
		System.out.println("Science Mark: " + science);
		System.out.println("Social Mark: " + social);
	}
	void grd() {
		int avg = ((tamil+english+maths+science+social)/(5));
		System.out.println("Average: " + avg);
		
		if(avg>=90) {
			System.out.println("Grade-O");
		}
		else if(avg>=80) {
			System.out.println("Grade-A");
		}
		else if(avg>=70) {
			System.out.println("Grade-B");
		}
		else if(avg>=60) {
			System.out.println("Grade-C");
		}
		else if(avg>=50) {
			System.out.println("Grade-D");
		}
		else if(avg<50) {
			System.out.println("Fails in the Exam");
		}
	}
}



public class Grade {

	public static void main(String[] args) {
		Student1 obj = new Student1(1245, "Abishek K", "Male", "VI", 49, 48, 45, 41,40);
		obj.disp();
		obj.grd();

	}

}
