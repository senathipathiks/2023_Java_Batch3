package Day3.StringTasks;
import java.util.*;
public class ReverseWord {

	 
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the word to reverse:");
	        String word = sc.next();
	        StringBuffer sb = new StringBuffer(word);
	        sb.reverse();
	        System.out.println("Reversed word: " + sb.toString());
	    }

}
