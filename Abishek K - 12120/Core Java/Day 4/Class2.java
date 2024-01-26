package com.day4;

class Stud{
	int a=10;
	static int count;
	static int increment() {
		return ++count;
	}
	int  method1() {
	return	a=20;
	}
}

public class Class2 {

	public static void main(String[] args) {
		
		Stud obj = new Stud();
	//	obj.increment(); - it will show some warning.
		Stud.increment();
		System.out.println(Stud.count);
		
		

	}

}
