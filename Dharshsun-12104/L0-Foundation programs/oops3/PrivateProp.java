package com.oops3;

class A2{
		 private int a = 10;// private variable cannot be used in inheritance so that super keyqork cannot be used ;
		public A2() {}
	}
	class B2 extends A2{
		B2() {}
		int a = 20;
			void display() {
		     System.out.println(this.a);// super keyword makes a=20,if super keyword is not used then a=10;
	  } // this  will use current class property .
	}

	public class PrivateProp {
	 public static void main(String[] args) {
		 B2 obj = new B2();
		 obj.display();
	 }
	}



