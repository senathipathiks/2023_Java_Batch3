package Day2;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range of number to find a prime numbers");
		int n=sc.nextInt();
		for(int i=1;i<n;i++) {
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					break;
				}
				else {
					System.out.println(i);
					break;
				}
			}
		}
	}

}
