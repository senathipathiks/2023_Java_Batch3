package com.Day6;
interface java8{
	default void m1() {
		System.out.println("hello");
	}
	public void m2();
	public static void m3() {
		
	}
}
public class interfaceJavaFeature8 implements java8{
    public void m2() {
    	System.out.println("hello");
    }
    
    
	@Override
	public void m1() {
		System.out.println("hello");
	}


	public static void main(String[] args) {
		interfaceJavaFeature8 i = new interfaceJavaFeature8();
		i.m2();
		java8.m3();
		i.m1();
	    

	}
	

}
