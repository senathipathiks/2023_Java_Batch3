package com.Day2Basic;
import java.util.Scanner;
public class DimendNumPattern {
	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter the number of rows: ");
		        int rows = sc.nextInt();
		        int i, j, space = rows - 1;
		        for (i = 1; i <= rows; i++) {
		            for (j = 0; j < space; j++) {
		                System.out.print(" ");
		            }
		            for (j = i; j >= 1; j--) {
		                System.out.print(j);
		            }
		            for (j = 2; j <= i; j++) {
		                System.out.print(j);
		            }
		            System.out.println();
		            space--;
		        }
		        space = 1;
		        for (i = rows - 1; i >= 1; i--) {
		            for (j = 0; j < space; j++) {
		                System.out.print(" ");
		            }
		            for (j = i; j >= 1; j--) {
		                System.out.print(j);
		            }
		            for (j = 2; j <= i; j++) {
		                System.out.print(j);
		            }
		            System.out.println();
		            space++;
		        }
		    }
		}

