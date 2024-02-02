package com.day22;

import java.util.Scanner;

public class MutiplicationTable {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		System.out.println("Multiplication Table ");
		for(int i=1;i<=10;i++) {
			System.out.println(num+" x "+i+" = "+(num*i));
		}
		
	}

}
