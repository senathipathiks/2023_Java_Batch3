package day2;

public class Pattern4 {

	public static void main(String[] args) {

		int a = 1;

		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 4; j++) {
				System.out.print(" "+a++);

			}

			if (i == 0 || i == 3) {
				a += 4;
			} else if (i == 2) {
				a -= 4;
			}
			System.out.println();
		}
		

	}
}
