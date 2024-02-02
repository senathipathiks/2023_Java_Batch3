package Day10;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<Integer> set=new TreeSet<Integer>();
set.add(20);
set.add(10);
set.add(40);
set.add(30);
set.add(30);
System.out.println(set);
set.remove(2);
System.out.println(set);
System.out.println(set.size());

for (Integer i : set) {
	System.out.print(i+" ");
}

System.out.println();

Iterator<Integer> it = set.iterator();
while (it.hasNext()) {
	System.out.print(it.next()+" ");
}
	}

}
