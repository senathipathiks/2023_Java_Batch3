package com.Day3;
class C{  // SUPER CLASS
	  private int a =10; 
	C(){  
	}
	}
class D extends C{ //SUB CLASS
	int a =20;
	D(){}

void display() {
	System.out.println(this.a);
}}
public class VariableUsingInheritance {

	public static void main(String[] args) {
	D b = new D();
	b.display();
	}
}
