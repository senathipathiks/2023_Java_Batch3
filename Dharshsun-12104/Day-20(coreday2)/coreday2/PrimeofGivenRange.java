package com.coreday2;

import java.util.Scanner;

public class PrimeofGivenRange {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a,b,i,j,flag;
		System.out.println("Enter lower limit");
		a=sc.nextInt();
		System.out.println("Enter upper limit");
		b=sc.nextInt();
		System.out.println("display prime nos of the range");
		for(i=a;i<=b;i++) {
			if(i==1||i==0)
				continue;
			flag=1;
			for(j=2;j<=i/2;++j) {
				if(i%j==0) {
					flag=0;
					break;
				}
			}
			if(flag==1)
				System.out.println(i);
		}
		
	}

}
