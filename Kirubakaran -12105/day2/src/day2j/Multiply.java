package day2j;

import java.util.Scanner;

public class Multiply {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number do you want");
		int a=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			
			System.out.println(i +"* "+a+"= "+i*a);
		}

	}

}
