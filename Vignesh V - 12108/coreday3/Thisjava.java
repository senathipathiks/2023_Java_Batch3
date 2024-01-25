package com.coreday3;

public class Thisjava {

	int rollno;
	String name;

	Thisjava() {

	}

	Thisjava(int no, String n) {
		this.rollno = no;
		this.name = n;

	}

	public Thisjava(ClassExample1 obj) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Thisjava [rollno=" + rollno + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		ClassExample1 obj = new ClassExample1(123, "jeeva");
		System.out.println(obj.toString());
		System.out.println(new ClassExample1(1234, "deva").toString());

		ClassExample1 obj1 = new ClassExample1(obj);
		System.out.println(obj1.toString());

	}

}
