package Java_Day_2;

public class StaticEx {
	static int x=1;
	//int x=1;
	void increment()
	{
		x++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticEx obj=new StaticEx();
		obj.increment();
		System.out.println(obj.x);
		StaticEx obj1=new StaticEx();
		System.out.println(obj1.x);
	}

}
