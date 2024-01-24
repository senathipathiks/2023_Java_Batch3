package com.day4;

class A{
	A(){
		System.out.println("This is A");
	}
}
class B extends  A{
	B(){
		System.out.println("This is B");
		
	}
	B(int a,int b){
		int c=a+b;
		System.out.println("sum: "+c);
	}
}
class C extends B{
	C(){
		System.out.println("This is C");
	}
	C(int a,int b){
		//super(a,b);
		System.out.println("This is c-1");
	}
}
public class Class3 {

	public static void main(String[] args) {
		B obj = new B(10,20);

	}

}
