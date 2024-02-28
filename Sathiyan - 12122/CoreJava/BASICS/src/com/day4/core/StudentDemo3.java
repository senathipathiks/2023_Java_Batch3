package com.day4.core;

class StudentEx3{
	int rollNo;
	String name;
	
	StudentEx3(){
		
	}
	
	StudentEx3(int number){
		rollNo=number;
	}
	
	
	
	StudentEx3(StudentEx3 e){
		rollNo = e.rollNo;
		name = e.name;
	}

	StudentEx3(int rollNo, String name) {
		this(rollNo);
		this.rollNo = rollNo;
		this.name = name;
	}
	
	void classDisplay() {
		System.out.println("This is  Student class");
	}
	
	
	@Override
	public String toString() {
		this.classDisplay();
		return "Student [rollno=" +rollNo+",name="+name+"]";
	}
	
}

public class StudentDemo3 {

	public static void main(String[] args) {
		StudentEx3 obj=new StudentEx3(123,"Sathya");
		System.out.println(obj.toString());
		System.out.println(new StudentEx3(133,"Tamizh").toString());
		
		StudentEx3 obj1=new StudentEx3(obj);
		System.out.println(obj1.toString());

	}

}
