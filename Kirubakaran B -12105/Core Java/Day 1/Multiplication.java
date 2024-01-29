package classIntro;

import java.util.Scanner;

//Create a class named Calculator with Multiplication Operation.
//Overload Multiplication method for integer multiplication, float multiplication and 
//mixed type multiplication.
	
	
	

public class Multiplication {
	
   public void  mul(int n,int m) {
	   System.out.println("multiped ans : "+n*m);
	
	}
   public void  mul1(float n,float m) {
	   System.out.println("multiped ans: "+n*m);
	
	}
   public void  mul2(int n,float m) {
	   System.out.println("multiped ans :"+n*m);
	
	}
   public void  mul3(float n,int m) {
	   System.out.println("multiped ans :"+n*m);
	
	}
	
	

	public static void main(String[] args) {
		
		boolean b11 = true;
		
		Multiplication q=new Multiplication();
		Scanner sc=new Scanner(System.in);
		
		while (b11) {
			System.out.println("Enter your choice");
			System.out.println("1.multiply int int \n2.multiply float float\n3.multiply int float\n4.multiply float int");
			int choice =sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter First integer number");
				int a=sc.nextInt();
				System.out.println("Enter Second integer number");
				int b=sc.nextInt();
				q.mul(a, b);
				break;
			case 2:
				System.out.println("Enter First float number");
				float a1=sc.nextFloat();
				System.out.println("Enter Second float number");
				float b1=sc.nextFloat();
				q.mul1(a1, b1);
				break;
			case 3:
				System.out.println("Enter First integer number");
				int a2=sc.nextInt();
				System.out.println("Enter Second float number");
				float b2=sc.nextFloat();
				q.mul2(a2, b2);
				break;
			case 4:
				System.out.println("Enter First float number");
				float a3=sc.nextFloat();
				System.out.println("Enter Second integer number");
				int b3=sc.nextInt();
				q.mul3(a3, b3);
				break;
			case 5:
				System.exit(0);
				default:System.out.println("Enter valid options");
		}
		
			
			
			
			
			
			
		}

	}

}
