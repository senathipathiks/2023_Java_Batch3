package Day2;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		System.out.println("Enter the number of rows of * needs at max row");
		 Scanner sc = new Scanner(System.in);
		 int n= sc.nextInt();
		 int i,j;
		 for (i=1; i<=n;i++) {
			 
			 for( j=1;j<=i;j++) {
				 System.out.print("*");
			 }
			 System.out.println("");
		 }
		 

	}

}
