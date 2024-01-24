package Day2;
import java.util.*;
public class Circle {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the radius : ");
	double val=sc.nextDouble();
	double area=2*3.14*val;
	double perimeter=3.14*val*val;
	
	System.out.println("Perimeter value is :" + perimeter );
	System.out.println("Area is :"+ area);
	
}
}
