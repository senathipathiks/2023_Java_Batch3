package Day1;

import java.util.Scanner;

public class Calculator {
	private static int a;
	private static int b;
	
	void add() {
		int c=a+b;
		System.out.println("Addition is "+ c);
	}
	
	void sub() {
		int c=a-b;
		System.out.println("Sub is "+ c);
	}
	void mul() {
		int c=a*b;
		System.out.println("Multiplication  is "+ c);
	}
	void div() {
		int c=(a/b);
		System.out.println("division is "+ c);
	}

	public static void main(String[] args) {
		Calculator c=new Calculator();
		while(true) {
		System.out.println("1.Addition");
		System.out.println("2.substraction");
		System.out.println("3.multiplication");
		System.out.println("4.division");
		System.out.println("5.Exit the Application");
		System.out.println("-----------------------------");
		Scanner sc= new Scanner(System.in);
		
		
		
		System.out.println("enter first value");		
		 a = sc.nextInt();
		 System.out.println("enter second value");
		 b= sc.nextInt();
		
		 System.out.println("Select your choice:");
		 int s = sc.nextInt();

		
		
			switch(s) {
			case 1:
				
				c.add();
				break;
			case 2:{c.sub();}
			
			break;
			case 3:
				c.mul();
				
				break;
			case 4:
				c.div();
				break;
			case 5:
				System.exit(0);
			default:
					System.out.println("Enter correct choice!!!!");
				
			}
			
		}
		

	}
}


