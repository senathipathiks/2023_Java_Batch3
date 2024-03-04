package com.day4;

public class MethodOverLoading {
    void myMethod() {
    	System.out.println("welcome to eclipse");
    }
    void myMethod(int n) {
    	System.out.println(n*n);
    }
    void myMethod(int a,int b) {
    	System.out.println(a+b);
    }
    void myMethod(String s) {
    	System.out.println(s);
    }
	
	public static void main(String[] args) {
		MethodOverLoading o = new MethodOverLoading();
		o.myMethod();
		o.myMethod(10);
		o.myMethod("hiii");
		o.myMethod(2, 3);

	}

}
