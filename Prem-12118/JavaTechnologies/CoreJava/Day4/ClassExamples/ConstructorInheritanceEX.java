package Day4.ClassExamples;

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

class C extends B {
	C(){
		System.out.println("Class C");
	}
	C(int x){
		super(x);
		System.out.println("Class C-1");
	}
}

class ConstructorInheritanceEX {

	public static void main(String[] args) {
		 C obj = new C (1);
		 

	}

}
