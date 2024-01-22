package Day_2;

public class Divisible {

	public static void main(String[] args) {
		System.out.println("Numbers divide by 3 are :");
		for (int i = 1; i < 100; i++) {
			if (i%3==0) {
				System.out.println(i);
			}
		}
		System.out.println("Numbers divide by 5 are :");
		for (int i = 1; i < 100; i++) {
			if (i%5==0) {
				System.out.println(i);
			}
		}
		System.out.println("Numbers divide by 3 and 5 are :");
		for (int i = 1; i < 100; i++) {
			if (i%3==0 && i%5==0) {
				System.out.println(i);
			}
		}
	}

}
