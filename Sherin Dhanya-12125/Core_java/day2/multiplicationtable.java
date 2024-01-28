package com.day2;
import java.util.Scanner;
//Write a Java program that takes a number as input and 
//prints its multiplication table up to 10.
public class multiplicationtable {

	public static void main(String[] args) {
		System.out.println("enter the number:");
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(i+"*"+a+"="+i*a);
		}

	}

}
