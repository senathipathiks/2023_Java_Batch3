package Java_Day_10;
import java.util.*;
public class StackEx {

	public static void main(String[] args) {
		Stack<String> st=new Stack<String>();
		st.push("Varshinee");
		st.push("Appu");
		st.push("Sandy");
		st.push("Subi");
		System.out.println(st);
		st.addAll(st);
		System.out.println(st);
		//remove
		System.out.println(st.pop());
		//peek
		System.out.println(st.peek());
		//get
		System.out.println(st.get(1));
		
		

	}

}
