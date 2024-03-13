package com.Day2Basic;
import java.util.*;
public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sum of digits: ");
        int num =sc.nextInt();
        int digit ,sum=0;
        while(num>0) {
        	digit=num%10;
        	sum=sum+digit;
        	num=num/10;
        }
        System.out.print(sum);
	}

}
