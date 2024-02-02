package Day2;

import java.util.Scanner;

public class Assign4Circle {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		double pi=3.14;
		System.out.println("Enter radius ");
		int r=sc.nextInt();
		double area=pi*r*r;
		
		double peri=2*pi*r;
		
		System.out.println("Area of circle is : "+ area);
		System.out.println("perimeter of circle is : "+ peri);
		
	}

}
