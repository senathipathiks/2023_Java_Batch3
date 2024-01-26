package Java_Day_2;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
//		int n = 567,m;
		int m;
		int temp=0;
		for(int i=0; i<=n;i++) {
			m=n%10;
			temp = m;
			n=n/10;
			System.out.print(temp);
			
		}
		
		
		

	}

}
