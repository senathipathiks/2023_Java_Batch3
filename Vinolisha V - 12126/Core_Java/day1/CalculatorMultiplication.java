//Create a class named Calculator with Multiplication Operation.
//Overload Multiplication method for integer multiplication, float multiplication and 
//mixed type multiplication.

package com.day1;

class Calculators{
	
	void multiplication() {
		System.out.println("Multiplication Operation:");
		System.out.println("");
	}
	
	public int multiplication(int a , int b) {
		int results=a*b;
		System.out.println("Integer Multiplication:" + results);
		return results;
	}
	
	public float multiplication(float a, float b) {
		float result=a*b;
		System.out.println("Float Multiplication:"+ result);
		return result;
	}
	
	public float multiplication(int a, float b) {
		float result=a*b;
		System.out.println("Mixed Multiplication:" + result);
		return result;
	}
	
}

public class CalculatorMultiplication {

	public static void main(String[] args) {
		Calculators cal=new Calculators();
		
		cal.multiplication();
		
		cal.multiplication(4,8);
		
		cal.multiplication(12.4f,5.6f);
		
		cal.multiplication(45,54.3f);
		
		

	}

}
