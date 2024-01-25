package Com.Day4;

class A{
	A(){
		System.out.println("Class A");
	}
	
}
class B extends A{
	B(){
		System.out.println("Class B");
	}
	B(int x){
		System.out.println("Class B-1");
	}
}
class C extends B{
	C(){
		System.out.println("Class c");
	}
	C(int x){
		super(x);
		System.out.println("Class C-1");
	}
	
	
}
public class InheritanceConstructorEg1 {

	public static void main(String[] args) {
		C obj1=new C(2);
	

	}

}
