package Day4.ClassExamples;
class Base{
	void display() {
		System.out.println("Parrent(Base)");
	}
}
class Derrived1 extends Base{
	void display() {
		System.out.println("Child1 or Derrived1");
	}
	
}

class Derrived2 extends Base
{
	void display() {
		System.out.println("Child2 or Derrived2");
	}
}

public class PolyOverloadingEx2 {

	public static void main(String[] args) {
		 Base obj = new Base();
		 obj.display();
		 
		 Base obj1 = new Derrived1();
		 obj1.display();
		 
		 Base obj2= new Derrived2();
		 obj2.display();
		 
	}

}