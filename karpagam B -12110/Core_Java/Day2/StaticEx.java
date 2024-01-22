package Com.Day2;

class StaticExample{
	static int x=1; // static variable
 // int x=1; // instance variable

	int a=2;
	int b=3;
	
	void increment() {
		x++;
		System.out.println(a<b);//Comparison operator return boolean value
	}
}

public class StaticEx {

	public static void main(String[] args) {
           StaticExample obj1=new StaticExample();
           obj1.increment();
           System.out.println(obj1.x);
           
           StaticExample obj2=new StaticExample();
           System.out.println(obj2.x);

           

           }

}
