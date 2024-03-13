package com.Day2Basic;
import java.util.*;
public class AreaOfPerimeterOfCircle {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter the radius: ");
    double r = sc.nextDouble();
    System.out.println("Area of circle: "+Math.PI*r*r);
    System.out.println("Area of Perimeter: "+2*Math.PI*r);
	}

}
