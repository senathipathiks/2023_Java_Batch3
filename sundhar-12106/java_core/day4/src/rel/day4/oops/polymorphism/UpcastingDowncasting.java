package rel.day4.oops.polymorphism;

class A{
	int a = 5;
}

class B extends A{
	int a = 10;
}

class C extends B{
	int a = 15;
}

public class UpcastingDowncasting {
	
	public static void main(String[] args) {
		
		A a=new A();
		
		A c = new B(); //Upcasting the processing of storing child class reference in parent type of constructor
		
//		C c1 = c; //Downcasting is not possible implicitly
		
//		C c1 = (C) c; //So we are downCasting explicitly
		
		if(new A() instanceof C) {
		        C c2=(C) a;//
		        System.out.println("hello");
		}
	}
	

}
