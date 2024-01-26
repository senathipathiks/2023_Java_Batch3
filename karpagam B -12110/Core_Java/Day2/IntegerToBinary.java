package Com.Day2;

import java.util.Scanner;
public class IntegerToBinary {
	public static void main(String[] args) {
		int n,m;
		String x=" ";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=sc.nextInt();
		while(n>0){
			m=n%2;
			x=m+x;
			n=n/2;
			}
		System.out.println("Binary number is:"+x);
}
	}
