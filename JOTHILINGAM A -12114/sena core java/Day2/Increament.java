package Day2;

import java.util.Iterator;

public class Increament {
	static int x=1;   // if Increament is not available op will 2 and 1
	void increament() {
		x++;
	}

	public static void main(String[] args) {
		
		//System.out.println("hi");
		
		Increament s=new Increament();
		s.increament();
		System.out.println(s.x);
		
		Increament s1=new Increament();
		System.out.println(s1.x);
		
		
//		for(int i=0 ; ; i++) {
//							  /// for loop can write the syntax 
//	}
		
		
		

}
}