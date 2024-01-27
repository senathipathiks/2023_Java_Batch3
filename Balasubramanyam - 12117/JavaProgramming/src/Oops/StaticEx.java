package com.Oops;

public class StaticEx {
    static int x=1,a=2,b=4;
    void increment() {
    	x++;
    }
    public static void main(String[] args) {
    	StaticEx obj = new StaticEx();
    	obj.increment();
    	System.out.println(obj.x);
    	StaticEx obj1 = new StaticEx();
    	System.out.println(obj1.x);
    	System.out.println(a<b);
    	while(true) {
    		System.out.println(1<4);
    		break;
    	}
    	for( ; ;) {
    	}
	}
}
