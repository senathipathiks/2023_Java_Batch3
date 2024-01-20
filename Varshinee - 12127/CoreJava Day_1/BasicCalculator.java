package Day_1;

import java.util.Scanner;

public class BasicCalculator {

	public static void main(String[] args) {
		int num1;
		int num2;
		char operator;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num1: ");
		num1=sc.nextInt();
		System.out.println("Enter the num2: ");
		num2=sc.nextInt();
		
		System.out.println("Select the Operator: '+' '-' '*' '/' ");
		operator=sc.next().charAt(0);
		int result=0;
		
		switch(operator) {
		case '+':
			result=num1+num2;
			break;
		case '-':
			result=num1-num2;
			break;
		case '*':
			result=num1*num2;
			break;
		case '/':
			result=num1/num2;
			break;
		default:
			System.out.println("You have entered the wrong number");
		}
		
		System.out.println(num1+" "+ operator + num2+" " + "=" + result);
		
		
		

	}

}
