package Day2;

class StaticEx2{
	 int x=1;
	void increment() {
		x++;
	}
}
public class StaticDemo2 {
	public static void main(String[] args) {
		StaticEx2 obj=new StaticEx2();
		obj.increment();
		System.out.println(obj.x);
		StaticEx2 obj1=new StaticEx2();
		System.out.println(obj1.x);
		
	}
}

