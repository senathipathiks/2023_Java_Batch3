package com.oops2;
import java.lang.Object;

public class StringRide {
	
    //override
	public String toString() {   //if override to string is not used then hashcode value will be displayed.
		 return "My object";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringRide obj1 = new StringRide();
System.out.println(obj1);
	}

}
