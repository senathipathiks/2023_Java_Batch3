package day1_assignment;

import java.util.Scanner;

public class Calculator2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean b = true;

		do {
			System.out.println("1.int-int\n2.float-float\n3.int-float\n4.float-int\n5.exit");
			switch (sc.nextInt()) {
			case 1: {
				System.out.println("enter the integer value 1 & 2");
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				System.out.println(multiplication(num1, num2));
				break;
			}
			case 2: {
				System.out.println("enter the float value 1 & 2");
				float num1 = sc.nextFloat();
				float num2 = sc.nextFloat();
				System.out.println(multiplication(num1, num2));
				break;
			}
			case 4: {
				System.out.println("enter the float value 1 & int value 2");
				float num1 = sc.nextFloat();
				int num2 = sc.nextInt();
				System.out.println(multiplication(num1, num2));
				break;
			}
			case 3: {
				System.out.println("enter the integer value 1 & float value 2");
				int num1 = sc.nextInt();
				float num2 = sc.nextFloat();
				System.out.println(multiplication(num1, num2));
				break;
			}
			case 5: {
				b=false;
				System.out.println("******Thank You******");
				break;
			}

			default:
				System.out.println("invalid input");
				break;
			}
		} while (b);

	}

	public static int multiplication(int num1, int num2) {
		return num1 * num2;
	}

	public static float multiplication(float num1, float num2) {
		return num1 * num2;
	}

	public static float multiplication(int num1, float num2) {
		return num1 * num2;
	}

	public static float multiplication(float num1, int num2) {
		return num1 * num2;
	}

}
