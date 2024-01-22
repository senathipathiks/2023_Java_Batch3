package com.coreday1;

import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        double num1, num2, num3, average;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        num1 = sc.nextDouble();
        System.out.print("Enter the second number: ");
        num2 = sc.nextDouble();
        System.out.print("Enter the third number: ");
        num3 = sc.nextDouble();
        average = (num1 + num2 + num3) / 3;
        System.out.printf("The average of the three numbers is %.2f", average);
    }
}
