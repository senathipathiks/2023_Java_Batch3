package day5collection;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Stack<String> s=new Stack<String>();
             s.push("hema");
             s.push("ruby");
             s.push("stephen");
             s.push("richard");
             s.push("john paul");
             System.out.println(s);
             
             s.pop();//removes last in first out
             System.out.println(s);//removes johnpaul
             System.out.println(s.peek());//shows top of the element
             
             System.out.println(s.get(0));
	}

}
