package Day_2;

import java.util.Iterator;

/*
 *  Write a Java program to display the following patterns.

*
**
***
****
*****
*
 */
public class LeftTriangle {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
