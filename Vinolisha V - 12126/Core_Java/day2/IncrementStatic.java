package com.day2;

class SampleStatic{
	 static int x=1;
	void increment() {
		x++;
	}
}

public class IncrementStatic {

	public static void main(String[] args) {
		SampleStatic obj=new SampleStatic();
		obj.increment();
		System.out.println(obj.x); //2
		
		SampleStatic obj1=new SampleStatic();
		System.out.println(obj1.x); //1
//for(int i=0; ; i++)  if you want to run without condition 
	}

}
