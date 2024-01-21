package com.day1oops;
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
public class CaluculatorMultiplication {

	public static void main(String[] args) {
		Calculators cal=new Calculators();
		
		cal.multiplication();
		
		cal.multiplication(4,8);
		
		cal.multiplication(12.4f,5.6f);
		
		cal.multiplication(45,54.3f);
	}

}
