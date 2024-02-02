package com.day7ExceptionHandling;

public class Prog1 {

	public static void main(String[] args) {
String str="Array";
int a[]= {1,2,3,4,5};
int b=10;
try
{
	int c=b/a[5];
}
catch(ArithmeticException c) {
	System.out.println(c);
}
	}
	
}
