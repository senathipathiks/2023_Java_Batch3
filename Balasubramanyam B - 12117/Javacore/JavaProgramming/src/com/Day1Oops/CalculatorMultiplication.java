package com.Day1Oops;

public class CalculatorMultiplication {
    void Multiplication(int a,int b) {
    	 System.out.println("integer multiplication: "+a*b);
    }
    void Multiplication(double a,double b) {
    	System.out.println("Float multiplication: "+a*b);
    }
    void Multiplication(double a,int b) {
    	System.out.println("Mixed multiplication: "+a*b);
    }
	public static void main(String[] args) {
		CalculatorMultiplication c = new CalculatorMultiplication();
		c.Multiplication(10, 10);
		c.Multiplication(10.3, 67.6);
		c.Multiplication(56.2, 10);

	}

}
