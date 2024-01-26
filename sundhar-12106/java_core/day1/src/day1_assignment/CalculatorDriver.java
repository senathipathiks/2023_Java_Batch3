package day1_assignment;

import java.util.Scanner;

class Calculator {

	public double add(double num1, double num2) {
		return num1 + num2;

	}

	public double sub(double num1, double num2) {
		return num1 - num2;

	}

	public double multiply(double num1, double num2) {
		return num1 * num2;

	}

	public double division(double num1, double num2) {
		return num1 / num2;

	}

	public double modulo(double num1, double num2) {
		return num1 % num2;

	}
}

public class CalculatorDriver {

	public static void main(String[] args) {

		boolean b = true;

		Scanner sc = new Scanner(System.in);

		Calculator calObj = new Calculator();

		do {

			System.out.println("1.addition\n2.subtraction\n3.division\n4.modulus\n5.multiply\n6.exit");
			switch (sc.nextInt()) {
			case 1: {
				System.out.println("enter the value 1 & 2");
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				System.out.println(calObj.add(num1, num2));
				break;
			}
			case 2: {
				System.out.println("enter the value 1 & 2");
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				System.out.println(calObj.sub(num1, num2));
				break;
			}
			case 3: {
				System.out.println("enter the value 1 & 2");
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				System.out.println(calObj.division(num1, num2));
				break;
			}
			case 4: {
				System.out.println("enter the value 1 & 2");
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				System.out.println(calObj.modulo(num1, num2));
				break;
			}
			case 5: {
				System.out.println("enter the value 1 & 2");
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				System.out.println(calObj.multiply(num1, num2));
				break;
			}
			case 6: {
				b=false;
				System.out.println("******Thank You******");
				break;
			}

			default:
				System.out.println("enter valid input");
				break;
			}

		} while (b);
	}

}
