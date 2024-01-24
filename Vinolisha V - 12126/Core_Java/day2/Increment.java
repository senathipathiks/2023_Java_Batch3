package com.day2;

class Sample{
	  int x=1;
	void increment() {
		x++;
	}
}

public class Increment {

	public static void main(String[] args) {
		Sample obj=new Sample();
		obj.increment();
		System.out.println(obj.x); //2
		
		Sample obj1=new Sample();
		System.out.println(obj1.x); //2

	}

}
