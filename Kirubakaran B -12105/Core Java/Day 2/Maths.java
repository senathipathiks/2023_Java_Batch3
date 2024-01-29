package day2j;

import java.util.Scanner;

public class Maths {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("1.add \n 2.sub \n3.mul \n4.div");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			int c=a+b;
			System.out.println(c);
			break;
			
		case 2:
			int c1=a-b;
			System.out.println(c1);
			break;
		case 3:
			int c2=a*b;
			System.out.println(c2);
			break;
		case 4:int c4=a%b;
		System.out.println(c4);
		}

	}

}
