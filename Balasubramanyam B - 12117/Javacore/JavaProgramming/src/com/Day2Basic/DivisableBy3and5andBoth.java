package com.Day2Basic;

public class DivisableBy3and5andBoth {

	public static void main(String[] args) {
		 System.out.println("\nDivided by 3: ");
	        for (int i = 1; i < 100; i++) {
	            if (i % 3 == 0)
	                System.out.print(i + ", ");
	        }

	        // Print numbers divided by 5
	        System.out.println("\n\nDivided by 5: ");
	        for (int i = 1; i < 100; i++) {
	            if (i % 5 == 0)
	                System.out.print(i + ", ");
	        }

	        // Print numbers divided by both 3 and 5
	        System.out.println("\n\nDivided by 3 & 5: ");
	        for (int i = 1; i < 100; i++) {
	            if (i % 3 == 0 && i % 5 == 0)
	                System.out.print(i + ", ");
	        }
	        System.out.println("\n");
	    }

}
