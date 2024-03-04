package com.javaday6;
import java.util.Arrays;
import java.util.Scanner;


public class BubbleSort {
	public static void main(String args[]) throws Exception{
System.out.println("\t\t\tBubble Sort Algorithm");
		
		int a[] = {10,1,4,8,2,89,33};
		
		boolean b = true;

		do {
			System.out.println("1.Ascending Order\n2.Descending\n3.Exit");
			@SuppressWarnings("resource")
			int n = new Scanner(System.in).nextInt();
			switch (n) {
			case 1:
				Thread.sleep(1500);
				System.out.println("Ascending Order : "+Arrays.toString(sort(a, n)));
				System.out.println("------------------------------------\n");
				break;
			case 2:
				Thread.sleep(1500);
				System.out.println("Descending Order : "+Arrays.toString(sort(a, n)));
				System.out.println("------------------------------------\n");
				break;
			case 3:{
				b=false;
				Thread.sleep(1500);
				System.out.println("*************Thank You*************");
				break;}

			default:
				Thread.sleep(1500);
				System.out.println("Enter valid input");
				break;	
			}
		} while (b);
		
	}

	public static int[] sort(int a[], int n) {

		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-1; j++) {
				if (n == 1) {
					if (a[j] > a[j + 1]) {
						temp = a[j];
						a[j] = a[j + 1];
						a[j + 1] = temp;
					}
				} else {

					if (a[j] < a[j + 1]) {
						temp = a[j];
						a[j] = a[j + 1];
						a[j + 1] = temp;
					}

				}
			}
		}

		return a;

	}
		
	}


