package com.javacoreday4;
class Student1{
	void display() {
		System.out.println("Student Name: Abishek");
	}
}
class Mark1 extends Student1{
	void display() {
		int tamil=85;
		int eng=74;
		int mat=89;
		int sci=79;
		int soc=83;
		int total = tamil+eng+mat+sci+soc;
		System.out.println("Tamil: "+tamil);
		System.out.println("English: "+eng);
		System.out.println("Maths: "+mat);
		System.out.println("Science: "+sci);
		System.out.println("Social: "+soc);
		System.out.println("Total:"+total);
		}
}
class Result extends Mark1{
	void display() {
		System.out.println("Students Overrall marks is: 82%");
	}
}

public class MultiLevelTaskStudent {
	public static void main(String[] args) {
	    Student1 obj = new Student1();
	    obj.display();
		Student1 obj1 = new Mark1();
		obj1.display();
		Student1 obj2 = new Result();
		obj2.display();
		

	}

}
