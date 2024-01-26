package com.day4;

class Stud{
	Marks m1=new Marks();
	public Stud() {
		System.out.println("This is Student class");
	}
}
class Marks{
	Results r1=new Results();
	public Marks() {
		System.out.println("This is Mark class ");
	}
}
 
class Results{
	public Results() {
		System.out.println("This is result cllass");
	}
}
public class StudentInheritance {

	public static void main(String[] args) {
		
		Stud s1=new Stud();

	}

}
