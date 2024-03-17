package com.coreday1;

import java.util.Scanner;

public class Weakday {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = input.nextInt();
    String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    if (num >= 1 && num <= 7) {
      System.out.println("The weekday corresponding to " + num + " is " + weekdays[num - 1] + ".");
    } else {
      System.out.println("Invalid input. Please enter a number between 1 and 7.");
    }
  }
}

