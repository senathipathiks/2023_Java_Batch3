package com.Day4Oops;

class Student{
	int rollno;
	String name;
	
	public Student() {
		
	}
	
	Student(int no , String n){
		this.rollno=no;
		this.name=n;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	
}
class Mark extends Student{
	int m1,m2,m3,m4;
	Mark(){
		super();
	}
	Mark(int no , String n, int m1,int m2,int m3, int m4){
		super(no,n);
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		this.m4=m4;
	}
	@Override
	public String toString() {
		return ""+super.toString()+"\nMark [m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + ", m4=" + m4 +"]";
	}
	
}
public class Inheritance {
	public static void main(String[] args) {
		Mark m = new Mark(123,"Bala",90,90,90,90);
		System.out.println(m.toString());

	}

}
