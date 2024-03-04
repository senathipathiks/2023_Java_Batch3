package com.javacoreday4;
class StudentEx1{
	int rollno; //instance variables
	String name;
	
	StudentEx1(){
		
	}
	StudentEx1(int rollno,String name){ //local variables
//		this(rollno);//constructor accepting one argument
		this.rollno = rollno;
		this.name = name;
	}
	
	@Override
	public String toString() {
//		this.classDisplay();
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	
}
class Mark extends StudentEx1{
	int mark1,mark2,mark3;
	
	Mark(){
		super();
	}
	Mark(int no,String n,int m1,int m2,int m3){
		super(no,n);
		 mark1=m1;
		 mark2=m2;
		 mark3=m3;
		
	}
	@Override
	public String toString() {
		return "Mark [mark1=" + mark1 + ", mark2=" + mark2 + ", mark3=" + mark3 + ", rollno=" + rollno + ", name="
				+ name + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
}


public class Inheritance {
	
	public static void main(String args[]) {
		Mark obj1 = new Mark(123,"Dharshsun",78,67,94);
		System.out.println(obj1.toString());
		
	}

}
