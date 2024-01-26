//4. Write a Java program to print the area and perimeter of a circle.
package Day2;
import java.util.Scanner;
public class PrintAreaPerimeterAndCircle {

	public static void main(String[] args) {
		System.out.println("Enter the value");
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		 
//		double area=3.14*a*a;
//		double perimeter=2*3.14*a;
//		System.out.println("area of the circle is :"+area);
//		System.out.println("perimeter of the circle is :"+perimeter);
		
		System.out.println("area of the circle is:"+(3.14*a*a));
		System.out.println("perimeter of the circle is:"+(2*3.14*a));
		
		
		

	}

}
