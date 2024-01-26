package com.Day3;
class A{
   A(){
	   System.out.println("A1");
   }
   A(int a){
	   this();
	   System.out.println("A2");
   }
}
class B extends A{
	B(){
		System.out.println("B1");
	}
	B(int b){
		super(6);
		System.out.println("B2");
	}
}
public class ConstructorUsingInheritence {
	public static void main(String[] args) {
		B B=new B();
		B b1=new B(2);
		
	}

}
