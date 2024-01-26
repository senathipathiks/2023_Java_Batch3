package Day_1;

public class StaticEx {
	
	int x = 1;
	
	void inc() {
		x++;
	}

	public static void main(String[] args) {
		StaticEx e = new StaticEx();
		System.out.println(e.x);
		
		StaticEx ex = new StaticEx();
		ex.inc();
		System.out.println(ex.x);
		int a = 1;
		int b = 2;
		System.out.println(a<b);
		
//		for(int i = 10;i <= 5;) {
//			System.out.println(i);
//		}
//		
	}

}
