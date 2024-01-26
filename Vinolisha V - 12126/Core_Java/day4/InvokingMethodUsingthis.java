package com.day4;

class Students{
	int rollno;
	String name;
	Students(){
		System.out.println("Vinolisha");
	}
	void classDisplay() {
		System.out.println("Student Class");
	}
	
	public Students(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}
	@Override
	public String toString() {
		this.classDisplay();
	
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
}

public class InvokingMethodUsingthis {

	public static void main(String[] args) {
			Students s=new Students(123,"vino");
			System.out.println(s.toString());
			
			

	}

}
