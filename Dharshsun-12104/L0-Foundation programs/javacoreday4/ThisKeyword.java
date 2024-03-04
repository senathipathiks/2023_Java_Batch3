package com.javacoreday4;

class StudentEx{
	int rollno; //instance variables
	String name;
	static int count; 
	StudentEx(int no){
		rollno = no;
	}
	StudentEx(int rollno,String name){ //local variables
		this(rollno);//constructor accepting one argument
//		this.rollno = rollno;
		this.name = name;
	}
	StudentEx(StudentEx e){
		rollno=e.rollno;
		name = e.name;
	}
	void classDisplay() {
		System.out.println("student class");
	}
	static int increment() {
		return ++ count;
	}
	@Override
	public String toString() {
		this.classDisplay();
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	
}

public class ThisKeyword {
	public static void main(String args[]) {
		StudentEx obj1 = new StudentEx(113,"Dharshsun");//creating obj and this is parameterized cons.
		System.out.println(obj1.toString());
		System.out.println(StudentEx.increment());
		System.out.println(new StudentEx(119).toString());//one parameter constructor
		System.out.println(StudentEx.increment());
//		System.out.println(new Student(115,"Chandru").toString()); //anaonymous obj.
		StudentEx obj = new StudentEx(obj1);
		System.out.println(obj.toString());
		System.out.println(StudentEx.increment()); //static variable invoking method.
		
	}

}
