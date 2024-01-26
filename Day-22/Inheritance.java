package com.Day4;


class Parent{
	
	int rollno;
	String Name ;
	
	
	
	public Parent() {
		
		System.out.println("This is Parent");
		
		
	}
  
	
      
	
}

class child extends Parent{
	int m1,m2,m3;
	public child(int m1 , int m2, int m3) {
		
		
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		
		
		System.out.println("This is child");
		
	}
	
	
	
}
public class Inheritance  extends child{
	
	public Inheritance(int rollno, String Name) {
		
		super(50,60,70);
		
		this.rollno= rollno;
		this.Name=Name;
		
		System.out.println("This is inheritance");
	
	}
	
	@Override
	public String toString() {
		
		return "Student Roll No :"+rollno+" Name :"+Name+"\n Marks are : "+m1+" "+m2+" "+m3;
		
		//return "hello";
	}
	
	
	
	
	

	public static void main(String[] args) {
		
		
		
		Inheritance i = new Inheritance(121,"Prasanth");
		
		
		
		System.out.println(i.toString());
		
		
	}

}
