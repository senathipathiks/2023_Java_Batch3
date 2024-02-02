package Day2;

import java.util.Scanner;

public class multiply {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Eneter a number to print a table");
		int n=sc.nextInt();
		
		for (int i=1;i<=10;i++){
			System.out.println(i+"*"+n+"="+i*n);
		}

	}

}
