package com.javacoreday4;

class A{
	A(){
		System.out.println("class A");
	}
}
class B extends A{
	B(){
		System.out.println("class B");
	}
	B(int x){
		
		System.out.println("class B-1");
	}
}
class C extends B{
	C(){
		
		System.out.println("class C");
	}
	C(int y){
		
		super(y);
		System.out.println("class C-1");
	}
}

public class ConstructorEx {
	public static void main(String args[]) {
		C obj=new C(2); //without 2 it will give default cons value.
	}

}
