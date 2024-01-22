//2. Write a Java program that takes a number as input and 
//prints its multiplication table up to 10.
package Day2;
import java.util.Scanner;
public class Tables {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number? ");
		int a=sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(a+"x"+i+"="+(a*i));
		    }
		
				

	}

}
