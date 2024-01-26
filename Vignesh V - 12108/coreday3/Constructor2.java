package com.coreday3;

class A{
	
	A(){
		System.out.println("class a");
	}
}

class B extends A{
	
	B(){
		System.out.println("class b");
	}
	
	B(int x){
		System.out.println("class b-1");
	}
}

class C extends B {
	C()
	{
		System.out.println("class c");
	}
	C(int x){
		System.out.println("class c-1");
	}
}
public class Constructor2 {
	public static void main(String[] args) {
		A obj =new C();
	}

}
