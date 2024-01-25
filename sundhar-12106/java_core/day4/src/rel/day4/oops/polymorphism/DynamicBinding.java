package rel.day4.oops.polymorphism;

class Base{
  void display() {
	  System.out.println("display from base class");
  }	
}

class Derived extends Base{
	  void display() {
		  System.out.println("display from derived class");
	  }	
	}


public class DynamicBinding {
	
	
	public static void main(String[] args) {
		
		Base b = new Base();
		b.display();
		
		Base d1 = new Derived(); //upcasting
		d1.display();
		
		Derived d2 = (Derived) d1; //downcasting
		
		d2.display();
	}

}
