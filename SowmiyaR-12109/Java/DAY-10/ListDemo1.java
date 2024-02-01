package Day10;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;

public class ListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<Integer> arr=new ArrayList<Integer>();
       arr.add(10);
       arr.add(20);
       arr.add(40);
       arr.add(30);
       arr.addAll(arr);
       System.out.println(arr);
     Collections.sort(arr);
     System.out.println(arr);
     arr.remove(4);
     System.out.println(arr);
//     arr.get(2);
     System.out.println(arr.get(2));
//     arr.clear();
//     System.out.println(arr);
     
     //for loop
     for(int i=0;i<arr.size();i++) {
    	 System.out.print(arr.get(i)+" "); 
     }
     System.out.println();
     
     for(Integer i:arr) {
    	 System.out.print(i+" ");
     }
     //
     System.out.println();
     Iterator<Integer> itr=arr.iterator();
      while(itr.hasNext())
      {
    	  System.out.print(itr.next()+" ");
      }
  }

}
