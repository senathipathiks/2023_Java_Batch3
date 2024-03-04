package com.oops3;

class A1{
	int a = 20;// private variable cannot be used in inheritance ;
	
}
class B1 extends A1{
	int a = 10;
    void display() {
	     System.out.println(super.a);// super keyword makes a=20,if super keyword is not used then a=10;
  }
}

public class MainProg {
 public static void main(String[] args) {
	 B1 obj = new B1();
	 obj.display();
 }
}
