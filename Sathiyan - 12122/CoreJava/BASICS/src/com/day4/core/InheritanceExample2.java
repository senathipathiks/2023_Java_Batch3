package com.day4.core;

class A{
	A(){
		System.out.println("A");
	}
	
	A(int a){
		System.out.println("A1");
	}
}

class B extends A{
	B(){
		System.out.println("B");
	}
	
	B(int a){
		System.out.println("B1");
	}
}

class C extends B{
	C(){
		System.out.println("C");
	}
	
	C(int a){
//		super(9);
		System.out.println("C1");
	}
}

public class InheritanceExample2 {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		C ref=new C(5);
		

	}

}
