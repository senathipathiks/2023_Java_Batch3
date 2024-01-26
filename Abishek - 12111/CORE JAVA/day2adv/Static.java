package com.day2adv;
class Sample 
{
	int x = 1;
	void increment()
	{
		x++;
	}
}
public class Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample obj = new Sample();
		obj.increment();
		System.out.println(obj.x);
		Sample obj1 = new Sample();
		System.out.println(obj1.x);
		}

}
