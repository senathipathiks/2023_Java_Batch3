package com.day4;

class A {
	A(){
		System.out.println("A");
	}
}
class B extends A{
	B(){
		System.out.println("B");
	}
	B(int x){
		System.out.println("B-1");
	}
}
class C extends B{
	C(){
		System.out.println("C");
	}
	C(int x){
		System.out.println("C-1");
	}
}

public class InhertEx2 {

	public static void main(String[] args) {
//		C o = new C();
		C obj = new C(4);
	}

}
