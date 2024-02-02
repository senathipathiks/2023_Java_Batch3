package Day10Collections;

import java.util.Iterator;
import java.util.Stack;

public class stack1 {

	public static void main(String[] args) {
		
		Stack<Integer> s=new Stack<Integer>();
		
		s.push(10);s.push(20);s.push(30);s.push(40);s.push(50);
		s.push(60);s.push(70);s.push(80);s.push(90);s.push(100);
		
		System.out.println(s);

		System.out.println(s.get(4));
		
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s);
//		s.clear();
		System.out.println(s);
		
		// to iterate the elements using normal for loop
				System.out.println("to iterate the elements using normal for loop"+"\n");
				for (int i=0; i<s.size();i++) {
					System.out.print(" "+s.get(i));
				}
				// to iterate the elements using  for each loop
				System.out.println("to iterate the elements using  for each  loop"+"\n");
				for(Integer i:s) {
					System.out.print(" "+i);
				}
				// to iterate the elements using  Iterator 
				System.out.println("to iterate the elements using  Iterator "+"\n");
				Iterator<Integer> itr=s.iterator();
				while(itr.hasNext()) {
					System.out.print(" "+itr.next()+"");
				}
	}

}
