package Day2;

import java.util.Scanner;

public class Assign5inputthree {

	public static void main(String[] args) {
	
		
		Scanner sc =new Scanner(System.in);
		
		int a =sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		float total=a+b+c;
		double avg=total/3; 
		System.out.println("total of three numbers :" + total );
		System.out.println("Average of three numbers :" + avg );

	}

}


