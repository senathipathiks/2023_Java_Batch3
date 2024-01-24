package Day2;
import java.util.*;
public class MultiplyTable {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value to be multiplied");
	int val=sc.nextInt();
	System.out.println("enter the table");
	int v=sc.nextInt();
	for(int i=1;i<=val;i++) {
		System.out.println(i+" * "+v +" = " +(i*v));
	}
	
}
}
