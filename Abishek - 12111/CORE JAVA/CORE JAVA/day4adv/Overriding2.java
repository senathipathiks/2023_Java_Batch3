package com.day4adv;


class Basee1{
	void display()
	{
		System.out.println("base");
	}
	
}
class Derivedd3 extends Basee1
{
	void display()
	{
		System.out.println("Derived 1");
	}
}
class Derived4 extends Basee1
{
	void display()
	{
		System.out.println("Derived 2");
	}
}

public class Overriding2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Basee1 obj = new Basee1();
		obj.display();

		Basee1 obj1 = new Derivedd3();//upcasting
		obj1.display();

		Basee1 obj2 = new Derived4();
		obj2.display();
		System.out.println(obj2 instanceof Basee1);
	}

}
