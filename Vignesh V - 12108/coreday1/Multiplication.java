package com.coreday1;

import java.util.Scanner;

public class Multiplication {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = input.nextInt();
    for (int i = 1; i <= 10; i++) {
      System.out.printf("%d x %d = %d\n", num, i, num * i);
    }
  }
}
