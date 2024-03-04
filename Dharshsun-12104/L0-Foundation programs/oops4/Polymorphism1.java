package com.oops4;


/*
 * Polymorphism
 * 1.Overloading/compile time polymorphism/static polymorphism
 *   a. Method Overloading
 *   b.Constructor overloading
 * 2.Overriding/Run-time polymorphism
 *   a.Method Override
 */

// compile time polymorphism.
public class Polymorphism1 {
	
	void myMethod() {
		System.out.println("welcome to poly cons overloading");
	}
	void myMethod(int n) {
		System.out.println(n*n);
	}
	void myMethod(int a,int b) {
		System.out.println(a + b);
	}
	void myMethod(String name) {
		System.out.println("welcome" +name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Polymorphism1 obj = new Polymorphism1();
        obj.myMethod(); //method overloading - argument different takes memory 
        //from stack and it is compile time polymorphism
        obj.myMethod(" Dharshsun");
        obj.myMethod(5);
        obj.myMethod(20, 30);
	}

}
