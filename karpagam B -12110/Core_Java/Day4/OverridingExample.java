package Com.Day4;
//method overriding
class Base {
	void display() {
		System.out.println("Base class");
	}
	
}
class Derived1 extends Base{
	void display() {
		System.out.println("Derived 1");
	}


}
class Derived2 extends Base{
	void display() {
		System.out.println("Derived 2");
	}
}



public class OverridingExample {

	public static void main(String[] args) {
		Base obj1=new Base();
		obj1.display();
		
		Base obj2=new Derived1();//upcasting --child to parent
		obj2.display();
		
		Base obj3=new Derived2();
		obj3.display();
		
//		Derived2 obj4=(Derived2) new Base();//downcasting--parent to child
//		obj4.display();
		
		System.out.println(obj3 instanceof Base);//check obj2 is derived from Base or not 
		
        
	}

}
