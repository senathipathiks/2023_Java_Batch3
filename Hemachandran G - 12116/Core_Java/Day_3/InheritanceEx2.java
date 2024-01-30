package Day_3;


class A{
	A(){
		System.out.println("Class A !!");
	}
}

class B extends A{
	B(){
		System.out.println("Class B !!");
	}
	
	B(int x){
		System.out.println("Class B-1 !!");
	}
}

class C extends B{
	C(){
		System.out.println("Class C !!");
	}
	
	C(int x){
		super(x);
		System.out.println("Class C-1 !!");
	}
}
public class InheritanceEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C obj = new C();

	}

}
