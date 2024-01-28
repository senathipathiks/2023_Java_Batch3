package com.day2;
class staticdemo{
	static int x=1;
	void increment()
	{
		x++;
	}
}
public class staticprogrm {

	public static void main(String[] args) {
staticdemo obj=new staticdemo();
obj.increment();
System.out.println(obj.x);
staticdemo obj1=new staticdemo();
System.out.println(obj1.x);

	}

}
