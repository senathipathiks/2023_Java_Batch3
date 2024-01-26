package com.day2;

public class MethodOverRidding {
	{
		System.out.println(1);
	}
	{
		System.out.println(2);
	}
	
    @Override
    public String toString() {
    	System.out.println(3);
    	return "hi object";
    }
	public static void main(String[] args) {
		MethodOverRidding hi =new MethodOverRidding();
		System.out.println(hi);
		System.out.println(hi.hashCode());

	}

}
