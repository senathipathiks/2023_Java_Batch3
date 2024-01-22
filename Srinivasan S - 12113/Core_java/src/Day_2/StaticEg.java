package Day_2;

public class StaticEg {
	static int x=1;
	
	void increment() {
		x++;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticEg s1=new StaticEg();
		s1.increment();
		System.out.println(x);
		
		StaticEg s2=new StaticEg();
		System.out.println(x);
		
	}

}
