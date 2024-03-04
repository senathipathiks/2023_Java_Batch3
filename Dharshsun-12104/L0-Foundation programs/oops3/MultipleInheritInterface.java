package com.oops3;
// using inheritance and extends keyword.
class A{
	A(){
		super(); // refering parent class constructor
		System.out.println("A 1");
	}


 A(int a){
	this();// calling current class constructor A()
	 System.out.println("A 2");
 }
}
class B extends A{
	B(){
		super(5); // without 5 means prints B 1.
		System.out.println("B 1");
	}
	B(int a){
		// goes to constructor with argument i.e., A(int a) 
		System.out.println("B 2");
}
}
public class MultipleInheritInterface {
	public static void main(String[] args) {
		B obj = new B(); //first call goes to subclass before that jvm will check for super class and if present will inaitialize it.
	}

}
