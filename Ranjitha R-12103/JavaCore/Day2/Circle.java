// Write a Java program to print the area and perimeter of a circle.

package Day2;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the value");
		float a = obj.nextFloat();
		System.out.println("Perimeter of the circle is: " + 2 * 3.14 * a);
		System.out.println("Area of the circle is: " + 3.14 * a * a);

	}

}
