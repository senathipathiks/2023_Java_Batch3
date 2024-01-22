//Create a class named Calculator with Multiplication Operation.
//Overload Multiplication method for integer multiplication, float multiplication and 
//mixed type multiplication.
package Day1;

import java.util.Scanner;

public class CalculatorOperation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		do {
			System.out.println(" 1.int-int\n 2.float-float\n 3.int-float\n 4.float-int\n 5.Exit");

			switch (sc.nextInt()) {
			case 1:
				System.out.println("Enter two integer value");
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				System.out.println(multiplication(num1, num2));
				break;
			case 2:
				System.out.println("Enter two float value");
				float num3 = sc.nextFloat();
				float num4 = sc.nextFloat();
				System.out.println(multiplication(num3, num4));
				break;
			case 3:
				System.out.println("Enter one integer and one float value");
				int num5 = sc.nextInt();
				float num6 = sc.nextFloat();
				System.out.println(multiplication(num5, num6));
				break;
			case 4:
				System.out.println("Enter one float and one integer value");
				float num7 = sc.nextFloat();
				int num8 = sc.nextInt();
				System.out.println(multiplication(num7, num8));
				break;
			case 5:
				flag = false;
				System.out.println("***Thank You***");
			default:
				System.out.println("Invalid input");
				break;
			}

		} while (flag);
	}

	public static int multiplication(int num1, int num2) {
		return num1 * num2;
	}

	public static float multiplication(float num3, float num4) {
		return num3 * num4;
	}

	public static float multiplication(int num5, float num6) {
		return num5 * num6;
	}

	public static float multiplication(float num7, int num8) {
		return num7 * num8;
	}

}
