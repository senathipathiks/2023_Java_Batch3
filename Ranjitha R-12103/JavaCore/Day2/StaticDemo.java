package Day2;

class StaticEx {
	int x = 1;

	// static int x=1;
	void increment() {
		x++;
	}
}

public class StaticDemo {
	public static void main(String[] args) {
		StaticEx obj1 = new StaticEx();
		obj1.increment();
		System.out.println(obj1.x);
		StaticEx obj2 = new StaticEx();
		System.out.println(obj2.x);
	}
}
