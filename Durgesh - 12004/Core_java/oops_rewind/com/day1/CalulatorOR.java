package com.day1;

//import java.util.Scanner;

public class CalulatorOR {
	
//	Scanner sc = new Scanner(System.in);

    void multiply(int num1, int num2) {
//    	num1 = sc.nextInt();
//    	num2 = sc.nextInt();
        System.out.println(num1 * num2);
    }

    void multiply(float num1, float num2) {
//    	num1 = sc.nextFloat();
//    	num2 = sc.nextFloat();
        System.out.println(num1 * num2); 
    }

    void multiply(int num1, float num2) {
//    	num1 = sc.nextInt();
//    	num2 = sc.nextFloat();
        System.out.println(num1 * num2);
    }

	public static void main(String[] args) {
		CalulatorOR mul = new CalulatorOR();
		
		mul.multiply(10, 10);
		mul.multiply(11.9f, 13.0f);
		mul.multiply(2, 3.50f);
		
	}

}
