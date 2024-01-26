package com.day4.core;

class StudentEx{
	int rollNo;
	String name;
	
	StudentEx(){
		
	}

	StudentEx(int rollNo, String name) {
		
		this.rollNo = rollNo;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [rollno=" +rollNo+",name="+name+"]";
	}
	
}

public class StudentDemo {

	public static void main(String[] args) {
		StudentEx obj=new StudentEx(123,"Sathya");
		System.out.println(obj.toString());
		System.out.println(new StudentEx(123,"Sathya").toString());

	}

}
