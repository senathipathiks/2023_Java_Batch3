package Day_2;
//Write a Java program to print the area and perimeter of a circle.

import java.util.Scanner;

public class Area_Perimeter {
	static int r;
	double Area() {
		return (3.14*(r*r));
	}
	double Perimeter() {
		return (2*3.14*r);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of the circle");
		r=sc.nextInt();
		
		Area_Perimeter a=new Area_Perimeter();
		
		System.out.println(a.Area());
		System.out.println(a.Perimeter());
	}

}
