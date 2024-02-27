package com.day4.core;

class StudentEx2{
	int rollNo;
	String name;
	
	StudentEx2(){
		
	}
	
	StudentEx2(StudentEx2 e){
		rollNo = e.rollNo;
		name = e.name;
	}

	StudentEx2(int rollNo, String name) {
		
		this.rollNo = rollNo;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [rollno=" +rollNo+",name="+name+"]";
	}
	
}

public class StudentDemo2 {

	public static void main(String[] args) {
		StudentEx2 obj=new StudentEx2(123,"Sathya");
		System.out.println(obj.toString());
		System.out.println(new StudentEx2(133,"Tamizh").toString());
		
		StudentEx2 obj1=new StudentEx2(obj);
		System.out.println(obj1.toString());

	}

}
