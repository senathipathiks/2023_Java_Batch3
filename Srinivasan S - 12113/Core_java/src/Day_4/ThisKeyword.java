package Day_4;

public class ThisKeyword {
	int a;
	String b;
	static int count;
	
	public ThisKeyword() {
		this(1,"sri");
		System.out.println("default");
	}
	
	public ThisKeyword(int a, String b) {
		this.Display();
		this.a = a;
		this.b = b;
		System.out.println(a );
		System.out.println(b );
	}
	
	void Display() {
		System.out.println("This is method");
	}
	
	static int increment() {
		return ++count;
		
	}


	public static void main(String[] args) {
		ThisKeyword t=new ThisKeyword();
		System.out.println(" count is "+ t.increment());
		
		ThisKeyword t1=new ThisKeyword(6,"Legend");
		
		System.out.println(" count is "+ ThisKeyword.increment());
//		System.out.println(t1);

	}

}
