package Day10Collections;

import java.util.HashSet;
import java.util.Iterator;



public class set1 {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		
		hs.add("jothi");hs.add("abi");hs.add("sundar");hs.add("kir");
		hs.add("srini");hs.add("logesh");hs.add("hems");
		
		System.out.println(hs);
		
		hs.remove("jothi");
		System.out.println(hs);
		System.out.println(hs.size());
		
		   for(String i:hs)
	        {
	            System.out.println(i);
	        }
	        
	        
		   Iterator <String> it=hs.iterator();
		   System.out.println(it.hasNext());
	        
	    while(it.hasNext())
	    {
	        System.out.println(it.next() +"ghj");
	    }
		
	}

}
