package Com.Day2;

import java.util.Scanner;

public class AreaPerimeter {

	public static void main(String[] args) {
		float l ;
		float w;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Length and Width:");
		l=sc.nextFloat();
		w=sc.nextFloat();
		System.out.println("Area is:"+(l*w) );
		System.out.println("Perimeter is:"+ 2*(l+w) );

}

}
