package classIntro;

import java.util.Scanner;

public class Calculator {
	public int num1=10;
	public int num2=8;
	public int num3=6;
	
	
	void add() {
		int add=num1+num2+num3;
		System.out.println(add);
	}
	void sub() {
		int sub=num1-num2-num3;
		System.out.println(sub);
	}
	void mul() {
		int mul=num1*num2*num3;
		System.out.println(mul);
	}
	void div() {
		int mul=num1/num3;
		System.out.println(mul);
	}

	public static void main(String[] args) {
		Calculator c1=new Calculator();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice");
		System.out.println("Choose 1.Add  2.Sub  3.mul 4.div");
		int choice=sc.nextInt();
		
		
             switch(choice)
             {
             case 1:c1.add();
             break;
             case 2:c1.sub();
             break;
             case 3:c1.mul();
             break;
             case 4:c1.div();
             break;
             default :System.out.println("Enter valid operation");
             
             
             }
	}

}
