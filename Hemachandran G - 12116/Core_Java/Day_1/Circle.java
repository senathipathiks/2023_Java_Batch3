package Day_1;

import java.util.Scanner;

public class Circle {
	Scanner s = new Scanner(System.in);
	int a = s.nextInt();
	
	void Area() {
		System.out.println("Area of the Circle is " + 3.14*a);
	}

	void Perimeter() {
		System.out.println("Perimeter of the Circle is "+2*3.14*a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Length of the Circle !!");
		Circle c = new Circle();
		
		
		
		c.Area();
		c.Perimeter();
	}

}
