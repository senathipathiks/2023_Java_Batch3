package Day_1;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, m, sum = 0;
		
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		
		for (int i = 0; i < n; i++) {
			m=n%10;
			sum=sum+m;
			n=n/10;
			
			
			
		}
		
		System.out.println(sum);

	}

}
