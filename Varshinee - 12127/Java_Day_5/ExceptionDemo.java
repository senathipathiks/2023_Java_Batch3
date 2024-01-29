package Java_Day_5;
import java.util.*;
public class ExceptionDemo {

	public static void main(String[] args) {
		int a=10,b=0;
		try {
		int c=a/b;}
		catch(Exception e) {
		System.out.println(e);
		}
		System.out.println(a);
	}

}
