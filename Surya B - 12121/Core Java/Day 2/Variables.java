package com.coreDay2;

public class Variables {
	int x = 1;
	//static int x = 1;
	void increment() {
		x++;
	}
	
	public static void main(String[] args) {
		// Difference between Static and Instance
		
		Variables v = new Variables();
		v.increment();
		System.out.println(v.x);
		
		Variables v1 = new Variables();
		System.out.println(v1.x);
		


}
}
