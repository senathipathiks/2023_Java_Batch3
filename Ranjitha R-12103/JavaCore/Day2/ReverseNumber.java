package Day2;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int rem,rev;
		System.out.println("Enter the Numer");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n>0){
			rem=n%10;
			rev=rem;
			n=n/10;
			System.out.print(rev);
		}

	}

}
