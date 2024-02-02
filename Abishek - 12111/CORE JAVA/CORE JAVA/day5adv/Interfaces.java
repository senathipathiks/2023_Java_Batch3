package com.day5adv;
interface A
{
	void interesting();
	
}
class B implements A
{
	public void interesting()
	{
		System.out.println("print B");
	}
}
class C implements A
{
	public void interesting()
	{
		System.out.println("Print C");
	}
}
class D implements A
{

	@Override
	public void interesting() {
		// TODO Auto-generated method stub
		System.out.println("print D");
	}
	
}
public class Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D obj = new D();
		obj.interesting();

		C obj1 = new C();
		obj1.interesting();

	}

}
