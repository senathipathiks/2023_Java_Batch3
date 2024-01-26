package com.day4;

class StudentEg{
	int rollno;
	String name;
	
	StudentEg(){
		
	}
		StudentEg(int rollno, String name) {
			this.rollno=rollno;
			this.name=name;
		}
		@Override
		public String toString() {
			return "Student [rollno=" + rollno + ", name=" + name + "]";
		}
		
	}


class Mark extends StudentEg{
	int mark1,mark2,mark3;
	Mark(){
		super();
	}
	Mark(int no,String n, int m1, int m2, int m3){
		super(no,n);
		mark1=m1;
		mark2=m2;
		mark3=m3;
	}
	@Override
	public String toString() {
		return "Mark [mark1=" + mark1 + ", mark2=" + mark2 + ", mark3=" + mark3 + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}

public class Inheritance {
	public static void main(String args[]) {
		Mark m=new Mark(122,"Vino",85,88,90);
		System.out.println(m.toString());
	}
}
