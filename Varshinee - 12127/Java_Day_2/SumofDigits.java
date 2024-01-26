package Java_Day_2;

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		int n,sum = 0,m;
        Scanner sc = new Scanner (System.in);
        System.out.print ("Enter the number: ");
        n = sc.nextInt ();
        for (int i=0;i<=n;i++){
        	m=n%10;
            sum=sum+m;
            n=n/10;
        }
        System.out.println ("Sum of digits: " + sum);
    }

}
