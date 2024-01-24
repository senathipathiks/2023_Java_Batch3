package com.day2adv;

public class Arthmetic {
    public static void main(String[] args) {
    	  if (args.length < 2) {
              System.out.println("Please provide two numbers as arguments.");
              return;
    	  }
        // Convert command line arguments to integers
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        // Perform arithmetic operations
        int sum = num1 + num2;
        int product = num1 * num2;
        int difference = num1 - num2;
        double quotient = (double) num1 / num2;
        int remainder = num1 % num2;

        // Print the results
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Difference: " + difference);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }
}
