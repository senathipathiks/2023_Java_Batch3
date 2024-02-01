package Day10;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  LinkedList<String> list=new LinkedList<String>();
  list.add("Sowmi");
  list.add("Kanish");
  list.add("Hari");
  list.add("Kiran");
  System.out.println(list);
  list.addAll(list);
  System.out.println(list);
  Collections.sort(list);
  System.out.println(list);
  list.remove(1);
  System.out.println(list);
  System.out.println(list.get(4));
  
  for(int i=0;i<list.size();i++) {
	  System.out.print(list.get(i)+" ");
  }
  System.out.println();
  for(String i:list)
  {
	  System.out.print(i+" ");
  }
  System.out.println();
  Iterator<String> it=list.iterator();
  while(it.hasNext())
  {
	  System.out.print(it.next()+" ");
  }
  
	}

}
