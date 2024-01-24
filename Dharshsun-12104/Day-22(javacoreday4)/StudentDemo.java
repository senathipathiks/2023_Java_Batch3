package com.javacoreday4;

class Student{
	int rollno;
	String name;
	Student(){
		
	}
	Student(int no,String n){
		rollno = no;
		name = n;
	}
	Student(Student e){
		rollno=e.rollno;
		name = e.name;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	
}


public class StudentDemo {
	public static void main(String args[]) {
		Student obj1 = new Student(113,"Dharshsun");//creating obj and this is parameterized cons.
		System.out.println(obj1.toString());
		System.out.println(new Student().toString());//default constructor
		System.out.println(new Student(115,"Chandru").toString()); //anaonymous obj.
		Student obj = new Student(obj1);
		System.out.println(obj.toString());
		
	}

}
