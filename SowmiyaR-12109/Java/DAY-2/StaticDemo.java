package Day2;

class StaticEx{
	 int x=1;
//	 static int x=1;
	void increment()
	{
		x++;
		}
}
public class StaticDemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    StaticEx obj=new StaticEx();
    obj.increment();
    System.out.println(obj.x);
    StaticEx obj1=new StaticEx();
//    obj1.increment();
    System.out.println(obj1.x);
    
	}

}
