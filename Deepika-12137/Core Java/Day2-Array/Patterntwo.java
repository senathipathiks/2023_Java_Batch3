package Day2;
import java.util.*;
public class Patterntwo {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter the matrix length : ");
		int input=sc.nextInt();
		
		for (int i = 0; i < input; i++) {
			for (int j = 0; j < input; j++) {
				if (i==0 && (input-1%2==0) || input%2==0 ) {
					System.out.print("*");	
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println("");
			
		}
		
	}
}
