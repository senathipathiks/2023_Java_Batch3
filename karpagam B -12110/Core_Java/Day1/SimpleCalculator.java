package Com.Day1;

import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String[] args) {
		char operator;
		double num1;
		double num2;
		double result;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the operator: +,-,*,/");
		operator=sc.next().charAt(0);
	
		System.out.println("Enter the first Number:");
		num1=sc.nextDouble();
		
		System.out.println("Enter the Second Number:");
		num2=sc.nextDouble();
		
		switch(operator) {
		
		case '+':
			result = num1 + num2;
	        System.out.println(num1 + " + " + num2 + " = " + result);
	        break;
		case '-':
			result = num1 - num2;
	        System.out.println(num1 + " - " + num2 + " = " + result);
	        break;
		case '*':
			result = num1 * num2;
	        System.out.println(num1 + " * " + num2 + " = " + result);
	        break;
		case '/':
			result = num1 / num2;
	        System.out.println(num1 + " / " + num2 + " = " + result);
	        break;
			
		}
		
		
		
		

	}

}
