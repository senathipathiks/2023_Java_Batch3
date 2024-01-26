package com.Day4;

import com.Day3.ArraySort;

class A{
	public A() {
		
		System.out.println("This is Grand Parent const");
		
	}
}

class B extends A{
	public B() {
		
		System.out.println("This is Parent Const");
		
	}
	
public B(int x) {
	
	System.out.println(x);
		
	}
	
	
}

public class Constructor  extends B{
	
	public Constructor() {
		
		super(5);
		
		System.out.println("This is child const");
		
	}
	
public Constructor(int o) {
		
	
	
		
		
		System.out.println("This is  Another child const");
		
	}
	
	
	
	

	public static void main(String[] args) {
		
		Constructor c = new Constructor();
		
		

	}

}
