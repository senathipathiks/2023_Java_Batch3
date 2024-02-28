package Day2;
import java.util.*;

public class Multiplications {

	public static void main(String[] args) {
		 System.out.println("Enter the number which you want to multiplications upto 10");
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 System.out.println("The multiplication of"+n+"is:");
		 for(int i=1;i<=10;i++) {
			 System.out.println(i+"X"+n+"="+i*n);
			
	}

}
}