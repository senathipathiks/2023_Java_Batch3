package Com.Day10;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetEg {
//it follows random order for ascending order we can use treeset
	public static void main(String[] args) {
		 
		HashSet <String> set=new HashSet<String>();
		set.add("kp");
		set.add("jk");
		set.add("lo");
		set.add("bn");
		set.add("nm");
		System.out.println(set);
        System.out.println("-------------");
        
        set.remove("lo");
        System.out.println(set);
        System.out.println("-------------");
        
        System.out.println(set.size());

        System.out.println("-------------");

        for (String i : set) {
			System.out.println(i);
		}
        
        System.out.println("-------------");

        Iterator <String> it=set.iterator();
        while(it.hasNext()) {
        	System.out.println(it.next());
        }


	}

}
