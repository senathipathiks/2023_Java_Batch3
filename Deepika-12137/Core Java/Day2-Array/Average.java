package Day2;
import java.util.*;
public class Average {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the 1st value : ");
	int v1=sc.nextInt();
	System.out.println("Enter the 2nd value : ");
	int v2=sc.nextInt();
	System.out.println("Enter the 3rd value : ");
	int v3=sc.nextInt();
	double total = (v1+v2+v3)/3;
	System.out.println("Th total average is : "+total);
	
	
}
}
