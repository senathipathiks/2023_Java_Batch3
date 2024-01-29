package day1;
	class Base{
		void display() {
			System.out.println("Base");
		}
	}
	class Derived extends Base{
		void display() {
			System.out.println("Derived");
		}
	}
	class Derived2 extends Base{
		void display() {
			System.out.println("Derived 2");
		}
	}
	public class Overridingex {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base b=new Base();
		b.display();
		Base b1=new Derived();
		b1.display();
		Base b2=new Derived2();
		b2.display();
		System.out.println(b instanceof Base);

	}

}
