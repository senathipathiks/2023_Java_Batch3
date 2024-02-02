package com.day12;

interface Interface1{
	void method1();
	void method2();
}
interface Interface2{
	void method1();
	void method2();
}
interface Interface3{
	void method1();
	void method2();
}

interface Interface4 extends Interface1,Interface2,Interface3{
	void method3();
}

class ConcreteClass{
	public ConcreteClass() {
		System.out.println("This is a Concrete Class");
	}
}

public class MainClass2 extends ConcreteClass implements Interface4 {

	@Override
	public void method1() 
	{
	}

	@Override
	public void method2()
	{
		
	}
	@Override
	public void method3() 
	{
		
	}
	
	void newMethod1(Interface1 obj) {
		System.out.println("This is Interface 1");
	}
	
	void newMethod2(Interface2 obj) {
		System.out.println("This is Interface 2");
	}
	
	void newMethod3(Interface3 obj) {
		System.out.println("This is Interface 3");
	}
	
	void newMethod4(Interface4 obj) {
		System.out.println("This is Interface ");
	}

	public static void main(String[] args) {
	 MainClass2 obj = new MainClass2();
	 obj.newMethod1(obj);
	 obj.newMethod2(obj);
	 obj.newMethod3(obj);
	 obj.newMethod4(obj);

	}

}
