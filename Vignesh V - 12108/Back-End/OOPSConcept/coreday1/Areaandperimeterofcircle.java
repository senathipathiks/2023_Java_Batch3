package com.coreday1;

import java.util.Scanner;

public class Areaandperimeterofcircle{
    public static void main(String[] args) {
        double radius, area, perimeter;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        radius = sc.nextDouble();
        area = Math.PI * radius * radius;
        perimeter = 2 * Math.PI * radius;
        System.out.printf("The area of the circle is %.2f square units.\n", area);
        System.out.printf("The perimeter of the circle is %.2f units.\n", perimeter);
    }
}
