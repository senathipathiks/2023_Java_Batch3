package Day4;
class Base{
	void display() {
		System.out.println("Base");

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


public class OverridingEx {
	

	public static void main(String[] args) {
		
		Base obj = new Base();
        obj.display();

        Base obj1 = new Derived1();//upcasting
        obj1.display();

        Base obj2 = new Derived2();
        obj2.display();
        
        System.out.println(obj2 instanceof Base);
	}

}
