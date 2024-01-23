package day2;

class StaticEx{
	static int
	x = 5;
	
	void increment() {
		x++;
	}
}

public class StaticDemo {
	
	 public static void main(String[] args) {
		
		 StaticEx ob = new StaticEx(); 
		 System.out.println(ob.x);
		 ob.increment();
		 System.out.println(ob.x);
		 
		 StaticEx ob1 = new StaticEx();
		 System.out.println(ob.x);
		 
		 System.out.println(2<3);
		 
		 for (int i = 0; ;) {
			System.out.println(i);
		}
	}

}
