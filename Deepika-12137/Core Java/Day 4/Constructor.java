package com.day4;
class A{
	A(){
		System.out.println("Class A");
	}
}
class B extends A{
	B(){
		System.out.println("Class B");
	}
	B(int x){
		System.out.println("Class b-1");
	}
}
class C extends B{
	C(){
		System.out.println("Class C");
	}
	C(int x){
//		super(8);
		System.out.println("Class c-1");
	}
}
public class Constructor {
public static void main(String[] args) {
	C obj=new C(4);
}
}
