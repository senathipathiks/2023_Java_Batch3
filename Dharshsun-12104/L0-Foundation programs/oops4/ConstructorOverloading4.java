package com.oops4;

//constructor overloading

public class ConstructorOverloading4 {
	ConstructorOverloading4(int a,int b){
		System.out.println(a+b);
	}
	
	ConstructorOverloading4(String a,String b){
		System.out.println(a + b);
	}
	
	ConstructorOverloading4(float a,float b){
		System.out.println(a+b);
	}
	
	ConstructorOverloading4(boolean a,boolean b){
		System.out.println(a+""+b);
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		ConstructorOverloading4 c = new ConstructorOverloading4(1,2);
		@SuppressWarnings("unused")
		ConstructorOverloading4 c1 = new ConstructorOverloading4(1.1f,2.2f);
		@SuppressWarnings("unused")
		ConstructorOverloading4 c2 = new ConstructorOverloading4(true,false);
		@SuppressWarnings("unused")
		ConstructorOverloading4 c3 = new ConstructorOverloading4("Constructor","overloading");
		
	}
}


