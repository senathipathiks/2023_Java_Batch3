package com.Basic;
import java.util.Scanner;
public class DiamendPattern {
public static void main(String[] args) 
{
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number of rows: ");
	        int rows = sc.nextInt();
	        int i, j, space = rows - 1;
	        for (i = 0; i < rows; i++) {
	            for (j = 0; j < space; j++) {
	                System.out.print(" ");
	            }
	            for (j = 0; j <= i; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	            space--;
	        }
	        space = 0;
	        for (i = rows; i > 0; i--) {
	            for (j = 0; j < space; j++) {
	                System.out.print(" ");
	            }
	            for (j = 0; j < i; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	            space++;
	        }

}
}
