package Day2;
import java.util.*;
public class Calculation {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the 1st value");
	int a= sc.nextInt();
	System.out.println("Enter the 2nd value");
	int b=sc.nextInt();
	int c=a+b;
	int d=a-b;
	int e=a*b;
	int f=a/b;
	int g=a%b;
	System.out.println("Addition : "+c);
	System.out.println("Subtraction : "+d);
	System.out.println("Multipling : "+e);
	System.out.println("Divide : "+f);
	System.out.println("Remainder : "+g);
	
	
}
}
