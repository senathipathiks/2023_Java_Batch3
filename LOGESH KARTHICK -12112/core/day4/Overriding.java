package core.day4;

	class Base
	{
	    void display() {
	        System.out.println("Base");
	    }
	}

	class Derived1 extends Base {
	    void display() {
	        System.out.println("derived 1");
	    }
	}

	class Derived2 extends Base {
	    void display() {
	        System.out.println("dervied 2");
	    }

	}

	public class Overriding {
	    public static void main(String[] args) {

	        Base obj = new Base();
	        obj.display();

	        Base obj1 = new Derived1();// upcasting
	        obj1.display();

	        Base obj2 = new Derived2();
	        obj2.display();

	        System.out.println(obj2 instanceof Base);

	    }

	}



