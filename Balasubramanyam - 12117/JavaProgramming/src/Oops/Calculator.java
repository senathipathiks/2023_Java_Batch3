package com.Oops;

public class Calculator {
	private int a;
	private int b;
    Calculator(int a,int b){
    	this.a=a;
    	this.b=b;
    }
    void Add() {
    	System.out.println(a+b);
    }
    void Sub() {
    	System.out.println(a-b);
    }
    void Mul() {
    	System.out.println(a*b);
    }
    void divide() {
    	  if (b == 0) {
    	    System.out.println("Error! Dividing by zero is not allowed.");
    	
    	  }
    	  else { 
    	    System.out.println(a/b);
    	}
  }
    	  
  void modulo() {
    	    if (b == 0) {
    	      System.out.println("Error! Dividing by zero is not allowed.");
    	    } 
    	    else {
    	      System.out.println( a % b);
    	    }
   }
	public static void main(String[] args) {
		System.out.println("Calculator");
		Calculator c = new Calculator(10,0);
		
		c.Add();
		c.Sub();
		c.Mul();
		c.divide();
		c.modulo();

	}

}
