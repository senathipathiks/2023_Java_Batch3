package Day2;

public class Divisible3and5 {

	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++) {
			if(i % 3==0 && i % 5==0) {
				System.out.println("between 1 to 100 divisible 3 & 5 ="+ i);
			}
//			System.out.println("between 1 to 100 divisible 3 & 5 ="+ i);
		}
		
	}

}
