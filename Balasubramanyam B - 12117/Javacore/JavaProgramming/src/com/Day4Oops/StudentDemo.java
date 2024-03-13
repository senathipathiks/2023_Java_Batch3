package com.Day4Oops;

class StudentX {
    int rollno;
    String name;
    StudentX(){
    	
    }
	StudentX(int no,String n){
		rollno=no;
		name=n;
	}
	public String toString() {
		return "Student[roll no:"+ rollno + ", name="+name+"]";
	}}
	public class StudentDemo{
	public static void main(String[] args) {
		StudentX s = new StudentX(123,"Bala");
		System.out.println(s.toString());
		System.out.println(new StudentX(143,"Lokesh").toString()); 

	}

}
