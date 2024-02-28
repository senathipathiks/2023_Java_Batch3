package com.oops.day5;

interface One{
	void Son1();
	void Son2();
}

interface Two{
	void Mom1();
	void Dad1();
}


abstract class Family implements Two,One{
	public void Son1() {
		System.out.println("Name is Sunday");
	}
	
	public void Son2() {
		System.out.println("Name is Monday");
		
	}
	
	public void Mom1() {
		System.out.println("Name is WEEK");
	}
		
}

class Family2 extends Family{
	
	public void Dad1() {
		System.out.println("Name is Month");
	}
}


public class InterfaceExample2 {

	public static void main(String[] args) {
		Family f=new Family2();
		f.Dad1();
		f.Mom1();
		f.Son1();
		f.Son2();

	}

}
