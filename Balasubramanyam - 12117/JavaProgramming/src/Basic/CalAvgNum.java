package com.Basic;
import java.util.*;
public class CalAvgNum {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the a:");
	int a = sc.nextInt();
	System.out.println("Enter the b:");
	int b = sc.nextInt();
	System.out.println("Enter the c:");
	int c = sc.nextInt();
	int d=a+b+c;
	System.out.println("sum of 3 nums: "+d);
	int avg= d/3;
	System.out.println("The average is: "+avg);
	}

}
