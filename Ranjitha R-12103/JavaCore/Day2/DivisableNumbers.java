//Write a Java program to print numbers between 1 and 100 divisible by 3, 5 and both.
package Day2;

public class DivisableNumbers {

	public static void main(String[] args) {
		System.out.println("Numbers divisible by 3 is:");
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("Numbers divisible by 5 is: ");
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("Numbers divisible by both 3 & 5 is: ");
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i);
			}
		}
	}

}
