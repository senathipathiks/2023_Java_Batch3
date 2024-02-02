package Day4;


class A{
	public A() {
		System.out.println("class A");
	}
}
class b extends A{
	public b() {
	System.out.println("class B");
	}
	b(int x){
		System.out.println("class B-1");
	}
}

class c extends b{
	public c() {
	System.out.println("class C-1");
	}
	c(int x){
		super(x);
		System.out.println("class C-1");
	}
}

public class Inheritance2 {

	public static void main(String[] args) {
		c c1=new c(5);
		

	}

}
