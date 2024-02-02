package Day1;

import java.util.Scanner;

class intmulti{
	void mult(int a,int b) {
		int c=a*b;
		System.out.println("Multiplicaiton of int is "+c);
	}
	void mult(int a,float b) {
		float c=a*b;
		System.out.println("Multiplicaiton of int and float is "+c);
	}
	void mult(float a,float b) {
		float c=a*b;
		System.out.println("Multiplicaiton of float is "+c);
	}
}

public class MultiOPeration {
	

	public static void main(String[] args) {
		
		intmulti i=new intmulti();
		
		i.mult(25,25);
		
		
		Scanner sc=new Scanner(System.in);
		while (true) {
		System.out.println("Enter your choice\n1.int and int multiply\n2.int and float multiply\n3.float and float multiply\n4,Exit");
		
		int ch=sc.nextInt();
		
		switch(ch) {
		case 1:{
			System.out.println("ENter First  Number:");
			int a = sc.nextInt();
			System.out.println("ENter Second  Number:");
			int b = sc.nextInt();
			i.mult(a, b);
			break;}
		case 2:{
			System.out.println("ENter First  Number:");
			int a = sc.nextInt();
			System.out.println("ENter Second  Number:");
			float b = sc.nextFloat();
			i.mult(a, b);}
		case 3:{
			System.out.println("ENter First  Number:");
			float a = sc.nextFloat();
			System.out.println("ENter Second  Number:");
			float b = sc.nextFloat();
			i.mult(a, b);
		}
		case 4:
			System.out.println("Thank You!!!!!!!!");
			System.exit(0);
		
		}
		
		}
		
	}

}
