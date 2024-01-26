package Day_1;

import java.util.Scanner;

public class ReversingOfaNumber {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int m, n, temp = 0;
		m = s.nextInt();
		
		for(int i = 0; i<=m; i++) {
			n=m%10;
			temp=n;
			m=m/10;
			
			System.out.print(temp);
			
		}

		
	}

}
