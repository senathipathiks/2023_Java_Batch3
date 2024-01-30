package core.day2;

public class Divisible {

	public static void main(String[] args) {
		   
		    for (int i = 1; i < 100; i++) {
		      if (i % 3 == 0) System.out.print(i + ", ");
		    }

		    System.out.println("\n\nDivided by 5:");
		    for (int i = 1; i < 100; i++) {
		      if (i % 5 == 0) System.out.print(i + ", ");
		    }

		   
		    System.out.println("\n\nDivided by 3 & 5:");
		    for (int i = 1; i < 100; i++) {
		      if (i % 3 == 0 && i % 5 == 0) System.out.print(i + ", ");
		    }
		    System.out.println("\n");
		  }
		

	}


