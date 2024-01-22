package Com.Day2;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		int n,sum=0,m;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to know the sum:");
		n=sc.nextInt();
		while(n>0) {
			m=n%10;
			sum=sum+m;
			n=n/10;
		}
		System.out.println("Sum is:"+sum);

		

	}

}
