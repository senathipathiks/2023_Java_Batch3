package com.day8;

public class OverridingToString {
	
	{
		System.out.println("This is an Instance Block");
	}
	
	public OverridingToString() {
		System.out.println("This is Constructor");
	}
  @Override
public String toString() {
	  System.out.println("This is a Method to Override toString");
	return "My Object";
}
	public static void main(String[] args) {
	
		OverridingToString obj = new OverridingToString();
		System.out.println(obj);
	}

}
