package com.coreDay4;

public class A {
	
	A(){
		System.out.println("Class A");
	}
	

	public static void main(String[] args) {
		
		C1 c = new C1(5);
	}

}

class B1 extends A{
	B1(){
		System.out.println("Class B");
	}
	
	B1(int x){
		System.out.println("Class B-1");
	}
}

class C1 extends B {
	C1(){
		System.out.println("Class C");
	}
	
	C1(int x){
		System.out.println("Class C-1");
	}
}

