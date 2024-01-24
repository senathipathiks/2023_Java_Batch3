package day2j;

import java.util.Scanner;

public class Circle {
	double pi=3.14;
	Scanner sc=new Scanner(System.in);
	
	
	int r=sc.nextInt();
	void area()
	{
		
		double a=pi*r*r;
		System.out.println(a);
	}
	void peri()
	{
		double c=2*pi*r;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter radius");
		Circle c1=new Circle();
		
		c1.area();
		c1.peri();
		

	}

}
