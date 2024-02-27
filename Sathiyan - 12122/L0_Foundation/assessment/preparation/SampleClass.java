package com.assessment.preparation;

/*
 * Create three interfaces, each with two methods. Inherit a new interface from the three,
adding a new method. Create a class by implementing the new interface and also
inheriting from a concrete class. Now write four methods, each of which takes one of the
four interfaces as an argument. In main ( ), create an object of your class and pass it to
each of the methods.
 */

interface Class1{
	void method1();
	void method2();
}

interface Class2{
	void method1();
	void method2();
}

interface Class3{
	void method1();
	void method2();
}

interface Class4 extends Class1,Class2,Class3{
	void method3();
}


class ConcreteClass {
    void method4(Class1 interface1) {
        interface1.method1();
        interface1.method2();
    }
}

class MyClass extends ConcreteClass implements Class4 {
    public void method3() {
        System.out.println("Method 3");
    }

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}
}

public class SampleClass {
    static void method1(Class1 interface1) {
        interface1.method1();
    }

    static void method2(Class2 interface2) {
        interface2.method2();
    }

    static void method3(Class3 interface3) {
        interface3.method1();
    }

    static void method4(Class4 interface4) {
        new ConcreteClass().method4(interface4);
    }
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MyClass obj = new MyClass();
	        method1(obj);
	        method2(obj);
	        method3(obj);
	        method4(obj);

	}

   
}

