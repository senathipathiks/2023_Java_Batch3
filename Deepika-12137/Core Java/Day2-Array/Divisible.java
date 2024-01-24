package Day2;

public class Divisible {
public static void main(String[] args) {
	for (int i = 1; i <= 100; i++) {
		if (i%3==0 && i%5==0) {
		System.out.println(i + " is divided by both 3 and 5");	
		}
		else if (i%3 == 0) {
			System.out.println(i + " is divided by  3 ");
		} else if(i%5 == 0) {
			System.out.println(i + " is divided by  5");
		}
		
	}
}
}
