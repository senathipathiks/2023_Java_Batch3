package Day6;
import java.util.*;
public class LambdaExpression1 {

	public static void main(String[] args) {
	HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the length: ");
	int l = sc.nextInt();
	System.out.println("Enter the key and value: ");
	for(int i=0;i<l;i++) {
		int key = sc.nextInt();
		int value=sc.nextInt();
		map.put(key, value);}
	System.out.println("Iterating using forEach: ");
    map.keySet().forEach((i)->System.out.print(i+" "+map.get(i)));	}

}
