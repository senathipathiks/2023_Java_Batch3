package com.day24;

class Stud{
	Marks mark = new Marks();
	Result result = new Result();
	public Stud() {
		System.out.println("This is Student class");
	}
}

class Marks{
	public Marks() {
		System.out.println("This is Marks Class");
	}
}

class Result{
	public Result() {
		System.out.println("This is Result Class");
	}
}

public class StudentMainClass {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
	Stud obj = new Stud();	

	}

}
