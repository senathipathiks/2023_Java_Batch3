package com.day2adv;

import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
}

