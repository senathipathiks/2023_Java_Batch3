package com.coreDay4;

public class Aclass {

	public static void main(String[] args) {
		
		C c = new C();
	}
	
	Aclass(){
		System.out.println("A");
	}

}

class B extends Aclass{
	B(){
		System.out.println("B");
	}
}

class C extends B{
	C(){
		System.out.println("C);
	}
}