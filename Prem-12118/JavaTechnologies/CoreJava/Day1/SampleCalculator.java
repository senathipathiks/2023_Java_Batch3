package Day1;

import java.util.Scanner;

public class SampleCalculator {

	int num1;
	int num2;

	SampleCalculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	void Add() {
		int add;
		add = num1 + num2;
		System.out.println("The sample Addition by calculator: " + add);
	}

	void Sub() {

		int Sub;
		Sub = num1 - num2;
		System.out.println("The sample Subtraction by calculator:" + Sub);

	}

	void Mul() {

		int Mul;
		Mul = num1 * num2;
		System.out.println("The Sample Multiplication by calculator:" + Mul);
	}

	void Div() {
		int div;
		div = num1 / num2;
		System.out.println("The Sample Divison by Calculator" + div);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Two numbers for performing Sample Calculator operations");
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		SampleCalculator c1 = new SampleCalculator(23, 45);
		System.out.println("Give numbers according for the calculator operations\n1)Add \n2)Sub \n3)Mult \n4)div");
		int func = sc.nextInt();

		switch (func) {
		case 1: {
			c1.Add();
			break;
		}
		case 2: {
			c1.Sub();
			break;
		}
		case 3: {
			c1.Mul();
			break;
		}
		case 4: {
			c1.Div();
			break;
		}
		}

	}

}
