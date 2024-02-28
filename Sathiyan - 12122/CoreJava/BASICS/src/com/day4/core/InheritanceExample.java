package com.day4.core;

class StudentExample{
	int id;
	String name;
	
	public StudentExample() {
		
	}
	
	public StudentExample(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	
	public String toString(){
		return "Student roll number is "+id+" Name is "+name;
	}
	
	
	
}

class Marks extends StudentExample{
	int m1,m2,m3;
	
	Marks(){
		super();
	}

	Marks(int id,String name,int m1, int m2, int m3) {
		super(id,name);
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	
	@Override
	public String toString() {
		return "Marks in Sub 1 "+m1+" Marks in Sub 2 "+m2+" Marks in Sub 3 is "+m3;
	}
	
	
}

public class InheritanceExample {

	public static void main(String[] args) {
//		Marks mref=new Marks();
//		mref.toString();
		Marks mref2=new Marks(123,"Sathya",85,92,96);
		mref2.toString();
	}

}
