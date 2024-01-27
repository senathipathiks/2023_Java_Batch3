package Day_4;

class A{
	A(){
		System.out.println("A");
	};
}

class B extends A{
	B(){
		System.out.println("B");
	}
	
	B(int x){
		System.out.println("B1");
	}
}

class C extends B{
	C(){
		System.out.println("C");	
	}
	C(int x){
		super(x);
		System.out.println("C1");
	}
	
}

public class InheritanceConstEg1 {

	public static void main(String[] args) {
		C c=new C(2);

	}

}
