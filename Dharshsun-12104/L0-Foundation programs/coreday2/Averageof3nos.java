package com.coreday2;
import java.util.Scanner;

public class Averageof3nos {
	public static void main(String[] args) {
	Scanner no = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    double x = no.nextDouble();
    System.out.print("Enter the second number: ");
    double y = no.nextDouble();
    System.out.print("Enter the third number: ");
    double z = no.nextDouble();
    System.out.print("The average value is " + average(x, y, z)+"\n" );

}
public static double average(double x,double y ,double z) {
	return (x+y+z)/3;
}
}
